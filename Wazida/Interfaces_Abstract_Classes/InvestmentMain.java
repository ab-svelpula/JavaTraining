package interfaces_abstract_classes;

public class InvestmentMain {
	public static void main(String[] args)
	{
		MutualFunds mf = new MutualFunds();
		mf.invest(100000);
		mf.calculateReturns();
		mf.withdraw();
		System.out.println("**********************************");
		FixedDeposit fd = new FixedDeposit();
		fd.invest(300000);
		fd.calculateReturns();
		fd.withdraw();
		System.out.println("**********************************");
		Stocks s = new Stocks();
		s.invest(10000);
		s.calculateReturns();
		s.withdraw();
	}

}
