package interfaces_abstract_classes;

public class MetroTrains implements TrainOperations{
	int startspeed;
	int endspeed;

	@Override
	public void startTrain() {
		// TODO Auto-generated method stub
		if(startspeed>=0)
			System.out.println("Metro started");
		else
			System.out.println("Metro not yet started");
		
		
	}

	@Override
	public void stopTrain() {
		// TODO Auto-generated method stub
		if(endspeed==0)
			System.out.println("Metro arrived at destination");
		else
			System.out.println("Metro is still running");
	}

	@Override
	public void showTrainDetails() {
		// TODO Auto-generated method stub
		System.out.println("Metro details ");
		System.out.println("Metro number - 176256");
		System.out.println("Metro Name - Kachiguda express");
		System.out.println("Metro will run from kachiguda to Raidurg");
		System.out.println("Metro time - 10:00PM");
		System.out.println("Metro time - 12PM");
		
	}

}
