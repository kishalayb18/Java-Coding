import java.util.*;
import java.io.*;


class Solution
{
	public static int race(int x[],int y)
	{
		int[] time=x;
		int k=y;
		int cnt=0;
		for(int i=0;i<time.length;i++)
		{
			if(time[i]<=k)
			{
				cnt++;
			}
		}
		return cnt;	
	}
}
public class T_Exam6 {

    public static void main (String[] args) throws IOException,NumberFormatException
    {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] finishTime=new int[n];
		int t;
		for(int i=0;i<n;i++)
		{
			t=Integer.parseInt(br.readLine());
			finishTime[i]=t;
		}
		int K=Integer.parseInt(br.readLine());
		int result=Solution.race(finishTime,K);
		System.out.println (result);
	}
    
    
}