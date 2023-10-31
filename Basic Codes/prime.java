class Prime
{
	/*public void sumofdigit(int m)
	{
		int s=0,d;
		while(m>0)
		{
			d=m%10;
			s=s+d;
			m=m/10;
		}
		System.out.println ("sum of digit="+s);
	}*/
	public void sum()
	{
		int c=0;
		int i,n=2,s=0;
		while(true)
		{		
		boolean flag=false;	
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			c++;
			System.out.println (n);
			s=s+n;
			if(c==100)
				break;
		}
		n++;
		}
		System.out.println("The sum of first 100 prime number is: " +s);
	}
	
	
	public static void main (String[] args) 
		{
			Prime ob= new Prime();
			ob.sum();
			//int h=Integer.parseInt(args[0]);
			//ob.sumofdigit();
				
		}
}