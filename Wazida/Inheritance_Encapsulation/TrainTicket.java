package inheritance_encapsulation;

public class TrainTicket extends Ticket {
    private String trainNumber;

    public TrainTicket(String passengerName, String destination, String trainNumber) {
        super(passengerName, destination);
        this.trainNumber = trainNumber;
    }

    @Override
    public void bookTicket() {
        System.out.println("Train Ticket Booked:");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Destination: " + destination);
        System.out.println("Train Number: " + trainNumber);
    }

}
