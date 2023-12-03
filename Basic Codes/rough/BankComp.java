import java.io.*;
class BankComp
{
	int []a1; float []a2;
	int p,y, sum=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	public BankComp()
	{
		a1=new int [100];
		a2=new float [100];
	}
	
	public void readInputs()
	{
		try
		{
			System.out.print ("Enter Capital Amt: ");
			p=Integer.parseInt(br.readLine());
			System.out.print ("Enter Total time: ");
			y=Integer.parseInt(br.readLine());
			System.out.println ("Enter No. Of Slabs Of Bank A: ");
			int s1=Integer.parseInt(br.readLine());
			for(int i=0; i<2*s1;i++)
			{
				a1[i]=Integer.parseInt(br.readLine());//Float.parseFloat(br.readLine());
			}
		/*	for(int i=0; i<s1;i++)
			{
				System.out.print (">>" +a1[i]+" ");
			}*/
			
			
		}
		catch(IOException e1)
		{
			System.out.println ("INPUT ERROR");
		}
		catch(NumberFormatException e2)
		{
			System.out.println ("N-f-e");
		}
	}
}

class TestBankComp
{
	public static void main (String[] args) 
	{
		BankComp ob=new BankComp();
		ob.readInputs();
	}
	
}