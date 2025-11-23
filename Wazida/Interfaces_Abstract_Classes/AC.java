package interfaces_abstract_classes;

public class AC extends TrainTicket{

	@Override
	public void calculateTotalFare() {
		// TODO Auto-generated method stub
		System.out.println("Base price is "+fare);
		fare = fare +400;
		System.out.println("AC class price is "+fare);//Adding charges for AC class
		
	}
	

}
