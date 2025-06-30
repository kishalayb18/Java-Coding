import java.io.*;

class node
{
	String name;
	node next;	//next is a refference of 'node' class here.
}

class Linklist
{
	//DECLARING START
	private node start;
	
	//DEFINING START NODE VIA DEFAULT CONSTRUCTOR
	 public Linklist()
	 {
	 	start=null;
	 }
	 
	 //INSERT AT THE END
	 public void insend() throws Exception
	 {
	 	DataInputStream d=new DataInputStream(System.in);
	 	node cur=new node();
	 	cur.next=null;	//we use the reference '
	 	
	 	System.out.println ("Enter name: ");
	 	cur.name=d.readLine();
	 	
	 	if(start==null)
	 	{
	 		start=cur;
	 		return ;
	 	}
	 	
	 	node c=start;
	 	while(c.next!=null)
	 	{
	 		c=c.next;
	 	}	 	
	 	c.next=cur;
	 }
	 
	 //INSERT AT THE BEGINNING
	 public void insbeg() throws Exception
	 {
	 	DataInputStream d=new DataInputStream(System.in);
	 	node cur=new node();
	 	cur.next=null;
	 	
	 	node temp=new node();
	 	
	 	System.out.println ("Enter name: ");
	 	cur.name=d.readLine();
	 	
	 	if(start==null)
	 	{
	 		start=cur;
	 	}
	 	else
	 	{
	 		temp=start;
	 		start=cur;
	 		cur.next=temp;
	 		
	 	}
	 	
	 }
	 
	 //LISTING THE LINKEDLIST
	 public void list()
	 {
	 	node c=null;
	 	System.out.println ("\n"+"List: ");
	 	for(c=start;c!=null;c=c.next)
	 	{
	 		System.out.println (c.name);
	 	}
	 }	
	 	
}

class TestLinkedList
{
	public static void main (String[] args) throws Exception
	{
		Linklist ls=new Linklist();
		int ch;
		
		DataInputStream y= new DataInputStream(System.in);
		do
		{
			System.out.print ("\n1.Insert Beg \t2.Insert End \t3.Display \t4.Exit");
			
			System.out.print ("\n>>Enter Choice: " );
			ch=Integer.parseInt(y.readLine());
			
			switch(ch)
			{
				case 1:
					ls.insbeg();
					break;
				case 2:
					ls.insend();
					break;
				case 3:
					ls.list();
					break;
				case 4:
					System.out.println ("EXIT");
					break;
			}
		}while(ch!=4);
	}
}