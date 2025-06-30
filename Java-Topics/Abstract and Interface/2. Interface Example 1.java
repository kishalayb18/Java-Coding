import java.util.*;
interface Polygon
{
	public void area();//only method declaration, no method definition
	final void peri();
	public void disp();
}

class Square implements Polygon
{
	private float s,a,p;
	
	public Square(float z)//parameterize constructor
	{
		 s=z;
	}
	
	@Override	//this is an annotation, it makes the compiler understand more specificly that the method is overriden, it is optional
	public void area()	//Overriden method, defining the method area() which is declared in the Polygon Interface
	//the public key word is MANDATORY WHILE DEFINING the interface methods, else it'll throw error
	{
		a=s*s;
	}
	
	//the public key word is MANDATORY WHILE DEFINING the interface methods, else it'll throw error
	@Override
	public void peri()	//Overriden method, defining the method peri() which is declared in the Polygon Interface
	{
		p=4*s;
	}

	//@Override	//we can give the annotation or we can skip,
				//but if we give the annotation @Override to a method which is not overriden then it will throw an error
	public void disp()
	{
		System.out.print ("Squar area is: "+a+"  Perimeter is: "+p);
		
	}
}

class Rectangle implements Polygon
{
	private float a,p,x,y;
	
	public Rectangle(float p, float q)
	{
		 x=p;
		 y=q;
	}
	
	@Override
	public void area() //Overriden method, method is declared in the interface
	{
		a=x*y;
	}
	
	@Override
	public void peri()	//Overriden method, method is declared in the interface
	{
		p=2*(x+y);
	}
	
	//@Override	//as optional, but good practice to give the annotation
	public void disp()	//Overriden method, method is declared in the interface
	{
		System.out.print ("Squar area is: "+a+"  Perimeter is: "+p);
		
	}
}

class InterfaceTest
{
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print ("Enter side lenghth of squar: ");
		float s=sc.nextFloat();
		Square ob1=new Square(s);
		ob1.area();//CALLING Square CLASS area() method
		ob1.peri();
		ob1.disp();
		
		System.out.print ("\nEnter lenghth of rectangle: ");
		float m=sc.nextFloat();
		System.out.print ("Enter breadth of rectangle: ");
		float n=sc.nextFloat();
		Rectangle ob2=new Rectangle(m,n);
		ob2.area();//CALLING Rectangle CLASS area() method
		ob2.peri();
		ob2.disp();
		
	}
}