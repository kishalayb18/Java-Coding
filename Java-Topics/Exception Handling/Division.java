import java.io.*;

class div
{
	private int a,b;
	
	public div()
	{
		a=1;
		b=1;
	}
	
	public div(int x, int y)
	{
		a=x;
		b=y;
	}
	
	public void read()
	{
		while(true)
		{
			try
			{
				BufferedReader ds=new BufferedReader (new InputStreamReader(System.in));
				
				System.out.print("Enter 1st number: ");
				String s=ds.readLine();
				a=Integer.parseInt(s);
				
				System.out.print("Enter 2nd number: ");
				b=Integer.parseInt(ds.readLine());
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
			
		} 
	}
	
	public void cal() throws ArithmeticException
	{
		double c;
		c=a/b;
		System.out.println("Result: "+c);
	}
}

class Division
{
	public static void main (String[] args) 
	{
		div t=new div();
		t.read();
		try
		{
			t.cal();
		}
		catch(ArithmeticException e2)
		{
			System.out.println("Divided by zero"+e2.getMessage());
			t.read();
			t.cal();
		}
	}
}