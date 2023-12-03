import java.util.*;
class User
{
	private int []a;
	private int i,j;
	
	public User()	//DEFAULT CONSTRUCTOR
	{
		a=new int [5];	//FIXED ARRAY LENGTH
	}
	
	public User(int n)	//PARAMETERIZED CONSTRUCTOR 
	{
		a = new int[n];	//ARAAY LENGTH IS GIVEN BY USER INPUT OR COMMAND LINE
	}
	
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter Array Input: ");
		for(i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
		}
	}
	
	public void disp()
	{
		System.out.println ("The Array is: ");
		 for(i=0;i<a.length;i++)
		 {
		 	System.out.print (a[i]+" ");
		 }
	}
	
}

class ArrayUserInput
{
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print ("Enter no. of elements: ");
		int n=sc.nextInt();
		
		User ob=new User(n);	//CALLING PARAMETERIZED CONSTRUCTOR 
		ob.read();
		ob.disp();
}
}

