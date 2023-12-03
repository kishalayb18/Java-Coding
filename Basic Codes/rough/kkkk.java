import java.util.*;
import java.io.*;

class SwapExam
{
	public static void main (String[] args) throws java.lang.Exception
	 {
		int m[][];	
	 	int i,j;
	 	
		BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
		String x=dd.readLine();
		int p=Integer.parseInt(x);
		String z=dd.readLine();
		int q=Integer.parseInt(z);
		 m=new int[p][q];
		
		System.out.println ("\nEnter Array Elements");
	
		for(i=0;i<m.length;i++)	
		{
			for(j=0;j<m[0].length;j++) 
			{
				m[i][j]=Integer.parseInt(dd.readLine());
			}
		}
	
		int count=0;
		for( i=0;i<m.length;i++) 
		{
			for( j=0;j<m[0].length;j++) 
			{
				if(m[i][j]==1)
				{
					int k=i+1;
					if(k<m.length)
					{
						for(int y=0;y<m[0].length;y++)
						{
							if(m[k][y]==1)
							{
								count=count+1;
							}
						}
					}	
				}
			}
		}
		System.out.println("\n"+count);
	}
}
