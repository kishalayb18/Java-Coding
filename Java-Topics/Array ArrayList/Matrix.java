import java.io.*;
class Mat
{
	private int [][]x;
	private int r,c;
	public Mat()
	{
		r=3;
		c=3;
		x=new int[r][c];
	}
	public Mat(int m, int n)
	{
		this.r=m;
		this.c=n;
		x=new int[r][c];
	}
	
	public void read() 
	{
		try
		{
			BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
			int i,j;
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.print("X["+i+"]["+j+"]=");
					x[i][j]=Integer.parseInt(ds.readLine());
				}
			}
		}
		catch(IOException e)
		{
			System.out.println("INPUT ERROR");
		}
	}
	
	public void disp()
	{
		int i,j;
		System.out.println("Matrix: ");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[0].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public Mat transpose()
	{
		Mat ob= new Mat(c,r);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				ob.x[j][i]=this.x[i][j];
			}
		}
		System.out.print("Transpose ");
		return ob;
	}
	
	public static Mat add(Mat m1,Mat m2)
	{
		int i,j;
		if(m1.r==m2.r && m1.c==m2.c)
		{
			Mat m3=new Mat(m1.r,m2.c);
			for(i=0;i<m1.r;i++)
			{
				for(j=0;j<m1.c;j++)
				{
					m3.x[i][j]=m1.x[i][j]+m2.x[i][j];
				}
			}
			System.out.print("Addition ");
			return m3;
		}
		else
		{
			System.out.println("Matrixes are not matching.");
			return null;
		}	
	}
	
	public static Mat mul(Mat m1, Mat m2)
	{
		int i,j,k;
		if(m1.c==m2.r)
		{
			Mat m3=new Mat(m1.r,m2.c);
			for(i=0;i<m1.r;i++)
			{
				
				for(j=0;j<m2.c;j++)
				{
					m3.x[i][j]=0;
					for(k=0;k<m1.c;k++)
					{
						m3.x[i][j]+=m1.x[i][k]*m2.x[k][j];	
					} 
				}
			}
			System.out.print("Multiplication ");
			return m3;
		}
		else
		{
			System.out.println("Matrixes are not matching.");
			return null;
		}	
	}	
}

class Matrix
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Enter row=");
		int p=Integer.parseInt(ds.readLine());
		System.out.println ("Enter col=");
		int q=Integer.parseInt(ds.readLine());		
		Mat m1=new  Mat(p,q);
		m1.read();
		m1.disp();
			
		System.out.println ("Enter row=");
		int a=Integer.parseInt(ds.readLine());
		System.out.println ("Enter col=");
		int b=Integer.parseInt(ds.readLine());		
		Mat m2=new  Mat(a,b);
		m2.read();
		
		m1.disp();
		m2.disp();
		
	/*	Mat m3=new Mat();
		m3=Mat.add(m1,m2);
		m3.disp();*/
		
		Mat m4=new Mat();
		m4=Mat.mul(m1,m2);
		m4.disp();
		
	/*	Mat trans=m1.transpose();
		trans.disp();*/
	}
}