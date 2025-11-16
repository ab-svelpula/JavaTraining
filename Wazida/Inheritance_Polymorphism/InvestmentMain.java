package inheritance_encapsulation;

public class InvestmentMain {
	public static void main(String[] args) {
        MutualFund mf = new MutualFund("Wazida", 100000);
        StockInvestment si = new StockInvestment("Muskan", 100000);

        System.out.println("Mutual Fund Investment:");
        mf.showInvestmentDetails();

        System.out.println("\nStock Investment:");
        si.showInvestmentDetails();
    }
	

}
