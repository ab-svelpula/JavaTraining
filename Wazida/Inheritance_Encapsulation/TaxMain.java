package inheritance_encapsulation;

public class TaxMain {
	public static void main(String[] args) {
        IncomeTax incomeTax = new IncomeTax(750000);
        GSTTax gstTax = new GSTTax(20000, 18); // 18% GST

        System.out.println("Income Tax Calculation:");
        incomeTax.showTaxDetails();

        System.out.println("\nGST Tax Calculation:");
        gstTax.showTaxDetails();
    }

}
