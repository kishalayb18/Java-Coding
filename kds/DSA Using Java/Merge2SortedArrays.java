import java.util.*;
class Merge2SortedArrays
{
	int a1[], a2[], a3[];
	
	Merge2SortedArrays(int size1, int size2)
	{
		a1=new int[size1];
		a2=new int [size2];
		a3=new int [size1+size2];
	}
	
	public void readArrays()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println ("Enter the 1st array's sorted elements:");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		
		System.out.println ("Enter the 2nd array's sorted elements:");
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=sc.nextInt();
		}
	}
	
	public void mergeArrays()
	{
		int i=0,j=0,k=0;
		
		while(i<a1.length && j<a2.length)
		{
			if(a1[i]<a2[j])
			{
				a3[k]=a1[i];
				i++;
				k++;
			}
			else if(a2[j]<a1[i])
			{
				a3[k]=a2[j];
				j++;
				k++;
			}
			else if(a1[i]==a2[j])
			{
				a3[k]=a1[i];
				k++;
				i++;
				a3[k]=a2[j];
				k++;
				j++;
			}
		}
		while(i<a1.length || j<a2.length) 
		{
        	if (i<a1.length) 
        	{
                a3[k] = a1[i];
                k++;
                i++;
        	}
 
        	else if (j<a2.length) 
        	{
                a3[k] = a2[j];
                j++;
                k++;
       		}
        }
		/*while(i<a1.length)
		{
			a3[k]=a1[i];
			i++;
			k++;
		}
		while(j<a2.length)
		{
			a3[k]=a2[j];
			j++;
			k++;
		}*/
		
		System.out.println ("\n1st array is:");
		for(i=0;i<a1.length;i++)
		{
			System.out.print (a1[i]+" ");
		}
		
		System.out.println ("\n\n2nd array is:");
		for(i=0;i<a2.length;i++)
		{
			System.out.print (a2[i]+" ");
		}
		
		System.out.println ("\n\nMerged array is:");
		for(i=0;i<a3.length;i++)
		{
			System.out.print (a3[i]+" ");
		}
	}
	
}

class TestMerge2SortedArrays
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print ("Enter 1st array size: ");
		int x=sc.nextInt();
		System.out.print ("Enter 2nd array size: ");
		int y=sc.nextInt();
		
		Merge2SortedArrays ob=new Merge2SortedArrays(x,y);
		ob.readArrays();
		ob.mergeArrays();
	}
}