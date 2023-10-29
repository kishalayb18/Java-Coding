class Array
{
	int i=0;
	int sum=0;
	int [] a;
	
	void add(int []a)
	{
		for(i=0;i<a.length;i++)
		{	
			sum=sum+a[i];
		}
		System.out.println("Sum="+sum);
	}

	public static void main(String[] args)
	{
		Array ob=new Array();
		int [] b={10,50,30,18,6};
		ob.add(b);
	}
}