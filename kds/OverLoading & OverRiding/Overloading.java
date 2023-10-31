import java.util.*;
class Overload
{
	private int i,j,k,n;
	
	public void draw(int n)
	{
		for(i=1; i<=n; i++)
		{
			
			for(j=0;j<=n-i;j++)
			{
				System.out.print (" ");
			}
			
			for(int k=1; k<=2*i-1; k++)
				System.out.print ("*");
			
			System.out.println ("");
		}
	}	

/***********************************/
public void draw(int n, String b)
	{
		for(i=1; i<=n; i++)
		{
			
			for(j=0;j<=n-i;j++)
			{
				System.out.print (" ");
			}
			
			for( k=1; k<=2*i-1; k++)
				System.out.print (b);
			
			System.out.println ("");
		}
	}	
	
	
public void draw(int n, char c)
	{
		for(i=1; i<=n; i++)
		{
			
			for(j=0;j<=n-i;j++)
			{
				System.out.print (" ");
			}
			
			for(int k=1; k<=2*i-1; k++)
				System.out.print (c);
			
			System.out.println ("");
		}
	}	
}

class Method
{
	public static void main (String[] args) {
		Overload ob= new Overload();
		ob.draw(5);
		ob.draw(5, "india");
		ob.draw(5,"a");
	}
}