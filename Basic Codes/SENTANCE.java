import java.io.*;
import java.util.*;
class str
{
  private String q;
  public str()
  {
  	  q="aa,ss,bb";
  } 
  	
  public str(String t)
  {
  	q=t;
  }

  public void read()
  {
  	try
  	{
  		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
  		System.out.println ("Enter string : ");
  		q=d.readLine();
  	}
  	catch(IOException e)
  	{
  	   System.out.println ("input error");	
  	}
  }

  
  public void sentence()
  {
  	int c;
  	s=s.toLowerCase();
  	s=s.trim();
  	for(int i=97;i<=122;i++)
  	{

  	}		
  }
  
  
}

class test 
{
	public static void main (String[] args) 
	{
		str u=new str();
		u.read();
   		u.freq();
	}
}


