import java.util.*;
class Frac
{
	public static int count=0;
	int numerator, denominator;


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
	Scanner ob= new Scanner(System.in);
	System.out.println("Numerator: ");
	numerator=ob.nextInt();	
	System.out.println("Denominator: ");
	denominator=ob.nextInt();
}

int lcm(int a, int b)
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

 public Frac add(Frac f1, Frac f2)
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

class  Fraction
{
	public static void main (String[] args) 
		{
			Frac f1=new Frac();
			f1.read();
			f1.disp();
			
			Frac f2=new Frac();
			f2.read();
			f2.disp();
			
			Frac f3=new Frac();
			
			f3=f3.add(f1,f2);
			f3.disp();
			
		}
}