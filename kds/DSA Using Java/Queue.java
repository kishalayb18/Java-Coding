import java.io.*;
import java.util.*;

class Q 
{
	public int front=-1, rear=-1;
	private int[] a;
	
	public Q()
	{
		a=new int[5];
	}
	public Q(int n)
	{
		a=new int[n];
	}
	
	public void ins(int d)
	{			
			try
			{ 
				if(front==-1 && rear==-1)
				{
					front=0;
					rear=0;
					a[rear]=d;
					a[front]=d;
					
				}
				else
				{
					rear++;
					a[rear]=d;
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				top--;
				System.out.println("stack is full");
			}
	}
}