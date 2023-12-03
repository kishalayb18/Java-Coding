import java.util.*;

class Board
{
	private String m[][];
	private int i,j,row,col;
	
	public Board()
	{
		m=new String[8][8];
	}
	
	public Board(int p,int q) 
	{
		m=new String[p][q];
	}
	
	/**********************************************************************/	

	public void readColor()
	{
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<m.length;i++)
		{
			if(i%2==0)
			{	
				for(j=0;j<m[0].length;j+=2)
				{
					m[i][j]="BLACK";
				}
				
				for(j=1;j<m[0].length;j+=2)
				{
					m[i][j]="WHITE";
				}
			}
			
			else
			{
				for(j=1;j<m[0].length;j+=2)
				{
					m[i][j]="BLACK";
				}
				for(j=0;j<m[0].length;j+=2)
				{
					m[i][j]="WHITE";
				}
			}
			
		}
	}
	
	public void find(int a,int b)
	{
		boolean flag=false;
		
		for(i=0;i<m.length;i++)
		{
			for(j=0;j<m[0].length;j++)
			{
				if(a==i && b==j)
				{
					System.out.print ("\nm["+i+"]["+j+"]="+m[i][j]);
					flag=true;
					break;
				}
			}
		}
		
		if(flag==false)
	  	{
	  		System.out.println ("Wrong Input");
	  	}
	}
/**************************************************************************/
	public void disp()
	{
		for(i=0;i<m.length;i++)
		{
			for(j=0;j<m[0].length;j++)
			{
				System.out.print (m[i][j]+"  ");
			}
			System.out.println ("");
			System.out.println ("");
		}
	}
}
/**************************************************************************/


class ChessKisha
{
	public static void main (String[] args) {
	
		Scanner ds=new Scanner(System.in);
		
		Board ob=new Board();
		
		ob.readColor();
		ob.disp();
		
//	/*		
		System.out.print ("Enter Row Position: ");
		int r=ds.nextInt();
		System.out.print ("Enter Column Position: ");
		int c=ds.nextInt();
		
		ob.find(r,c);
		
	//	*/
	}
}