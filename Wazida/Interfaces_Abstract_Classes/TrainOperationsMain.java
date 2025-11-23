package interfaces_abstract_classes;

public class TrainOperationsMain {
	public static void main(String[] args) {
		PassengerTrains p = new PassengerTrains();
		p.startTrain();
		p.stopTrain();
		p.showTrainDetails();
		System.out.println("****************************************");
		FreightTrains f = new FreightTrains();
		f.startTrain();
		f.stopTrain();
		f.showTrainDetails();
		System.out.println("****************************************");
		MetroTrains m = new MetroTrains();
		m.startTrain();
		m.stopTrain();
		m.showTrainDetails();
	}
	

}
