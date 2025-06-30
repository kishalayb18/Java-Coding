class factorial extends Thread
{
	public static int sum=0;
	private int n;
	public factorial(int m)
	{
		n=m;
		System.out.println ("start process of factorial of "+n);
		start();	
	}
	synchronized public void run()
	{
		int i,f=1;
		for(i=1;i<=n;i++)
		{
			f=f*i;
			System.out.println ("process of factorial "+n+" is running" );
			try
			{
			  Thread.sleep(1000);	
			}	
			catch(Exception e)
			{
			}			
		}
		System.out.println ("factorial="+f);
		sum=sum+f;
		System.out.println ("sum="+sum);
		System.out.println ("stop process of factorial of "+n);
	}
	public static void main (String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			new factorial(i);
		}
	}
}