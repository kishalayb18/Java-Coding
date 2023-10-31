import java.io.*;
import java.util.*;
class Decimal
{
	String k;
	public Decimal()
	{
		k="";
	}
	public Decimal(String a)
	{
		k=a;
	}
	
	public void read()
	{
		try
	 	{
	 		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
	 		System.out.println ("Enter Decimal Number: ");
	 		k=d.readLine();
	 	}
	 	catch(IOException e)
	 	{
	 		System.out.println ("Input Error");
	 	}
	}
	
	public void binary()
	{
		int n=Integer.parseInt(k);
		String b="";
		while(n>0)
		{
				int d=n%2;
				b=d+b;
				n=n/2;
		}
		System.out.println (b);
		
	}
	 
}

class Convert_to_binary
{
	public static void main (String[] args) {
		Decimal ob=new Decimal();
		ob.read();
		ob.binary();
	}

}