import java.io.*;

class myexp extends Exception	//CUSTOMIZE EXCEPTION
{
  	public myexp(String z)
  	{
  		super(z);
  	}
}
class calculation
{
	public static void main (String[] args) 
	{
		try
		{
		double a,b,c=0;
		String op;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print ("Enter 1st no: ");
		a=Double.parseDouble(br.readLine());
		System.out.print ("Enter 2nd no: ");
		b=Double.parseDouble(br.readLine());
		System.out.print ("Enter the operator(+,-,*,/) : ");
		op=br.readLine();
		if(a<b)
		{
		   throw new myexp("1st num has to be greater than 2nd num5");		//throws>with method signature //	throw>object ke throw korbo
		}
		if(op.equals("+")==true)
			c=a+b;
		else if(op.equals("-")==true)
			c=a-b;
		else if(op.equals("*")==true)
			c=a*b;
		else if(op.equals("/")==true)
			c=a/b;
		else
			System.out.println ("Invalid Operator\nSelect one among +,-,*,/");
		
		System.out.println ("Answer : "+c);		
		}
		catch(IOException e1)
		{
			System.out.println (e1.getMessage());
		}
		catch(NumberFormatException e2)
		{
			System.out.println ("Enter a digit");
			System.out.println (e2.getMessage());
		}
		catch(myexp e3)
		{
			System.out.println (e3.getMessage());
		}	
		
	}
}