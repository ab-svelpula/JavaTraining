package inheritance_encapsulation;

public class VehicleMain {
	public static void main(String[] args) {
        Cab cab = new Cab("Cab Car", 10);
        Bus bus = new Bus("Bus RTC", 10);

        cab.showFareDetails();
        System.out.println();
        bus.showFareDetails();
    }

}
