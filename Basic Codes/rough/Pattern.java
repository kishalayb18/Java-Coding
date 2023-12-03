/*
OUTPUT: 

Enter no of lines: 4
1 
2 4 
3 6 9 
4 8 12 16 

*/


import java.util.*;
class A
{
	void pattern()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print ("Enter no of lines: ");
		int n=sc.nextInt();
		int t=1; 
		while(t<=n)
		{
			for(int i=1;i<=t;i++)
			{
				int s=t;
				s=s*i;
				System.out.print (s+" " );
			}
			System.out.println ("");
			t++;
		}
	}
	
}

class MainClass
{
	public static void main (String[] args) 
	{
		A ob=new A();	
		ob.pattern();
	}
}

