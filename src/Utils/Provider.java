package Utils;

import DAL.Repository;
import Entities.Airline;


import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Provider {

    private Repository repository;

    public Provider(Repository repository) {
        this.repository = repository;
    }

    public List<String> getOnboardedFlights() {




        List<String> airlineList = new ArrayList<String>(); // reads from some configuration
        airlineList.add("SPICEJET"); //should be moved to constants
        return airlineList;

    }

    public AirlineOperations getAirlineOperationsObject(String airline) throws Exception {
        switch (airline) {
            case "SPICEJET":
                return new SpiceJetOperations();
            default:
                throw new UnsupportedOperationException();

        }
    }
}
