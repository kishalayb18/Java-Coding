import esg.itp.shape.Square;
import esg.itp.shape.Rectangle;
import java.util.*;
public class TestPackage
{
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print ("Enter side lenghth of squar: ");
		float s=sc.nextFloat();
		Square ob1=new Square(s);
		ob1.area();
		ob1.peri();
		ob1.disp();
		
		System.out.print ("\nEnter lenghth of rectangle: ");
		float m=sc.nextFloat();
		System.out.print ("Enter breadth of rectangle: ");
		float n=sc.nextFloat();
		Rectangle ob2=new Rectangle(m,n);
		ob2.area();
		ob2.peri();
		ob2.disp();
		
	}
}