import java.util.*;
class TwoD
{
	private String m[][];
	private int i,j;
	
	public TwoD()
	{
		m=new String[3][3];
	}
	
	public TwoD(int p,int q) 
	{
		m=new String[p][q];
	}
	
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<m.length;i++)
		{
			for(j=0;j<m[0].length;j++)
			{
				m[i][j]="b/w";
			}
		}
	}
	
	public void disp()
	{
		for(i=0;i<m.length;i++)
		{
			for(j=0;j<m[0].length;j++)
			{
				System.out.print ("\nm["+i+"]["+j+"]="+m[i][j]);
			}
		}
	}
}


class Testchess
{
	public static void main (String[] args) {
		
		Scanner ds=new Scanner(System.in);
		System.out.print ("Enter number of rows: ");
		int r=ds.nextInt();
		System.out.print ("Enter number of columns: ");
		int c=ds.nextInt();
		
		TwoD ob=new TwoD(r,c);
		
		ob.read();
		ob.disp();
		
	}
}