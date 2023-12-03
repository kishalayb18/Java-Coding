class Mat
{
	int [] a;
	Mat(int n)
	{
		a=new int[n];
	}
	void m()
	{
	 	for(int i=0; i<a.length;i++)
	 	{
	 		System.out.println (a[i]);
	 	}
	}
}

class Test
{
	public static void main (String[] args) {
		int n=Integer.parseInt(args[0]);
		Mat ob=new Mat(n);
		for(int i=1;i<=n;i++)
		{
			ob.a[i-1]=Integer.parseInt(args[i]);
		}
		ob.m();
	}
}