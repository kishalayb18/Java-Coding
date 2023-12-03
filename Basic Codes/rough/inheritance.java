import java.util.*;
 class A
{
		static 
	{
		int a=10, b=20;
		int c=a+b;
		System.out.println ("a static "+c);
	}
	 public void p()
	 {
	 	System.out.println ("A");
	 }
}

class B extends A
{
	static 
	{
		System.out.println ("b static");
	}
	public void p()
	{
		String s="abcdef";
		int i=10,j=20;
		System.out.println ("B "+s+(i+j));
	}
}
class TestMain
{
	public static void main (String[] args) {
	//	A ob1=new A();
	//	ob1.p();
		B ob=new B();
		ob.p();
	}
}