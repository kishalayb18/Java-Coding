import java.util.*;
class Merge2SortedArrayList
{
	List<Integer> a1=new ArrayList();	//<Integer> is for type casting purpose; 
	List<Integer> a2=new ArrayList();	//Where we forcefully specified the list to take only integer type datas
	List<Integer> a3=new ArrayList();
	
	public void readArrayList1()//TAKE ELEMENTS IN LIST-1
	{
		Scanner sc=new Scanner(System.in);
		System.out.print ("Enter Data In Array List 1: ");
		int val=sc.nextInt();
		a1.add(val);	//add(data) is a predefined instance method of array list to add values in d list
						//the value which we want to add, should pass as a parameter of this method
	}
	
	public void readArrayList2()//TAKE ELEMENTS IN LIST-2
	{
		Scanner sc=new Scanner(System.in);
		System.out.print ("Enter Data In Array LIst 2: ");
		int val=sc.nextInt();
		a2.add(val);
	}
	
	public void mergeTwoSortedArrayList()
	{
		Collections.sort(a1);	//Collections is a class, sort(list1) is a static method of that class
		Collections.sort(a2);	//sort method is parameterized, it takes a list as parameter
		
	
		int i=0,j=0;
		
		while(i<a1.size()&&j<a2.size())
		{
			int a=a1.get(i);
			int b=a2.get(j);
			
			if(a<b)
			{
				a3.add(a);
				i++;
			}
			if(b<a)
			{
				a3.add(b);
				j++;
			}
			if(a==b)
			{
				a3.add(a1.get(i));
				a3.add(a2.get(j));
				i++;
				j++;
			}
		}
		
		while(i<a1.size())
		{
			a3.add(a1.get(i));
			i++;
		}
		while(j<a2.size())
		{
			a3.add(a2.get(j));
			j++;
		}
	}
	
	public void dispArrayList1()
	{
		System.out.println ("\nArray List 1 Elements");
		for(int i=0;i<a1.size();i++)
		{
			System.out.print (a1.get(i)+" ");	//get(i)METHOD RETURNS THE ELEMENT IN THE LIST AT INDEX i
		}
		System.out.println ("");
	}
	
	public void dispArrayList2()
	{
		System.out.println ("\nArray List 2 Elements");
		System.out.println (a2);	//WE CAN DIRECTLY PRINT THE LIST
	}
	
	public void dispMergedArrayList()
	{
		System.out.println ("\nMerged Array List Elements");
		for(int i=0;i<a3.size();i++)
		{
			System.out.print(a3.get(i)+" ");
		}
		System.out.println ("");
	}
}

class TestMerge2SortedArrayList
{
	public static void main (String[] args) 
	{
		Merge2SortedArrayList ob=new Merge2SortedArrayList();
		Scanner sc=new Scanner(System.in);
		int ch;
		
		System.out.println ("\n1.Insert List1 \t2.Insert List2 \t3.Merge Two Lists");
		System.out.println ("4.Disp List1 \t5.Disp List2 \t6.Disp Merged List \n7.Exit");
		
		do
		{

			System.out.print ("\nENTER CHOICE  >>");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					ob.readArrayList1();
					break;
				case 2:
					ob.readArrayList2();
					break;
				case 3:
					ob.mergeTwoSortedArrayList();
					break;
				case 4:
					ob.dispArrayList1();
					break;
				case 5:
					ob.dispArrayList2();
					break;
				case 6:
					ob.dispMergedArrayList();
					break;
				case 7:
					System.out.println ("\nEXIT");
					break;
				default:
					System.out.println ("\nWrong Input");
					break;
			}
		}while(ch!=7);
	}
}