import java.util.*;
class Student
{
	private String stuid, sname;
	private double sub1,sub2,sub3,avg;

	
	public Student()
	{
		stuid="";
		sname="";
		avg=0;
	}

	public Student(String n1, String n2, double a)	
	{
		stuid=n1;
		sname=n2;
		avg=a;
	}
	
	void grade(double m)
	{
		if(m>=90)
		{
			System.out.println("Grade: 'O'");
		}
		else if(m>=80 && m<90)
		{
			System.out.println("Grade: 'E'");
		}
		else if(m>=70 && m<80)
		{
			System.out.println("Grade: 'A'");
		}
		else if(m>=60 && m<70)
		{
			System.out.println("Grade: 'B'");
		}
		else if(m>=50 && m<60)
		{
			System.out.println("Grade: 'C'");
		}
		else if(m>=40 && m<50)
		{
			System.out.println("Grade: 'D'");
		}
		else if(m<40)
		{
			System.out.println("Grade: 'F'");
		}
		
		
	}
	
	public void marks()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter student id: ");
		stuid=ob.next();
		System.out.println("Enter name: ");
		sname=ob.next();
		System.out.println("Enter marks of 1st subject: ");
		sub1=ob.nextDouble();
		grade(sub1);
		System.out.println("Enter marks of 2nd subject: ");
		sub2=ob.nextDouble();
		grade(sub2);
		System.out.println("Enter marks of 3rd subject: ");
		sub3=ob.nextDouble();
		grade(sub3);
		
		avg=(sub1+sub2+sub3)/3;
		System.out.println("The average marks is: " +avg);
		
	}
}

class Estudent
{
	public static void main (String[] args)
	{
		Student ob1= new Student();
		ob1.marks();
		
		Student ob2=new Student();
		ob2.marks();
	}
		
}