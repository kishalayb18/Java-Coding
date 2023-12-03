/**
 * FIND THE AVERAGE OF THE P MULTIPLES OF AN INTEGER N
 *
 *INPUT FORMAT 
 *2 INTEGERS
 *1ST INTEGER : N, DENOTING THE INTEGER VALUE
 *2ND INTEGER : P, DENOTING THE NO. OF MULTIPLES 
 *
 *CONSTRAINT 
 *1<=N<=30
 *1<=P<=10
 *
 *OUTPUT FORMAT
 *SHOULD RETURN AN INTEGER DENOTING THE AVG. OF THE MULTIPLES OF THE GIVEN NO. N
 *
 *CASE 1:
 *I/P : 6 5
 *O/P : 18 
 *
 *EXPLANATION
 *((6+12+18+24+30)/5)
 *
 *CASE 2:
 *I/P :3 5
 *O/P : 9
*/

import java.io.*;
import java.util.*;

public class T_Exam3 {
	
	static int a,b,sum=0, avg=0, i;
	public static int average(int N, int P)
	{			
			a=N;
			b=P;
			
			for(i=1;i<=b;i++)
			{
				int t=i*a;
				sum+=t;
			}
			
			avg=sum/b;
			return avg;
		}


    public static void main (String[] args) {

		Scanner sc= new Scanner(System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=average(p,q);
		System.out.println (r);		
	}
    
    
}