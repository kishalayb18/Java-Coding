import java.util.*;
class TestPractice2
{
	String s,temp;
	char k[][];
	int x1=0,y1=0,x2,y2,r,c,a,b,cnt=0;
	
	public TestPractice2()
	{
		Scanner sc=new Scanner(System.in);
		
		r=sc.nextInt();
		c=sc.nextInt();
		k=new char[r][c];
		//sc.close();
	}
	
	public void readKeys()
	{
		System.out.println("");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<r;i++)
		{
			temp=sc.nextLine();
			System.out.println (temp);
			if(temp.length()!=c)
			{
				System.out.println ("Wrong");
				break;
			}
			for(int j=0;j<c;j++)
			{
				k[i][j]=temp.charAt(j);
			}
		}
	}
	
	public int calculateTime()
	{
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
		int p=0,i,j,flag=0;
		outer: while(p<s.length())
		{
			flag=0;
			for(i=0;i<k.length;i++)
			{
				for(j=0;j<k[0].length;j++)
				{
					if(s.charAt(p)==k[i][j])
					{
						x2=i; y2=j;
						a=(x1-x2); b=(y1-y2);
						if(a<0)
							a=a*(-1);
						if(b<0)
							b=b-(-1);
						cnt=cnt+a+b;
						x1=i;y1=j;
						flag=1;
						p++;
					}
					if(flag==1)
					{
						continue outer;
					}
				}
			}
		}
		
		/*if(flag==0)
		{
			System.out.println ("NOT MATACHED");
			return -1;
		}*/
		return cnt;
	}
}



class practice2 
{
	public static void main (String args[])
	{
		TestPractice2 ob=new TestPractice2();
		ob.readKeys();
		int c=ob.calculateTime();
		System.out.println ("Time required to type d string : "+c);
	}    
}