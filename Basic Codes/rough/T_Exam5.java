import java.util.*;

class Solution
{
	public static int rangeVisibility(int a,int b,int c)
	{
		int l=a;
		int r=b;
		int k=c;
		int i, sum=0,t,num,cnt=0;
		
		for(i=a;i<=r;i++)
		{
			num=i;
			sum=0;
			while(num!=0)
			{
				t=num%10;
				sum+=t;
				num=num/10;
			}
			if(sum%k==0)
			{
				cnt++;
			}
		}
		return cnt;
	}
}

public class T_Exam5 {

    public static void main (String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int R= sc.nextInt();
		int K=sc.nextInt();
		int result;
		result=Solution.rangeVisibility(L,R,K);
		System.out.println (result);
	
	}
}