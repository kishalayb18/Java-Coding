import java.util.*;

class SOD
{
	private int num;
	public SOD()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print ("Enter the number: ");
		num=sc.nextInt();
	}
	
	public void sumOfDigit()
	{
		int temp=0, sum=0,d=0;
		
		while(num>0)
		{
			d=num%10;
			sum=sum+d;
			num=num/10;			
		}
		System.out.println ("Sum of the digits of the number is: "+sum);
	}
}

class MainSOD
{
	public static void main (String[] args) {
		SOD ob=new SOD();
		ob.sumOfDigit();
	}
}
