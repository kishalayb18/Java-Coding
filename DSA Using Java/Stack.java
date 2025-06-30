import java.io.*;
class stack
{
	public int top=-1;	
	private int[] a;
	
	public stack()
	{
		a=new int[5];
	}
	
	public stack(int n)
	{
		a=new int [n];
	}
	
	public void push(int d)
	{			
			try
			{
				top++;
				a[top]=d;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				top--;
				System.out.println("stack is full");
			}
	}
	
	public int pop()
	{
			int d=0;
			try
			{
					d=a[top];
					top--;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("stack is empty");
			}
			return d;
	}
	
	public void disp()
	{
		System.out.println ("top="+top);
		for(int i=top;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}	

	public static void main (String[] args) throws IOException
	{ 
		try
		{
		
		int ch,k;
		BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Stack size: ");
		int z=Integer.parseInt(ds.readLine());
		
		stack ob=new stack(z);
		
		do
		{
			System.out.println("1.PUSH 2.POP 3.DISPLAY 4.EXIT");
			System.out.print("Enter your choice: ");
			ch =Integer.parseInt(ds.readLine());
			
			switch(ch)
			{
				case 1:
					System.out.println ("data :");
					k=Integer.parseInt(ds.readLine());
					ob.push(k);
					ob.disp();
					break;
				case 2:
					k=ob.pop();
					ob.disp();
					System.out.println ("poped="+k);
					break;
				case 3:
					ob.disp();
					break;
			}
		}while(ch!=4);
		
		}
		
		catch(IOException e1)
		{
			System.out.println("INPUT ERROR"+e1.getMessage());
		}
	
	}
}