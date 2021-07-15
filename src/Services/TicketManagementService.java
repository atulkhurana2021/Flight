package Services;

import DAL.Repository;
import Entities.Airline;
import Entities.Flight;
import Utils.AirlineOperations;
import Utils.Provider;
import com.sun.javafx.effect.EffectUtils;
import javafx.concurrent.Task;


import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class TicketManagementService {

    private Provider provider;
    private Repository repository;
    private ThreadPoolExecutor threadPoolExecutor;
    private volatile Flight flight;


    public TicketManagementService(Repository repository, Integer threads) {
        this.repository = repository;
        this.provider = new Provider(repository);
        this.threadPoolExecutor = (ThreadPoolExecutor) (Executors.newFixedThreadPool(threads));
    }

    public Flight GetCheapestTicketPrice(final String originAirport, final String destinationAirport) throws Exception {
        List<String> airlines = provider.getOnboardedFlights();
        Collection<Callable<Object>> callables = new ArrayList<>();
        List<Future<Object>> futureList = null;


        for (final String airline : airlines) {
            Callable<Object> callable = new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    final AirlineOperations airlineOperations = provider.getAirlineOperationsObject(airline);
                    Flight flight = airlineOperations.getCheapestFlight(originAirport, destinationAirport);

                    return flight;
                }
            };
            callables.add(callable);
            futureList = threadPoolExecutor.invokeAll(callables);
        }
        Queue<Future<Object>> futureQueue = new LinkedList<>(futureList);


        while (futureQueue.size() > 0) {
            Future<Object> future = (futureQueue.poll());

            if (future.isDone()) {
                Flight flight1 = (Flight) future.get();
                if (flight == null || flight.getPrice() > flight1.getPrice()) {
                    flight = flight1;

                }
            } else {
                futureQueue.add(future);
            }
        }
        threadPoolExecutor.shutdown();
        if (flight == null) {
            throw new Exception("Flights not available");
        } else {
            return flight;
        }
    }


}


