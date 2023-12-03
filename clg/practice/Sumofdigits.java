//import java.util.*;
class Sumofdigits
{
	int d,s=0,n;
	void sod(int m)
	{
		
		while(m>0)
		{
			d=m%10;
			s=s+d;
			m=m/10;
		}	
			
		System.out.println("The sum of the digit is: ");
		System.out.println(s);
	}
	public static void main(String[] str)
	{
		int d;
		
		Sumofdigits ob=new Sumofdigits();
		int x=Integer.parseInt(str[0]);
	//	Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter the digit");
	//	d=sc.nextInt();
		ob.sod(x);
			
	}
	
}
