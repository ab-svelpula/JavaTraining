package inheritance_encapsulation;

public class Ticket {
	protected String passengerName;
    protected String destination;

    public Ticket(String passengerName, String destination) {
        this.passengerName = passengerName;
        this.destination = destination;
    }

    public void bookTicket() {
        System.out.println("Booking ticket for " + passengerName + " to " + destination);
    }

}
