import java.util.*;
class Student
{
	private String name;
	private int roll;
	
	public Student()
	{
		name="";
		roll=0;
	}
	
	public Student(int q, String p)
	{
		name=p;
		roll=q;
	}
	public void stud_read()
	{
		System.out.println ("Enter name: ");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		System.out.println ("Enter Roll: ");
		roll=sc.nextInt();
	}
	public void stud_disp()
	{
		System.out.println ("Name: "+name);
		System.out.println ("Roll: "+roll);
	}
}

class Subject extends Student
{
	protected int sub1, sub2, sub3;
	
	public Subject()
	{
		super();
		sub1=0;
		sub2=0;
		sub3=0;
	}
	
	public Subject(int r,String nm,int m, int n, int o)
	{
		super(r,nm);
		sub1=m;
		sub2=n;
		sub3=o;
	}
	
	public void sub_read()
	{
		Scanner sc= new Scanner(System.in);	
		System.out.println ("Enter marks of 1st sub: ");
		sub1=sc.nextInt();
		System.out.println ("Enter marks of 2nd sub: ");
		sub2=sc.nextInt();
		System.out.println ("Enter marks of 3rd sub: ");
		sub3=sc.nextInt();
	}
	public void sub_disp()
	{
		System.out.println ("Marks of Sub1: "+sub1);
		System.out.println ("Marks of Sub2: "+sub2);
		System.out.println ("Marks of Sub3: "+sub3);
	}
}

final class Result extends Subject
{
	private float total, per;
	
	public Result()
	{
		
	}
	
	public Result(int m1, String m2, int m3, int m4, int m5)
	{
		super(m1,m2,m3,m4,m5);
	}
	
	public void msheet()
	{
		total=sub1+sub2+sub3;
		per=total/3;
		System.out.println ("Total="+total+"\nPercentage="+per);
	}
}

class Inherit
{
	public static void main (String[] args) {
		Result ob=new Result();
		ob.stud_read();
		ob.sub_read();
		ob.stud_disp();
		ob.sub_disp();
		ob.msheet();
	}
}