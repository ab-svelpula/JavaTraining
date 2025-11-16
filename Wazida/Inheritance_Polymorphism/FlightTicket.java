package inheritance_encapsulation;

public class FlightTicket extends Ticket {
    private String flightNumber;
    private String seatClass;

    public FlightTicket(String passengerName, String destination, String flightNumber, String seatClass) {
        super(passengerName, destination);
        this.flightNumber = flightNumber;
        this.seatClass = seatClass;
    }

    @Override
    public void bookTicket() {
        System.out.println("Flight Ticket Booked:");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Destination: " + destination);
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Seat Class: " + seatClass);
    }

}
