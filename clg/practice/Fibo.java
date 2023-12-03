class Fibo
{
	void add(int n)
	{
		int i, t1=0, t2=1,t3,sum=0;
		for(i=0;i<n;i++)
		{
			System.out.println(t1);
			t3=t1+t2;
			sum=sum+t1;
			t1=t2;
			t2=t3;
			
		}
		System.out.println("Summation is: " +sum);
	}

		public static void main(String[] args)
		{
			Fibo ob=new Fibo();
			int a=Integer.parseInt(args[0]);
			ob.add(a);
		}
		
	
}
