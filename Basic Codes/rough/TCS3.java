import java.util.*;

class StoneProb
{
	int  a[];
	int i,sum=0;
	
	public StoneProb(int n)
	{
		a=new int[n];
	}
	
	public void stoneWeight()
	{
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				a[i+1]=a[i+1]+1;
			}
		}
		
		for(i=0;i<a.length;i++)
		{
			System.out.print (a[i]+"\t");
			sum=sum+a[i];
		}
		
		System.out.println ("\n>> "+sum);
	}
}

class TestStoneProb
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		StoneProb ob = new StoneProb(x);
		ob.stoneWeight();
	}

}