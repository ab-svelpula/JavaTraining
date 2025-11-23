package interfaces_abstract_classes;

public class Sleeper extends TrainTicket{

	@Override
	public void calculateTotalFare() {
		// TODO Auto-generated method stub
		System.out.println("Base price is "+fare);
		fare = fare +200;
		System.out.println("Sleeper class price is "+fare);//Adding charges for sleeper class
		
	}
	

}
