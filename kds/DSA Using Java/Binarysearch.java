import java.util.*;

class Binarysearch 
{
	int a[];
	
	public Binarysearch(int num) 
	{
		a = new int[num];
	}
	
	public void readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter "+a.length+" integers");

		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
	}
	
	public void sortArray()
	{
		System.out.println ("The sorted Array is");
		
		Arrays.sort(a);	//INBUILD SORT METHOD
			
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print (a[i]+" ");
		}
		System.out.println ("\n");
	}
	
	public void binarySearch() 
	{
		int i, lb, ub, mid, val;	//lb=lower bound; ub=upper bound
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter value to find: ");
		val = sc.nextInt();
		lb = 0;
		ub = a.length - 1;
		
		while (lb<=ub) 
		{
			mid = Math.floorDiv(lb+ub, 2);	//mid=(lb+ub)/2
			
			if (val>a[mid])
			{
				lb = mid + 1;
			} 
			else if(val<a[mid])
			{
				ub = mid - 1;
			}
			else if (a[mid] == val) 
			{
				System.out.println(val+" is found at position "+mid);
				break;
			}
		}
		while (lb>ub) 
		{
			System.out.println(val + " isn't present in the list.\n");
			break;
		}
		sc.close();
	}

	
}

class TestBinarysearch
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		Binarysearch ob = new Binarysearch(n);	//making object using parameterized constructor
		
		ob.readArray();
		ob.sortArray();
		ob.binarySearch();
		
		sc.close();
	}
}