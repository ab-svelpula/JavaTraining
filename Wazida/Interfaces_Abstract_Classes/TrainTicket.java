package interfaces_abstract_classes;

public abstract class TrainTicket {
	String passengerName;
	String TicketNuber;
	double fare;
	
	public  void TotalFare(double total) {
		fare = fare +total;
	}
	public abstract void calculateTotalFare();
	

}
