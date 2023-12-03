class NewMath
{
	public static int method(int r)
	{
		int n=3, sum=0;
		
		while(n!=0)
		{
			sum=sum*10+r;
			n--;
		}
		return sum;
	}
}

class MathTrick
{
	public static void main (String[] args) {
		int n=1;int r;
		while(true)
		{
			int s=3*n;
			System.out.println ("Sum: "+s);
			r=n%10;
			int num= NewMath.method(r);
			System.out.println ("num: "+num);
			if(3*s==num)
			{
				break;
			}
			n++;
			System.out.println ("n="+n);
			int z=n%10;
			n=n/10;
			int y=n%10;
			n=n/10;
			System.out.println ("blue="+n);
			System.out.println ("grey="+y);
			System.out.println ("red="+z);
		}
	}
}