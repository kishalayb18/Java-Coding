import java.io.*;
import java.util.*;
class str
{
	private String s;
	public str()
	{
		s="";
	}
	public str(String t)
	{
		s=t;
	}
	public void read()
	{
		try
		{
			BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter string: ");
			s=d.readLine(); 
		}
		catch(IOException e)
		{
			System.out.println("Input Error");
		}
	}
	public void sort()
	{			
			String y[]=s.split(",");
			for(int i=0;i<y.length-1;i++)
			{
				for(int j=0;j<y.length-i-1;j++)
				{
					if(y[j].compareTo(y[j+1])>0)
					{
						String temp=y[j];
						y[j]=y[j+1];
						y[j+1]=temp;
					}
				}
			}
			System.out.println ("Sorted String is: ");
			for(int i=0;i<y.length;i++)
			{
				System.out.println (y[i]);
				System.out.println ("");
			}
		
		}
		
		public void abb()
		{
			StringTokenizer w=new StringTokenizer(s);
			int n=w.countTokens();
			String y="";
			for(int i=1;i<n;i++)
			{
				String x=w.nextToken();
				y=y+x.charAt(0)+".";
			}
			y=y+w.nextToken();
			System.out.println (y);			
		}
		
	
	
}

class Str_sort
{
	public static void main (String[] args) {
		str ob=new str();
		ob.read();
		ob.sort();
		ob.abb();
	}
}