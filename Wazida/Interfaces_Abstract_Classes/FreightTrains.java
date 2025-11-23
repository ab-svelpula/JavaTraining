package interfaces_abstract_classes;

public class FreightTrains implements TrainOperations{
	int startspeed;
	int endspeed;

	@Override
	public void startTrain() {
		// TODO Auto-generated method stub
		if(startspeed>=0)
			System.out.println("Train started");
		else
			System.out.println("Train not yet started");
		
		
	}

	@Override
	public void stopTrain() {
		// TODO Auto-generated method stub
		if(endspeed==0)
			System.out.println("Train arrived at destination");
		else
			System.out.println("Train is still running");
	}

	@Override
	public void showTrainDetails() {
		// TODO Auto-generated method stub
		System.out.println("Train details ");
		System.out.println("Train number - 176256");
		System.out.println("Train Name - Freight express");
		System.out.println("Train will run from hyderabad to Kashmir");
		System.out.println("start time - 9:00PM");
		System.out.println("End time - 11PM");
		
	}

}
