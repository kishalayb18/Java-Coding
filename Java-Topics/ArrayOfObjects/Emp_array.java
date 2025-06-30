import java.util.*;
class Emp
{
	private String empid,ename;
	public double basic;
	
	public Emp()
	{
		empid="";
		ename="";
		basic=0;
	}
	public Emp(String s1, String s2, double b)
	{
		empid=s1;
		ename=s2;
		basic=b;	
	}
	
	public void emp_read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empid: ");
		empid=sc.next();
		System.out.println("Enter ename: ");
		ename=sc.next();
		System.out.println("Enter baisc: ");
		basic=sc.nextDouble();
	}
	
	public void emp_disp()
	{
		System.out.println("Empid: "+empid+" Name: "+ename);
		System.out.println("Basic "+basic);
	}
	
	public double get_basic()
	{
		return basic;
	}
}

class Office
{
	private Emp[] x;
	
	public Office()
	{
		x=new Emp[3];
	}
	
	public Office(int n)
	{
		x=new Emp[n];
	}
	
	public void office_read()
	{
		for(int i=0;i<x.length;i++)
		{
			x[i]=new Emp();
			x[i].emp_read();
		}
	}
	
	public void sort()
	{
		int i,j;
		Emp t;
		for(i=1;i<x.length;i++)
		{
			for(j=0;j<x.length-i;j++)
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
	
	public void office_disp()
	{
		for(int i=0;i<x.length;i++)
		{
			x[i].emp_disp();
		}
	}
}

class Emp_array
{
	public static void main(String[] args)
	{
		Scanner y=new Scanner(System.in);
		System.out.println("Number of Employees: ");
		int n=y.nextInt();
		
		Office ob=new Office(n);
		ob.office_read();
		ob.sort();
		ob.office_disp();
	}
}