import java.util.*;
import java.io.*;
class Binary
{
	String k;
	String x="";
	Binary()
	{
		k="";
	}
	
	
	public void read()
	{
		while(true)
		{
			
		try
		{
			BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Enter Binary Number");
		
			k=d.readLine();
			
			for(int i=0;i<k.length();i++)	//Reversing The String
			{
				x=k.charAt(i)+x;
			}
			k=x;
			//System.out.println (">"+k)
			x="";	//Making the x=string empty so that it does not contain the previous value
					// otherwise if we give a string insted of int then it will hold d string input
					//and the while loop won't break 
					//(>>turn on d comment SOP & turn off the x=""; line to see urself)
			
			int n=Integer.parseInt(k);
			break; 		//breaking of while loop only when the string converted into int
		}
		catch(IOException e1)
		{
			System.out.println ("Wrong Input");
		}
		catch(NumberFormatException e2)
		{
			System.out.println ("Please Enter A Binary Number\n");	
		}
		
		}
	}
	
	
	public void decimal()
	{
		
		int m=k.length();
		int sum=0;
		for(int i=0;i<m;i++)
		{
			char z= k.charAt(i);
			if(z=='1')
			{
				int y=(int)Math.pow(2,i);
				sum=sum+y;
			}
		}
		System.out.println (sum);
	}
	
}

class Convert_to_decimal
{
	public static void main (String[] args) {
		Binary ob=new Binary();
		ob.read();
		ob.decimal();		
	}
}