import java.util.*;

class SecondLargestPrime
{
	int []arr;
	int flag=0;
	int thirdMax=Integer.MIN_VALUE;
	int max=Integer.MIN_VALUE;
	int secondMax=Integer.MIN_VALUE;
	int uniquePrimeCount=0, totalPrimecnt=0;
	
	
	public void findSecondLargestPrime()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		
		arr= new int[n];
		
		System.out.println("Enter integers:");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			
			for(int j=2; j<arr[i]; j++)
			{
				flag=1;
				if(arr[i]==2)
				{
					flag=1;
					break;
				}	
				else if((arr[i]%j)==0)
				{	
					flag=0;				
					break;
				}
			}
			if(flag==1)
			{
				if(max<=arr[i])
				{
					if(max<arr[i])
					{
						thirdMax=secondMax;
						secondMax=max;
						max=arr[i];
						uniquePrimeCount++;
						//System.out.println ("arrVal:"+arr[i]+" uPrime=:"+uniquePrimeCount);
					}
				}
				else if(secondMax<=arr[i])
				{
					if(secondMax<arr[i])
					{
						thirdMax=secondMax;
						secondMax=arr[i];
						uniquePrimeCount++;
						//System.out.println ("arrVal:"+arr[i]+" uPrime=:"+uniquePrimeCount);
					}
				}
				else if(thirdMax<=arr[i])
				{
					if(thirdMax<arr[i])
					{
						thirdMax=arr[i];
						uniquePrimeCount++;
						//System.out.println ("arrVal:"+arr[i]+" uPrime=:"+uniquePrimeCount);
					}
					
				}
				
				totalPrimecnt++;
			}
		}
		if(uniquePrimeCount==0)
		{
			System.out.println ("There is no prime number in the given list");
		}
		else if(uniquePrimeCount==1)
		{
			System.out.println ("Total number of primes in the list:"+totalPrimecnt);
			System.out.println ("Total number of unique primes in the list:"+uniquePrimeCount);
			System.out.println ("maxprime:"+max);
		}
		else if(uniquePrimeCount==2)
		{
			System.out.println ("Total number of primes in the list:"+totalPrimecnt);
			System.out.println ("Total number of unique primes in the list:"+uniquePrimeCount);
			System.out.println ("maxprime:"+max);
			System.out.println ("SecMax:"+secondMax);
		}
		else
		{
			System.out.println ("Total number of primes in the list:"+totalPrimecnt);
			System.out.println ("Total number of unique primes in the list:"+uniquePrimeCount);
			System.out.println ("maxprime:"+max);
			System.out.println ("SecMax:"+secondMax);
			System.out.println ("ThirdMax:"+thirdMax);			
		}
	}
		
}

class MainSecondLargestPrime{
	public static void main(String[] args) 
	{
		SecondLargestPrime ob=new SecondLargestPrime();
		ob.findSecondLargestPrime();
	}
}