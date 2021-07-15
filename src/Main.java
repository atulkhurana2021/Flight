import DAL.Repository;
import Entities.Flight;
import Services.TicketManagementService;

public class Main {


    public static void main(String[] args) throws Exception {
        Repository repository = new Repository();

        TicketManagementService ticketManagementService = new TicketManagementService(repository, 10);
        Flight flight = ticketManagementService.GetCheapestTicketPrice("ABC","ABD");
        System.out.println(flight);
    }
}
