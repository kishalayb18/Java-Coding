import java.io.*;
import java.util.*;

public class T_Exam4 {
	
	
		
	public static int roadDistance(int[] h, int w) // h[]=persons height array(height) || w=wall height(H)
	{
		int a[];
		int sum=0,t,i;
		a=h;
		int x=w;
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]>x)
			{
				t=2;
				sum+=t;
			}
			else
			{
				t=1;
				sum+=t;
			}
		}
		return sum;
	}
    
    public static void main (String[] args) throws IOException, NumberFormatException {
    	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int[] height;
		int i,t;
		int n=Integer.parseInt(br.readLine());
		height=new int[n];
		for(i=0;i<height.length;i++)
		{
			
			height[i]=sc.nextInt();
		}
		int h=sc.nextInt();
		int result=roadDistance(height,h);
		System.out.println (result);
	}
    
}