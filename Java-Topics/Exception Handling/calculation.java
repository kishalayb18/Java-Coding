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
		a=Double.parseDouble(args[0]);	//COMMAND LINE ARGUMENT
		b=Double.parseDouble(args[1]);
		if(a<b)
		{
		   throw new myexp("1st no >= 2nd no");		//throws>with method signature //	throw>object ke throw korbo
		}
		if(args[2].equals("+")==true)
			c=a+b;
		else if(args[2].equals("-")==true)
			c=a-b;
		else if(args[2].equals("*")==true)
			c=a*b;
		else if(args[2].equals("/")==true)
			c=a/b;
		else
			System.out.println ("invalid operator");
		
		System.out.println (c);		
		}
		catch(myexp e1)
		{
			System.out.println (e1.getMessage());
		}	
		
	}
}