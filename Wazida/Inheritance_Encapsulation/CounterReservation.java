package inheritance_encapsulation;

public class CounterReservation extends Reservation {
    private String counterLocation;

    public CounterReservation(String passengerName, int age, String destination, String counterLocation) {
        super(passengerName, age, destination);
        this.counterLocation = counterLocation;
    }

    @Override
    public void bookTicket() {
        showPassengerDetails();
        System.out.println("Booking Mode: Counter");
        System.out.println("Counter Location: " + counterLocation);
    }

}
