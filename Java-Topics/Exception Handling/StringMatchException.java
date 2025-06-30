import java.io.*;
class StringMatchException extends Exception
{
	public StringMatchException(String s)
	{
		super(s);
		System.out.println ("StringMatchException Occurs.");
	}
}

class Check
{
	public void checkString()
	{
	
	BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print ("Enter First String : ");
			String s1=ds.readLine();
			System.out.print("Enter Second String : ");
			String s2=ds.readLine();
		
			if(s1.equals(s2))
			{
				throw new StringMatchException("Strings Can Not Be Identical");
			}
			else
			{
				System.out.print ("First character of First String is: ");
				System.out.println (s1.charAt(0));
				System.out.print ("First character of Second String is: ");
				System.out.println (s2.charAt(0));
			}
		
		}
		catch (StringMatchException e1)
		{
			System.out.println (e1+"\nCustomized Exception Handled.");
		}
		catch(IOException e2)
		{
			System.out.println ("Wrong Input.");
		}
	}
}

class TestStringMatchException
{
	public static void main (String[] args) 
	{
		Check ob=new Check();
		ob.checkString();
		System.out.println ("THANK YOU");
	}
}