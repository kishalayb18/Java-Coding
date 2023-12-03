import java.util.*;
class Student
{
	String name;
	static int num=1;
	int roll;

	static void study()
	{
		System.out.println("Student number: "+num);
		System.out.println("I am in 6th sem.");
		num++;
	}
	void readData()
	{
		Scanner ob= new Scanner(System.in);
		System.out.print ("Enter name: ");
		name=ob.nextLine();
		System.out.print ("Enter roll: ");
		roll=ob.nextInt();
	}
	void printData()
	{
		System.out.println ("Name is: "+name);
		System.out.println ("Roll is: "+roll);
	}
	public static void main(String[] str)
	{
		Student obj= new Student();
		Student.study();
		obj.readData();
		obj.printData();
		
		
		Student obj1= new Student();
		Student.study();
		obj1.readData();
		obj1.printData();
		
	}
}