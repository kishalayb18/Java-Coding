import java.util.*;
class MyArrayList
{
	ArrayList al;//CREATING A REFERENCE
	public MyArrayList()
	{
		al=new ArrayList();//CREATING THE ArrayList
	}
	
	//ANY DATA TYPE CAN BE INSERTED AS AN ArrayList ELEMENT
	//AS ARRAY LIST IS A HETEROGENIOUS DATA STRUCTURE
	public void readArrayList()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print ("Enter an Integer Data: ");
		int data1=sc.nextInt();
		al.add(data1);
		
		System.out.print ("Enter an Double Data: ");
		double data2=sc.nextDouble();
		al.add(data2);
		
		System.out.print ("Enter a String Data: ");
		String data3=sc.next();
		al.add(data3);
		
	}
	public void printArrayList()
	{
		System.out.println ("\nElements in array list are");
		for(int i=0;i<al.size();i++)
		{
			System.out.print (al.get(i)+" ");
		}
		System.out.println ("");
	}
}

class ArrayListTest
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		MyArrayList ob=new MyArrayList();
		int ch;
		do
		{
			System.out.println ("\n1.Insert Data \t2.Display List \t3.Exit");
			
			System.out.print ("\nEnter Choice: ");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					ob.readArrayList();
					break;
				case 2:
					ob.printArrayList();
					break;
				case 3:
					System.out.println ("\nEXIT");
					break;
				default:
					System.out.println ("WRONG INPUT");
					break;
			}
		}while(ch!=3); 
	}
}