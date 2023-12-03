/**
 *SORT AN INT ARRAY USING ANY SORTING TECHNIQUE
 *
 *INPUT FORMAT
 *1ST LINE : NO. OF INTEGERS
 *FOLLOWING N LINES : ARRAY ELEMENTS
 *
 *OUTPUT FORMAT 
 *SHOULD RETURN A SORTED ARRAY
*/

import java.io.*;
class arr
{
	private int[] a;
	
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
					a[i]=Integer.parseInt(dd.readLine());
				}
				break;
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println(e1);
			}
			catch(NumberFormatException e2)
			{
				System.out.println(e2);
			}
			
		}
	}
	
	public void disp()
	{
		for (int i:a)
		{
			System.out.println(i);
		}
	}
	
	public void sort()
	{
		int i,j,t;
		for(i=1;i<a.length;i++)
		{
			for(j=0;j<a.length-i;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}
}

class Bubble
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
		int m=Integer.parseInt(ds.readLine());
		
		arr t=new arr(m);
		t.read();
		t.sort();
		t.disp();		
	}
}