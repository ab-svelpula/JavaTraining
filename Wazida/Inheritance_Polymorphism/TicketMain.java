package inheritance_encapsulation;

public class TicketMain {
	public static void main(String[] args) {
        TrainTicket train = new TrainTicket("Ravi", "Delhi", "TN123");
        FlightTicket flight = new FlightTicket("Priya", "Mumbai", "AI456", "Business");

        train.bookTicket();
        System.out.println();
        flight.bookTicket();
    }
	

}
