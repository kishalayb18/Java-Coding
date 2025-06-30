package esg.itp.shape;
public class Rectangle
{
	private float a,p,x,y;
	
	public Rectangle(float p, float q)
	{
		 x=p;
		 y=q;
	}
		
	public void area()
	{
		a=x*y;
	}
	public void peri()
	{
		p=2*(x+y);
	}
	public void disp()
	{
		System.out.print ("Squar area is: "+a+"  Perimeter is: "+p);
		
	}
}