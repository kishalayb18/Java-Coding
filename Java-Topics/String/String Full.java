import java.io.*;
import java.util.*;
class str
{
	private String s,r;
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
	
	public void frq()
	{
		s=s.toLowerCase();
		for(int i=97;i<=122;i++)
		{
			char d=(char)i;
			int c=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)==d)
				{
					c++;
				}
			}
			if(c!=0)
			{
				System.out.println(d+" "+c);
			}
		}
	}
	
	public void rev()		//reverse and palindrome checking
	{
		r="";
		String x;
		for(int i=0;i<s.length();i++)
		{
			x=s.substring(i,i+1);
			r=x+r;
		}
		System.out.println("Reverse-> " +r);
		if(r.equals(s)==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
	public void word_cnt()
	{
		try
		{
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter find what string: ");
		String x=d.readLine();
		int c=0;
		
		StringTokenizer st=new StringTokenizer(s);
		int m=st.countTokens();
		while(st.hasMoreTokens()==true)
		{
			String q=st.nextToken();
			if(q.equals(x)==true)
				{
					c++;
				}	
		}
		System.out.println ("Freq="+c+"/"+m);
		}
		catch(IOException e)
		{
			System.out.println("Input Error");
		}
	}
}

class Test
{
	public static void main (String[] args) throws Exception
	{
		str ob=new str();
		ob.read();
		ob.frq();
		ob.rev();
		ob.word_cnt();
	}
}