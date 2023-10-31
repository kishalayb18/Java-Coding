import java.io.*;
class node
{
	String name;
	node next;
}

class linklist 
{
     private node start;
     public linklist() 
     {
     	start=null;
     }  
     
     public void insend() throws IOException
     {
     	DataInputStream d=new DataInputStream(System.in);
     	node cur=new node();
     	cur.next=null;
     	
     	System.out.println ("Enter name :");
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
     public void insbegin() throws IOException
     {
     	DataInputStream d=new DataInputStream(System.in);
     	node cur=new node();
     	cur.next=null;
     	
     	System.out.println ("Enter name :");
     	cur.name=d.readLine();
     	
     	cur.next=start;
     	start=cur;
     }
     
     public void insbetween() throws IOException
     {
     	DataInputStream d=new DataInputStream(System.in);
     	node cur=new node();
     	cur.next=null;
     	
     	System.out.println ("Enter name :");
     	cur.name=d.readLine();
     	
     	System.out.println ("pos=");
     	int p=Integer.parseInt(d.readLine());
     	int i=0;
     	node c=null;
     	for(c=start;c!=null;c=c.next)
     	{
     		i++;
     		if(i==p-1)
     		{
     			cur.next=c.next;
     			c.next=cur;
     			break;
     		}
     	}
     }
     
     public void del() throws IOException
     {
     	DataInputStream d=new DataInputStream(System.in);
     	
     	System.out.println ("pos=");
     	int p=Integer.parseInt(d.readLine());
     	if(p==1)
     	{
     		start=start.next;
     		return ;
     	}
     	int i=0;
     	node c=null;
     	for(c=start;c!=null;c=c.next)
     	{
     		i++;
     		if(i==p-1)
     		{
     			c.next=c.next.next;
     			break;
     		}
     	}
     }
     
     public void list()
     {
     	node c=null;
     	System.out.println ("\n"+"list : ");
     	for(c=start;c!=null;c=c.next)
     	{
     		System.out.println (c.name);
     	}
     }	
}

class test
{
	public static void main (String[] args) throws IOException
	{
		linklist ls=new linklist();
		int t=0;
		DataInputStream y=new DataInputStream(System.in);
		do
		{
			System.out.println ("1. ins end "+"\n"+"2. list "+"\n"+"3. ins begin"+"\n"+"4. ins between"+"\n"+"5. del"+"\n"+"6. exit");
			System.out.println ("enter choice?");
			t=Integer.parseInt(y.readLine());
			switch(t)
			{
				case 1:
					ls.insend();
					ls.list();
				    break;
				case 2:
					 ls.list();
					 break;
				case 3:
					 ls.insbegin();
					 ls.list();
					 break;
				case 4:
					 ls.insbetween(); 
					 ls.list();
					 break;
				case 5:
					 ls.del();
					 ls.list();
					 break;					 					 					 
			}
		}while(t!=6);		      	
		
    }
}