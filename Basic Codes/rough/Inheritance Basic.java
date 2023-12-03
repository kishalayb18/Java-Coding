import java.util.*;
class A
{
	int a;
	Scanner sc=new Scanner(System.in);
	 public void methodA()
	 {
	 	System.out.print ("\nClass A method\nEnter a=");
	 	a=sc.nextInt();
	 	System.out.println ("\nvalue of a is: "+a);
	 }
}

class B extends A
{
	int b;
	Scanner sc=new Scanner(System.in);
	 public void methodB()
	 {
	 	System.out.print ("\nClass B method\nEnter b=");
	 	b=sc.nextInt();
	 	System.out.println ("\nvalue of b is: "+b);
	 }
}

class D extends B
{
	int c;
	Scanner sc=new Scanner(System.in);
	sout
}

class MainClass 
{
	public static void main (String args[])
	{
		B ob=new B();
		System.out.println ("\nCLASS B OBJECT WILL CALL THE METHODS");
		ob.methodA();//SEE methodA is not in B, but still running, as B extends A, so all var & methods will come to B
		ob.methodB();
		
		System.out.println ("\nCLASS A OBJECT WILL CALL THE METHODS");
		A ob1=new A();
		ob1.methodA();
		//ob1.methodB(); //this will give error, as class A only have methodA, not methodB
	}    
}