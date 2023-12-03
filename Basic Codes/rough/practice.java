import java.util.*;

class TestProb
{
	private int a[][],i,j,cnt=0,m,n;
	
	public TestProb()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print ("no of rows: ");
		m=sc.nextInt();
		System.out.print ("no of cols: ");
		n=sc.nextInt();
		
		a=new int[m][n];
	}
	public void read()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println ("emp positions");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	
	public int CountConnection()
	{
		int x,y,temp;
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				
				if(a[i][j]==1)
				{
					x=i;
					while(true)
					{
						x++;
						temp=cnt;
						{
							for(y=0;y<a[0].length;y++)
							{
								if (a[x][y]==1)
								{
									cnt++;
								}
							}
						}
						if((temp!=cnt) || (x==a.length-1))
						{
							break;
						}
					}
				}
			}
		}
		return cnt;
	}
}

class practice 
{
	public static void main(String args[])
	{
    	TestProb ob=new TestProb();
    	ob.read();
    	int c=ob.CountConnection();
    	System.out.println("No. of connection = "+c);
	}
}