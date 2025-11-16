package inheritance_encapsulation;

public class ReservationMain {
	public static void main(String[] args) {
        OnlineReservation online = new OnlineReservation("Wazida", 28, "Hyderabad", "ravi@example.com");
        CounterReservation counter = new CounterReservation("Muskan", 13, "Mumbai", "Chennai Central");

        online.bookTicket();
        System.out.println();
        counter.bookTicket();
    }

}
