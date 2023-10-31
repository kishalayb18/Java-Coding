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
		System.out.print("\nEnter Acc. Holder Name: ");
		ahname=sc.nextLine();
		System.out.print("\nEnter Acc. No. : ");
		accno=sc.nextInt();
		System.out.print("\nEnter Balance: ");
		bal=sc.nextInt();
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
	
	Scanner sc= new Scanner(System.in);
	public void deposit()
	{
	//	Scanner sc= new Scanner(System.in);
		System.out.print("Enter amout to deposit: ");
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
	//	Scanner sc= new Scanner(System.in);
		System.out.print("Enter amout to Withdraw: ");
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

class Banking
{
	public static void main (String[] args) {
		int ch;
		Savings ob=new Savings();
		ob.read_acc();
		Scanner rs=new Scanner(System.in);
		System.out.println ("\n1.Deposit \t2.Withdraw \t3.Display Accout \t4.Exit" );
		do
		{
			System.out.print ("\nEnter Choice: ");
			ch=rs.nextInt();
			System.out.println ("");
			
			switch(ch)
			{
				case 1: 
					ob.deposit();
					break;
				case 2:
					ob.withdraw();
					break;
				case 3:
					ob.disp_acc();
					break;
				case 4:
					System.out.println ("\nEXIT");
					break;
				default:
					System.out.println ("Wrong Choice");
					break;
			}
		}while(ch!=4);
	}
}