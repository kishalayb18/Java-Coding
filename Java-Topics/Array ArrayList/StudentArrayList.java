import java.util.*;

//STUDENT CLASS
class Student
{
	private int roll,math,beng,total;
	private String name;
	
	public Student()
	{
		roll=math=beng=0;
		name="";
	}
	public Student(String n,int r,int m,int b)
	{
		roll=r;
		math=m;
		beng=b;
		name=n;
	}
	public int get_roll()
	{
		return  roll;
	}
	public String get_name()
	{
		return name;
	}
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter name: ");
		name=sc.nextLine();
		System.out.print ("Enter Roll: ");
		roll=sc.nextInt();
		System.out.print("Math Score: ");
		math=sc.nextInt();
		System.out.print("Bengali Score: ");
		beng=sc.nextInt();
	}
	public void disp()
	{
		System.out.println ("Name is: "+name);
		System.out.println ("Roll is: "+roll);
		System.out.println ("Math Score is: "+math);
		System.out.println ("Bengali Score is: "+beng);
		total=math+beng;
		System.out.println ("Total score is: "+total);
		System.out.print ("\n");
	}
}

//SCHOLL CLASS
class School
{
	//CREATING ARRAYLIST REFERENCE
	private ArrayList ls;
	
	public School()
	{
		//CREATING THE STUDENT TYPE ARRAYLIST
		ls=new ArrayList<Student>();
	}
	
	
	//ADDING NEW STUDENT OBJECT IN ARRAYLIST
	public void addnew()
	{
		Student s1=new Student();
		s1.read();//read() IS A PUBLIC METHOD OF STUDENT CLASS
		ls.add(s1);
	}
	
	//DISPLAY THE COMPLETE ARRAYLIST USING FOR LOOP
	public void list()
	{
		if(ls.size()==0)
		{
			System.out.println ("\nEMPTY STUDENT LIST");
		}
		else
		{
			for(int i=0; i<ls.size();i++)
			{
				Student t=(Student) ls.get(i);
				t.disp();//disp() IS A PUBLIC METHOD OF STUDENT CLASS
				System.out.println("");
			}
		}
	}
	
	//DISPLAY THE COMPLETE ARRAYLIST USING ITERATOR
	public void list_1()
	{
		if(ls.size()==0)
		{
			System.out.println ("\nEMPTY STUDENT LIST");
		}
		else
		{
			//ITERATOR SYNTAX
			//<Iterator Keyword> <Data Type> <Iterator Variable> = <ArrayList Name>.iterator
			Iterator ir=ls.iterator();
			while(ir.hasNext()==true)
			{
				Student t=(Student) ir.next();
				t.disp();
			}
		}
	}
	
	//FIND IN ARRAYLIST WHEN THE ROLL MATCHES
	public boolean find(int roll)
	{
		boolean flag=false;//initial flag status is false
		for(int i=0;i<ls.size();i++)
		{
			Student t=(Student) ls.get(i);
			if(t.get_roll()==roll)
			{
				t.disp();
				flag=true;//if data is found, change the flag statu to true and break the loop(LINEAR SEARCH CONCEPT)
				break;
			}
		}
		return flag;//return type boolean
	}
	
	//DELETE FROM ARRAYLIST WHEN THE ROLL MATCHES
	public boolean delete(int roll)
	{
		boolean f=false;
		for(int i=0;i<ls.size();i++)
		{
			Student t=(Student) ls.get(i);
			if(t.get_roll()==roll)
			{
				ls.remove(t);
				f=true;
				break;
			}
			
		}
		return f;//return type boolean
	}
}

//MAIN CLASS
class StudentArrayList
{
	public static void main (String[] args) 
	{
		School ob=new School();
		int ch;
		Scanner s = new Scanner(System.in);
		
		//MENU DRIVEN
		do
		{
			System.out.println ("\n1. Add New Student \t2. Find Student Data \t3. List Student Data");
			System.out.println ("4. Delete Student Data \t5. Exit");
			
			System.out.print("\nENTER YOUR CHOICE >> ");
			ch=s.nextInt();
			
			switch(ch)
			{
				case 1:
					ob.addnew();
					break;
					
				case 2:
					System.out.print ("Enter Roll: ");
					int r=s.nextInt();
					if (ob.find(r)==false)
					{
						System.out.println ("DATA NOT FOUND");
					}
					break;
					
				case 3:
					ob.list();
					break;
					
				case 4:
					System.out.println ("Enter Roll Of The Student You Want To Delete\n>>Roll ");
					int a=s.nextInt();
					if(ob.delete(a)==true)
					{
						System.out.println ("Data Is Deleted.");
					}
					else
					{
						System.out.println ("DATA NOT FOUND");
					}
					break;
					
				case 5:
					System.out.println ("EXIT");
					break;
				default:
					System.out.println ("WRONG CHOICE\nSELECT FROM THE GIVEN MENU OPTION");
					break;
			}
		}while(ch!=5);
	}
}