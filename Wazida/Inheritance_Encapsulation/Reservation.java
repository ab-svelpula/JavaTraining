package inheritance_encapsulation;

public class Reservation {
	// Base class
	    protected String passengerName;
	    protected int age;
	    protected String destination;

	    public Reservation(String passengerName, int age, String destination) {
	        this.passengerName = passengerName;
	        this.age = age;
	        this.destination = destination;
	    }

	    public void bookTicket() {
	        System.out.println("Booking ticket for " + passengerName + " to " + destination);
	    }

	    public void showPassengerDetails() {
	        System.out.println("Passenger Name: " + passengerName);
	        System.out.println("Age: " + age);
	        System.out.println("Destination: " + destination);
	    }

}
