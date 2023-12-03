import java.util.*;
class Array
{
	int i, m,z;
	int [] arr;
	
	public Array()
	{
		arr=new int[5];
	}
	
	public Array(int x)
	{
		arr=new int[x];
	}
	
/********************************************************************************************/
	
	public void readArray()	//READING ARRAY
	{
		System.out.println ("Enter Array Elements");
		Scanner sm=new Scanner(System.in);
	
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sm.nextInt();
		}
	}

/********************************************************************************************/

	void max()	//FINDING MAX VALUE IN ARRAY
	{
		m=arr[0];
		for(i=1; i<arr.length; i++)
		{
		if (m<arr[i])
			m=arr[i];
		}
		System.out.println("Max no.:" +m);
	}

/********************************************************************************************/

void min()		//FINDING MIN VALUE IN THE ARRAY
{
z=arr[0];
for(i=1; i<arr.length; i++)
{
if (z>arr[i])
z=arr[i];
}
System.out.println("Min no.:" +z);
}

/********************************************************************************************/

public void findByReference()		//FIND BY REFERENCE(Search at position)
{
	Scanner sc=new Scanner(System.in);
	System.out.print ("\nEnter Position To Search: ");
	int pos=sc.nextInt();	//TAKING THE POSITION
	
	boolean flag=false;	//SETTING A FLAG WHICH VALUE IS INITIALLY FALSE
	
	for(int i=0;i<arr.length;i++)
	{
		if(i==pos)
		{
			flag=true;	//CHANGING FLAG VALUE IF CONDITION MATCH
			System.out.println ("Value at position "+pos+" is: "+arr[pos]); //a[i] or a[pos] -> both will work as i==pos in this condition
			break;	//BREAK THE LOOP IF CONDITION SATISFIED ONCE, SO LOOP WON'T RUN AFTER IT
		}
	}
	if(flag==false)
	{
		System.out.println ("Wrong Input");
	}
}

/********************************************************************************************/

public void findByValue(int value)		//FIND BY VALUE WILL RETURN POSITION
{
	boolean flag=false;	//SETTING A FLAG WHICH VALUE IS INITIALLY FALSE
	
	for(int i=0;i<arr.length;i++)
	{
		if(value==arr[i])
		{
			flag=true;
			System.out.println ("Position of the given value is: "+i); 
			break;
		}	
	}
	if(flag==false)
	{
		System.out.println ("Wrong Input");
	}
}

/********************************************************************************************/

	void displayArray()		//DISPLAY ARRAY
	{
		System.out.println ("\nArray is");
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

/********************************************************************************************/

class MyClass
{

public static void main(String[] args)
{
	Scanner pq=new Scanner(System.in);
	
	System.out.print ("\nEnter no. of elements in d array: ");	//use print instead of println to write side by side
	int n=pq.nextInt();
	
	Array ob=new Array(n); //CALLING PARAMETERIZED CONS. WHICH WILL SET THE ARRAY LENGTH AS GIVEN PARAMETER, n HERE.
	
	ob.readArray();
	ob.max();
	ob.min();
	
	ob.findByReference();
	
	System.out.print ("\nEnter Value To Search: ");
	int v=pq.nextInt();
	ob.findByValue(v);
	
	ob.displayArray();

}

}