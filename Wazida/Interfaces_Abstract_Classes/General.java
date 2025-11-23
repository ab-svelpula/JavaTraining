package interfaces_abstract_classes;

public class General extends TrainTicket{

	@Override
	public void calculateTotalFare() {
		// TODO Auto-generated method stub
		System.out.println("Base price is "+fare);
		fare = fare +50;
		System.out.println("General class price is "+fare);//Adding charges for general class
		
	}

}
