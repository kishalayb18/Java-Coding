import java.util.*;
class acc
{
	private String name;
	private int no;
	protected double bal;
	public acc()
	{
		name=" ";
		no=0;
		bal=0;
	}
	public acc(String s1,int s2,double s3)
	{
		name=s1;
		no=s2;
		bal=s3;
			
	}
	public void acc_info()
	{
		System.out.print("Name:"+name+"Account no:"+no+"bal:"+bal);
	}
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		name=sc.next();
		System.out.println("Enter Acc no: ");
		no=sc.nextInt();
		System.out.println("balance: ");
		bal=sc.nextInt();
		
	}
	
}
class savings extends acc
{
	protected int ammount;
	public savings()
	{
		super();
		ammount=0;
	}
	public savings(String m1,int m2,double m3,int m4 )
	{
		super(m1,m2,m3);
		ammount=m4;
	}
	public void read_amount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ammount: ");
		ammount=sc.nextInt();
		
	}
	public void withdraw()
	{
		read_amount();
		if(bal-ammount>=1000)
		{
			bal=bal-ammount;
			System.out.println ("cur bal :"+bal);
		}
		else
		{
			System.out.println ("withdraw not possible");
		}
	}
	
    public void deposit()
	{
		read_amount();
		if(ammount>=100)
		{
			bal=bal+ammount;
			System.out.println ("cur bal :"+bal);
		}
		else
		{
			System.out.println ("diposit not possible");
		}
	}
	

}
class test
{
	public static void main(String[] args)
	{
	
		savings x=new savings();
		x.read();
		x.acc_info();
		//x.withdraw();
		x.deposit();
	}
}