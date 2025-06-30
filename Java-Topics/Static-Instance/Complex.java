import java.util.*;
class Complex
{
	public static int count=0;
	private int real, img;
	
	public Complex()    //Default Constructor
	{
		real=0;
		img=0;
		count++;
		System.out.println("obj->"+count);
	}
	
	public Complex(int p, int q)  //Parameterize Constructor
	{
		real=p;
		img=q;
		count++;
		System.out.println("obj->"+count);
	}
	
	public void read()
	{
		Scanner z= new Scanner(System.in);
		System.out.println("Real: ");
		real=z.nextInt();
		System.out.println("Imaginary: ");
		img=z.nextInt();
	}
	
	public void disp()
	{
		System.out.println(real+"+"+img+"i");
	}
	
	public static Complex add(Complex c1, Complex c2)
	{
		Complex c3= new Complex();
		c3.real=c1.real+c2.real;
		c3.img=c1.img+c2.img;
		return c3;
	}	
}

	class Text
	{
	
		public static void main (String[] args) 
		{
			Complex x=new Complex();
			x.read();
			
			Complex y= new Complex();
			y.read();
			
			Complex z=Complex.add(x,y);
			
			x.disp();
			y.disp();
			z.disp();
		}
	}