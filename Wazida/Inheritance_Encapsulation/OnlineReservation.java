package inheritance_encapsulation;

public class OnlineReservation extends Reservation {
    private String email;

    public OnlineReservation(String passengerName, int age, String destination, String email) {
        super(passengerName, age, destination);
        this.email = email;
    }

    @Override
    public void bookTicket() {
        showPassengerDetails();
        System.out.println("Booking Mode: Online");
        System.out.println("Confirmation sent to: " + email);
    }

}
