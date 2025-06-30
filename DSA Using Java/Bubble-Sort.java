import java.io.*;
class arr
{
	private int[] a;
	public arr()
	{
		a=new int[5];
	}
	
	public arr(int n)
	{
		a=new int[n];
	}
	
	public void read()
	{
		int i;
		while(true)
		{
			try
			{
				BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
				for(i=0;i<a.length;i++)
				{
					System.out.print("a["+i+"]=");
					a[i]=Integer.parseInt(dd.readLine());
				}
				break;
			}
			catch(IOException e)
			{
				System.out.println("INPUT ERROR"+e.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println("OVER FLOW");
			}
			catch(NumberFormatException e2)
			{
				System.out.println("WRONG FORMAT");
			}
			finally
			{
				System.out.println("THANK YOU");
			}
			
		}
	}
	
	public void disp()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(x[i]);
		}
	}
	
	public void sort()
	{
		int i,j,t;
		for(i=1;i<x.length;i++)
		{
			for(j=0;j<x.length-i;j++)
			{
				if(x[j]>x[j+1])
				{
					t=x[j];
					x[j]=x[j+1];
					x[j+1]=t;
				}
			}
		}
	}
	public void linear_search()
	{
		
		int i;
		
		try
		{
			BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the number to be searched: ");		
			int a=Integer.parseInt(dd.readLine());
			boolean flag=false;
			for(i=0;i<x.length;i++)
		    {
			if(a==x[i])
			{
				flag=true;
				System.out.print("The position of"+a+"is"+i);
				break;
				
			}
		    }
			if(flag==false)
			{
				System.out.println("Number is not found");
			}
				
		}	
		catch(IOException e4)
		{
			System.out.println("INPUT ERROR"+e4.getMessage());
		}

		
		
		
	}
}

class Bubble
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many number: ");
		int m=Integer.parseInt(ds.readLine());
		
		arr t=new arr(m);
		t.read();
		t.sort();
		t.disp();
		t.linear_search();
		
	}
}