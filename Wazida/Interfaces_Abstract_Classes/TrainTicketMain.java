package interfaces_abstract_classes;

public class TrainTicketMain {
	public static void main(String[] args)
	{
		Sleeper s = new Sleeper();
		s.TotalFare(300);
		s.calculateTotalFare();
		
		AC a = new AC();
		a.TotalFare(1000);
		a.calculateTotalFare();
		
		General g = new General();
		g.TotalFare(200);
		g.calculateTotalFare();
	}

}
