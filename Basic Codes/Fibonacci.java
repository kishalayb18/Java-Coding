import java.util.*;

class Fibonacci
{
	private int a=0;
	private int b=1;
	private int c;
	
	
	public void printFibonacciSeries()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print ("Enter The Length Of The Series: ");
		int n=sc.nextInt();
		System.out.println ("\nThe series is:");
		System.out.print (a+"	"+b+"	");
		for(int i=0;i<n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print (c+"	");
		}
	}
}

class MainFibonacci
{
	public static void main (String[] args) {
		Fibonacci ob=new Fibonacci();
		ob.printFibonacciSeries();
	}
}
