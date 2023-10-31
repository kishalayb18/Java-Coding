import java.io.*;
class calculate
{
	private int row,col;
	private static int count;
	private int[][] x;
	
	public calculate()
	{
		row=2;
		col=3;
		x=new int[row][col];
		count++;
		System.out.println("obj : "+count);
	}
	
	public calculate(int m,int n)
	{
		row=m;
		col=n;
		x=new int[row][col];
		count++;
		System.out.println("obj : "+count);
	}
	
	public void read() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("x["+i+"]["+j+"]=");
				x[i][j]=Integer.parseInt(br.readLine());
			}
		}
	}
	
	public static calculate multiply(calculate ob1,calculate ob2)
	{
		calculate ob3=new calculate(ob1.row,ob2.col);
		if(ob1.col==ob2.row)
			{
				for(int i=0;i<ob1.row;i++)
				{
					for(int j=0;j<ob2.col;j++)
					{
						ob3.x[i][j]=0;
						for(int k=0;k<ob1.col;k++)
						{
							ob3.x[i][j]+=ob1.x[i][k]*ob2.x[k][j];
						}
					}
				}
				return ob3;
			}
			else
				return null;
	}
	
	public void display()
	{
		for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(x[i][j]+"   ");
				}
				System.out.println();
			}
	}
}
public class matrix
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter How Many Rows : ");
		int row1=Integer.parseInt(br.readLine());
		System.out.print("Enter How Many Columns : ");
		int col1=Integer.parseInt(br.readLine());
		calculate x=new calculate(row1,col1);
		x.read();
		x.display();
		
		System.out.print("Enter How Many Rows : ");
		int row2=Integer.parseInt(br.readLine());
		System.out.print("Enter How Many Columns : ");
		int col2=Integer.parseInt(br.readLine());
		calculate y=new calculate(row2,col2);
		y.read();
		y.display();
		
		calculate z=calculate.multiply(x,y);
		if(z==null)
			System.out.println("MATRIX NOT POSSIBLE");
		else
			z.display();	
	}
}