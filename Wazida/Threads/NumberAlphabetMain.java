package threads;

public class NumberAlphabetMain {
	public static void main(String[] args)
	{
		PrintNumber pn = new PrintNumber();
		PrintAlphabet pa = new PrintAlphabet();
		pn.start();
		pa.start();
	}

}
