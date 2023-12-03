import java.util.*;
class MaxProduct
{
	int i, a[],cn=0;
	
	MaxProduct(int s)
	{
		a=new int[s];
	}
	
	public void readArray()
	{
		Scanner sc=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
				cn++;
		}
	}
	
	public void product()
	{
		int max,temp,x,p1=1,p2=1,p3=1;
		int n=a.length;
		
		Arrays.sort(a);
		
		for(i=0;i<4;i++)
		{
			p1=p1*a[i];
		}

		
		p2=a[0]*a[1]*a[n-2]*a[n-1];
		
		for(i=a.length-1;i<a.length-4;i--)
		{
			p3=p3*a[i];
		}
		//p3=a[n-1]*a[n-2]*a[n-3]*a[n-4];
		
		max = (p1 > p2) ? (p1 > p3 ? p1 : p3) : (p2 > p3 ? p2 : p3);	//ternary to find max among 3 numbers
		/*max=p1;
		if(p2>max)
			max=p2;
		if(p3>max)
			max=p3;*/
			
		System.out.println (">>"+max);
	}
}

class TestMaxProduct
{
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MaxProduct ob=new MaxProduct(n);
		ob.readArray();
		ob.product();
	}
}