
import java.io.*;
import java.util.*;
class str
{
  private String q;
  public str()
  {
  	 String q="aa, ss, bb";
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
  		System.out.print ("Enter string : ");
  		q=d.readLine();
  	}
  	catch(IOException e)
  	{
  	   System.out.println ("input error");	
  	}
  }


  public void sentence()
  {
  	try
  	{
  	
  	    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
  	    System.out.print("No of word:");
  	    String w=b.readLine();
  	
  		StringTokenizer st=new StringTokenizer(q,",");
  		
import java.io.*;
import java.util.*;
class str
{
  private String q;
  public str()
  {
  	 String q="aa, ss, bb";
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
  		System.out.print ("Enter string : ");
  		q=d.readLine();
  	}
  	catch(IOException e)
  	{
  	   System.out.println ("input error");	
  	}
  }


  public void sentence()
  {
  	try
  	{
  	
  	    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
  	    System.out.print("No of word:");
  	    String w=b.readLine();
  	
  		StringTokenizer st=new StringTokenizer(q,",");
  		
import java.io.*;
import java.util.*;
class str
{
  private String q;
  public str()
  {
  	 String q="aa, ss, bb";
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
  		System.out.print ("Enter string : ");
  		q=d.readLine();
  	}
  	catch(IOException e)
  	{
  	   System.out.println ("input error");	
  	}
  }


  public void sentence()
  {
  	try
  	{
  	
  	    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
  	    System.out.print("No of word:");
  	    String w=b.readLine();
  	
  		StringTokenizer st=new StringTokenizer(q);
		int n=st.countTokens();
		int c=0;
		while(st.hasMoreTokens()==true)
		{
			String x=st.nextToken();
	        if(x.equals(w)==true)
	        {
	        	c++;
	        }
		}
		System.out.println ("freq="+c+"/"+n);
  	}
  	catch(IOException e1)
  	{
  	}
  }
  
  public void sort()
  {
  	String[] y=q.split(",");
  	String t="";
  	
  	for(int i=1;i<y.length;i++)
  	{
  		for(int j=0;j<y.length-i;j++)
  		{
  			if(y[j].compareTo(y[j+1])>0)
  			{
  				t=y[j];
  				y[j]=y[j+1];
  				y[j+1]=t;
  			}
  		}
  	}
  	
  	for(int i=0;i<y.length;i++)
  	{
  		System.out.println (y[i]);
  	}
  	
  }
  
  	
}

class test 
{
public static void main (String[] args) 
	{
		str u=new str();
		u.read();
		// u.sentence();
		u.sort();

	}
}

  
		int n=st.countTokens();
		int c=0;
		while(st.hasMoreTokens()==true)
		{
			String x=st.nextToken();
	        if(x.equals(w)==true)
	        {
	        	c++;
	        }
		}
		System.out.println ("freq="+c+"/"+n);
  	}
  	catch(IOException e1)
  	{
  	}
  }
  
  public void sort()
  {
  	String[] y=q.split(",");
  	String t="";
  	
  	for(int i=1;i<y.length;i++)
  	{
  		for(int j=0;j<y.length-i;j++)
  		{
  			if(y[j].compareTo(y[j+1])>0)
  			{
  				t=y[j];
  				y[j]=y[j+1];
  				y[j+1]=t;
  			}
  		}
  	}
  	
  	for(int i=0;i<y.length;i++)
  	{
  		System.out.println (y[i]);
  	}
  	
  }
  
  	
}

class test 
{
public static void main (String[] args) 
	{
		str u=new str();
		u.read();
		// u.sentence();
		u.sort();

	}
}

  
		int n=st.countTokens();
		int c=0;
		while(st.hasMoreTokens()==true)
		{
			String x=st.nextToken();
	        if(x.equals(w)==true)
	        {
	        	c++;
	        }
		}
		System.out.println ("freq="+c+"/"+n);
  	}
  	catch(IOException e1)
  	{
  	}
  }
  
  public void sort()
  {
  	String[] y=q.split(",");
  	String t="";
  	
  	for(int i=1;i<y.length;i++)
  	{
  		for(int j=0;j<y.length-i;j++)
  		{
  			if(y[j].compareTo(y[j+1])>0)
  			{
  				t=y[j];
  				y[j]=y[j+1];
  				y[j+1]=t;
  			}
  		}
  	}
  	
  	for(int i=0;i<y.length;i++)
  	{
  		System.out.println (y[i]);
  	}
  	
  }
  
  	
}

class test 
{
public static void main (String[] args) 
	{
		str u=new str();
		u.read();
		// u.sentence();
		u.sort();

	}
}

  