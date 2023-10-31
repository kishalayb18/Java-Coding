import java.io.*;
import java.util.*;
class Frac
{
	public static int count=0;
	private int numerator, denominator;


	public Frac()
	{
		numerator=0;
		denominator=1;
		count++;
		System.out.println("Fraction "+count);
	}

	public Frac(int a, int b)
	{
		numerator=a;
		denominator=b;
		count++;
		System.out.println("Fraction "+count);
	}

	public void read()
	{
		while(true)
		{
			try
			{
				BufferedReader ds= new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Numerator: ");
				String s=ds.readLine();
				numerator=Integer.parseInt(s);
				
				System.out.print("Denominator: ");
				denominator=Integer.parseInt(ds.readLine());
				
				double r=numerator/denominator;
				break;
			}
			catch(IOException e)
			{
				System.out.println("Input Error "+e.getMessage());
			}
			catch(NumberFormatException e1)
			{
				System.out.println("Invalid Format Type");
			}
			catch(ArithmeticException e2)
			{
				System.out.println("Divided by zero"+e2.getMessage());
			}
		}
	}

	public static int lcm(int a, int b)
	{
		int c,i;
		c=a;
		i=2;
		while(c%b!=0)
		{
			c=a*i;
			i++;
		}
		return (c);
	}

 	public static Frac add(Frac f1, Frac f2)
	{
		Frac f3=new Frac();
		
		int d=lcm(f1.denominator,f2.denominator);
	
		f3.numerator=f1.numerator*(d/f1.denominator)+f2.numerator*(d/f2.denominator);
		f3.denominator=d;
		return f3;
	}

	void disp()
	{
		System.out.println(numerator+"/"+denominator);
	}

}

class Fracexcep
	{
		public static void main (String[] args) 
		{
			Frac f1=new Frac();
			f1.read();
			
			Frac f2=new Frac();
			f2.read();
			

				f1.disp();
				f2.disp();
				
				Frac f3=Frac.add(f1,f2);
				f3.disp();
		}

	}
	
