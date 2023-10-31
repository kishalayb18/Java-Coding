
import java.util.*;
class acc
{
	private String name;
    private int no;
    protected double bal;
    
    public acc()
    { 
    	name="";
    	no=0;
    	bal=0;
    }
    public acc(String a,int b,double c)
    { 
    	name=a;
    	no=b;
    	bal=c;	
    }
    public void acc_disp()
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
	public savings(String m1,int m2,double m3)
	{
		super(m1,m2,m3);
	}
	public void read_ammount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ammount: ");
		ammount=sc.nextInt();	
	}
	public void withdraw()
	{
		read_ammount();
		double  x=bal-ammount;
		if(x>=1000)
		{
			bal=x;
			System.out.println("current bal : "+bal);
		}
		else
		{
			System.out.println("withdraw not possible");
		}	
	}
	public void diposite()
	{
		read_ammount();
		double x=bal+ammount;
		if(ammount>=100)
		{
			bal=x;
			System.out.println("current bal : "+bal);
		}
		else
		{
			System.out.println("diposite not possible");
		}
} 
}

class test
{
	public static void main(String[] args)
	{
		savings h=new savings();
		h.read();
		h.withdraw();
		h.diposite();
	}
} 