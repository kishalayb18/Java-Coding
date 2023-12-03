import java.util.*;
class Test
{
	private int i, j;
	private String[][]arr;

	public Test()
	{
		arr=new String[8][8];
	}

	public void read()
	{
		Scanner sm=new Scanner(System.in);
		for(i=0; i<arr.length; i++)		
		{
			for(j=0; j<arr[0].length; j++)	
			{
				if ((i + j) % 2 == 0) 
				arr[i][j]="Black";
				else 
				arr[i][j]="White";
			}
		}
	}

public void pos()		
{
	Scanner sc=new Scanner(System.in);
	System.out.println("\n Enter position of row to search:");
	int pos1= sc.nextInt();	
	System.out.println("\n Enter position of column to search:");
	int pos2=sc.nextInt();	

	boolean flag= false;			
	for(i=0; i<arr.length; i++)
	{
		for(j=0; j<arr[0].length; j++)
		{	
		if(i==pos1 && j==pos2)
		{
			flag=true;
			System.out.println("Colour at row position"+pos1+" & column position "+pos2+" is: "+arr[pos1][pos2]);		
			break;
		}
	}
	}
if (flag==false)
{
	System.out.println("Wrong Input");
}
}

	public void disp()
	{
		for(i=0; i<arr.length; i++)
		{
			for(j=0; j<arr[0].length; j++)	
			{
				System.out.print("\t"+arr[i][j]);		
			}
			System.out.print("\n");
		}
	}


	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		Test ob=new Test();
		ob.read();
		ob.disp();
		ob.pos();

	}


}