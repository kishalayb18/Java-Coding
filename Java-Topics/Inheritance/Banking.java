import java.util.*;
class Account
{
	private String ahname;
	private int accno;
	protected int bal;
	
	public Account()
	{
		ahname="";
		accno=0;
		bal=0;
	}
	
	public Account(String p, int q, int r)
	{
		ahname=p;
		accno=q;
		bal=r;
	}
	
	public void read_acc()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println ("Enter Acc. Holder Name: ");
		ahname=sc.nextLine();
		System.out.println ("Enter Acc. No. ");
		accno=sc.nextInt();
		System.out.println ("Enter Balance: ");
		bal=sc.nextInt();
	}
	
	public int get_acno()
	{
		return accno;
	}
	
	public void disp_acc()
	{
		System.out.println ("Acc. Holder Name: "+ahname);
		System.out.println ("Account No. "+accno);
		System.out.println ("Balance: "+bal);
	}
}

final class Savings extends Account
{
	private int amt;
	public Savings()
	{
		super();
		amt=0;
	}
	
	public Savings(String a, int b, int c)
	{
		super(a,b,c);
	}
	
	public void deposit()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println ("Enter amout to deposit: ");
		amt=sc.nextInt();
		if(amt<100)
		{
			System.out.println ("Invalid Transaction");			
		}
		else
		{
			bal=bal+amt;
		}
		System.out.println ("Balance: "+bal);
	}
	
	public void withdraw()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println ("Enter amout to withdraw: ");
		amt=sc.nextInt();
		if(bal-amt<1000)
		{
			System.out.println ("Invalid Transaction");
		}
		else
		{
			bal=bal-amt;
		}
		System.out.println ("Balance: "+bal);
	}
		
}

class Bank
{
	  private Savings x[];
	  private int cnt=0;
	  int c;
	  public Bank()
	  {
	  	x= new Savings [5];
	  	cnt=0;
	  }
	  public Bank(int m)
	  {
	  	x= new Savings[m];
	  	cnt=m;
	  }
	  
	  public void newac()
	  {
	  	try
	  	{
	  			x[cnt]= new Savings();	//ARRAY OF OBJECTS
	  			x[cnt].read_acc();
	  			cnt++;
	  		
	  	}
	  	catch(ArrayIndexOutOfBoundsException e)
	  	{
	  		System.out.println ("Overflow");
	  	}
	  }
	  
	  public void transaction()
	  {
	  	Scanner sc=new Scanner(System.in);
	  	
	  	System.out.print ("Enter Accout No. ");
	  	int a=sc.nextInt();
	  	boolean flag=false;
	  	for(int i=0; i<cnt;i++)
	  	{
	  		
	  		if(x[i].get_acno()==a)
	  		{	  			
	  			  flag=true;
	  				System.out.println ("1. Deposit \t2.Withdraw \t3.Current Balance");
	  				System.out.print ("Enter Choice: ");
	  				c=sc.nextInt();
	  				switch(c)
	  				{
	  					case 1:
	  						x[i].deposit();
	  						break;
	  					case 2:
	  						x[i].withdraw();
	  						break;
	  					case 3:
	  						x[i].disp_acc();
	  						break;	
	  				}
	  				break;
	  		}
	  	}
	  		
	  		if(flag==false)
	  		{
	  			System.out.println ("Wrong a/c no.");
	  		}
	  	
	  }
}


class Banking
{
	public static void main (String[] args) {
		int ch;
		Bank ob=new Bank();
		Scanner rs=new Scanner(System.in);
		do
		{
			System.out.println ("1.Create Account \t2.Transaction \t3.Exit" );
			System.out.println ("\nEnter Choice: ");
			ch=rs.nextInt();
			
			switch(ch)
			{
				case 1: 
					ob.newac();
					break;
				case 2:
					ob.transaction();
					break;
			}
		}while(ch!=3);
	}
}
