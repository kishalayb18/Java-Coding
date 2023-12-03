import java.io.*;
import java.util.*;
class str
{
	public String s,r;
	
	public String frequency(String input1)
	{
		s=input1;
		s=s.toLowerCase();
		for(int i=97;i<=122;i++)
		{
			char d=(char )i;
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
		return "";
	}
}

class TestFreq
{
	
	public static void main (String[] args) throws Exception
	{
		try
		{
			BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter string: ");
			String s1=d.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Input Error");
		}
		
		str ob=new str();
		ob.frequency(s1);
	}
}