import java.util.*;
class TwoD
{
	private int m[][];	//ARRAY DECLARATON
	private int i,j;
	
	public TwoD()
	{
		m=new int[3][3];	// HERE DEFAULT CONSTRUCTOR SET THE THE ARRAY IN FIXED LENGTH
	}
	
	public TwoD(int p,int q) //ARAAY LENGTH IS GIVEN BY USER INPUT OR COMMAND LINE
	{
		m=new int[p][q];
	}
	
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("\nEnter Array Elements");
		
		for(i=0;i<m.length;i++)	//ARRAY-NAME.LENGTH -> LENGTH OF ROW
		{
			for(j=0;j<m[0].length;j++) //ARRAY-NAME[0].LENGTH -> LENGTH OF COLUMN
			{
				m[i][j]=sc.nextInt();
			}
		}
	}
	
	public void disp()
	{
		for(i=0;i<m.length;i++)
		{
			for(j=0;j<m[0].length;j++)
			{
				System.out.print ("\nm["+i+"]["+j+"]="+m[i][j]); // PRINTING OF 3 VARIABLES(i,j,m[i][j]) IN THE SAME LINE
			}
		}
	}
}


class TwoDimensionArray
{
	public static void main (String[] args) { 
		
		Scanner ds=new Scanner(System.in);
		System.out.print ("Enter number of rows: ");
		int r=ds.nextInt();
		System.out.print ("Enter number of columns: ");
		int c=ds.nextInt();
		
		TwoD ob=new TwoD(r,c);	//CALLING PARAMETERIZE CONSTRUCTOR SO ARAAY LENGTH IS SETTING BY USER
		
		ob.read();
		ob.disp();
	}
}