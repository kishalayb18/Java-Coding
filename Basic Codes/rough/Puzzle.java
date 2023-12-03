import java.util.*;
class PuzzleClass
{
	int i, cnt=0, arr[];
	
	public PuzzleClass()
	{
		arr=new int[101];	
	}
	
	
	public void checkOpen()
	{
		for(i=1;i<=100;i++)
	{
		arr[i]=1;
	}
	
	for(int j=2;j<=100;j++)
	{
		for(i=1;i<=100;i++)
		{
			if(i%j==0)
			{
				if(arr[i]==0)
				{
					arr[i]=1;
				}
				else if(arr[i]==1)
				{
					arr[i]=0;
				}
			}
		}
	}
	
	for(i=1;i<=100;i++)
	{
		if(arr[i]==1)
		{
			cnt=cnt+1;
			System.out.print (i+" ");
		}
	}
	
	System.out.println ("\n\nTotal open: "+cnt);
	}
}

class Puzzle
{
	public static void main (String[] args) {
		
		PuzzleClass ob=new PuzzleClass();
		ob.checkOpen();
		System.out.println ("");
		System.out.println (ob);
	}
}