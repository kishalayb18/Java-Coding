package esg.itp.shape;
public class Square
{
	private float s,a,p;
	
	public Square(float z)
	{
		 s=z;
	}
	
	public void area()
	{
		a=s*s;
	}
	public void peri()
	{
		p=4*s;
	}
	public void disp()
	{
		System.out.print ("Squar area is: "+a+"  Perimeter is: "+p);
		
	}
}