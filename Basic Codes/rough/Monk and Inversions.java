/*
 Monk's best friend Micro, who happen to be an awesome programmer, got him an integer matrix M of size  for his birthday. 
 Monk is taking coding classes from Micro. 
 They have just completed array inversions and Monk was successful in writing a program to count the number of inversions in an array. 
 Now, Micro has asked Monk to find out the number of inversion in the matrix M. 
 Number of inversions, in a matrix is defined as the number of unordered pairs of cells  such that .
Monk is facing a little trouble with this task and since you did not got him any birthday gift, you need to help him with this task.

Input:
First line consists of a single integer T denoting the number of test cases.
First line of each test case consists of one integer denoting N. Following N lines consists of N space separated integers denoting the matrix M.

Sample Input
2
3
1 2 3
4 5 6
7 8 9
2
4 3
1 4

Sample Output
0
2


 **/





import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MonkInversion
{    
    public void inversion()
    {
        int tc, cnt=0,r,c;
        Scanner sc = new Scanner(System.in);
        tc=sc.nextInt();
        while(tc>0)
        {
            cnt=0;
            r=0;
            c=0;

            int n=sc.nextInt();
            int arr[][]=new int[n][n];

            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }

            int p,q;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    for(int k=j+1;)
                }
            }
            
            
            tc--;
        }
    }
}

class TestClass {
    public static void main(String args[] ) throws Exception {
		MonkInversion ob=new MonkInversion();
		ob.inversion();
    }
}
