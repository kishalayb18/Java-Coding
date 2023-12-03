class Xyz
{
	int a=5;
	void m1()
	{
		a=a+10;
		System.out.println ("m1> "+a);
	}
	void m2()
	{
		a=a+20;
		System.out.println ("m2> "+a);
	}
}
class Main1
{
	public static void main (String[] args) 
	{
		System.out.println ("FOR OB1");
		Xyz ob1=new Xyz();
		ob1.m1();
		ob1.m2();
	
		System.out.println ("FOR OB2");
		Xyz ob2=new Xyz();
		ob2.m1();
		ob2.m2();
	}
}