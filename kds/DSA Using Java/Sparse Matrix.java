import java.util.*;
class Sparsemat
{
	int a[][], sparse[][];
	int rows;
	int colms;
	int i,j, count=0, row_sparse=1;
	public Sparsemat(int r, int c)
	{
		a=new int[r][c];
		rows=r;
		colms=c;
	}
	
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of" +rows+ "X" +colms+ "array: ");
		for(i=0; i<rows; i++)
		{
			for(j=0; j<colms; j++)
			{
				a[i][j]=sc.nextInt();
				if(a[i][j]!=0)
				{
					count++;
				}
			}
		}
		System.out.println("Total non zero elements: " +count);
		row_sparse=count+1;
		sparse=new int[row_sparse][3];
		sparse[0][0]=rows;
		sparse[0][1]=colms;
		sparse[0][2]=count;
		row_sparse=1;
		for(i=0; i<rows; i++)
		{
			for(j=0; j<colms; j++)
			{
				if(a[i][j]!=0)
				{
					sparse[row_sparse][0]=i;
					sparse[row_sparse][1]=j;
					sparse[row_sparse][2]=a[i][j];
					row_sparse++;
				}
			}
		}
		sc.close();
	}
	
	public void display()
	{
		for(i=0; i<row_sparse; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(sparse[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
}
class Sparsematrix
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int column=sc.nextInt();
		Sparsemat ob=new Sparsemat(row,column);
		ob.read();
		ob.display();
		sc.close();
	}
}