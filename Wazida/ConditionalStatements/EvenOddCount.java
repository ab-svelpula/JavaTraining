package conditionalStatments;

public class EvenOddCount {
	public static void main(String[] args)
	{
		int n=50;
		int s= 0;
		for(int i=1;i<=n;i++) {
			if(i%2==0)
			{
				s=s+i;
			}
		}
		System.out.println("count of even numbers is "+s);
		int o = 0;
		for(int j=1;j<=50;j++)
		{
			if(j%2!=0)
				o=o+j;
				
		}
		System.out.println("count of odd number is "+o);
	}

}
