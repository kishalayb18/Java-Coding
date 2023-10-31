import java.io.*;

class item
{
	private String name;
	private int rate,number,tot;
	
	public item()
	{
		name="";
		rate=0;
		number=0;
		tot=rate*number;
	}
	
	public item(String n,int r,int num)
	{
		name=n;
		rate=r;
		number=num;
		tot=rate*number;
	}
	
	public void item_read() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Item Name : ");
		name=br.readLine();
		System.out.print("Enter Rate : Rs.");
		rate=Integer.parseInt(br.readLine());
		System.out.print("Enter Number Of Entity : ");
		number=Integer.parseInt(br.readLine());
	}
	
	public void item_calculate()
	{
		tot=rate*number;
	}
	
	public void item_display()
	{
		System.out.println("ITEM NAME : "+name);
		System.out.println("RATE : "+rate);
		System.out.println("NUMBER OF ENTITY : "+number);
		System.out.println("TOTAL AMOUNT : Rs."+tot);
	}
	
	public int get_total()
	{
		return tot;
	}
}

class customer
{
	private String name;
	private item[] x;
	
	public customer()
	{
		name="";
		x=new item[10];
	}
	
	public customer(String na,int n)
	{
		name=na;
		x=new item[n];
	}
	
	public void custo_read() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Customer Name : ");
		name=br.readLine();
		System.out.println("Enter How Many Items");
		int n=Integer.parseInt(br.readLine());
		x=new item[n];
		for(int i=0;i<x.length;i++)
		{
			x[i]=new item();
			x[i].item_read();
			x[i].item_calculate();
		}
	}
	
	public void custo_disp()
	{
		System.out.println("CUSTOMER NAME : "+name);
		int tot=0;
		for(int j=0;j<x.length;j++)
		{
			x[j].item_display();
			tot+=x[j].get_total();
		}
		System.out.println("TOTAL AMOUNT PAYABLE : Rs."+tot);
	}
	
	public String get_name()
	{
		return name;
	}
}

class shop
{
	private customer[] y;
	
	public shop()
	{
		y=new customer[10];
	}
	
	public shop(int n)
	{
		y=new customer[n];
	}
	
	public void read() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter How Many Customers");
		int n=Integer.parseInt(br.readLine());
		y=new customer[n];
		for(int a=0;a<y.length;a++)
		{
			y[a]=new customer();
			y[a].custo_read();
		}
	}
	
	public void arrange()
	{
		customer t;
		
		for(int i=1;i<y.length;i++)
		{
			for(int j=0;j<y.length-i;j++)
			{
				if(y[j].get_name().compareTo(y[j+1].get_name())>0)
				{
					t=y[j];
					y[j]=y[j+1];
					y[j+1]=t;
				}	
			}
		}
	}
	
	public void display()
	{
		for(int k=0;k<y.length;k++)
		{
			y[k].custo_disp();
		}
	}
	
	public void user() throws IOException
	{
		boolean flag=false;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Customer To Search");
		String ser=br.readLine();
		for(int l=0;l<y.length;l++)
		{
			if(y[l].get_name().compareTo(ser)==0)
			{
				flag=true;
				y[l].custo_disp();
				break;
			}
		}
		
		if(flag==false)
			System.out.println("NO ENTRY FOUND");
	}
}

public class shop_bill
{
	public static void main(String[] args) throws IOException
	{
		shop ob=new shop();
		ob.read();
		ob.arrange();
		ob.display();
		ob.user();
	}
}