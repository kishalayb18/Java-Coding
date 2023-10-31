import java.io.*;
class emp
{
	private int id,basic;
	private String name;
	
	public emp()
	{
		id=101;
		basic=1000;
		name="";
	}
	
	public emp(int m,int n,String s)  
	{
		id=m;
		basic=n;
		name=s;	
	}
	
	public void emp_read() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter I.D. : ");
		id=Integer.parseInt(br.readLine());
		System.out.print("Enter Name : ");
		name=br.readLine();
		System.out.print("Enter Basic : ");
		basic=Integer.parseInt(br.readLine());
		System.out.println();
	}
	
	public int get_basic()
	{
		return basic;
	}
	
	public void emp_disp()
	{
		System.out.println("I.D. : "+id);
		System.out.println("NAME : "+name);
		System.out.println("BASIC : "+basic);
		System.out.println();
	}
}


class office
{
	private emp[]x;
	
	public office()
	{
		x=new emp[3];
	}
	
	public office(int n)
	{
		x=new emp[n];
	}
	
	public void read() throws IOException
	{
		for(int i=0;i<x.length;i++)
		{
			x[i]=new emp();
			x[i].emp_read();
		}
	}
	
	public void sorting()
	{
		emp t;
		for(int i=1;i<x.length;i++)
		{
			for(int j=0;j<x.length-i;j++)
			{
				if(x[j].get_basic()>x[j+1].get_basic())
				{
					t=x[j];
					x[j]=x[j+1];
					x[j+1]=t;
				}
			}
		}
	}
	
	public void disp()
	{
		for(int i=0;i<x.length;i++)
		{
			x[i].emp_disp();
		}
	}
}


public class test
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter How many Employees");
		int n=Integer.parseInt(br.readLine());
		
		office ob=new office(n);
		ob.read();
		ob.sorting();
		ob.disp();
	}
}