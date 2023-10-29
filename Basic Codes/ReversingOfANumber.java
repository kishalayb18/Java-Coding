import java.util.*;

class ROAN
{
	private int num;
	private String s;
	int arr[];
	public ROAN()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print ("Enter the number: ");
		s=sc.next();
	}
	
	public void reverseNumber()
	{
		try
		{
			arr=new int[s.length()];
			num=Integer.parseInt(s);
			
			int i=0,d,mul=1,revNum=0;
			while(num>0)
			{
				d=num%10;
				arr[i]=d;
				i++;
				num=num/10;	
			}
			
			for(i=arr.length-1;i>=0;i--)
			{
				revNum=revNum+(arr[i]*mul);
				mul=mul*10;
			}
			System.out.println ("The reversed number is: "+revNum);
			
		}
		catch(NumberFormatException nfe)
		{
			System.out.println (nfe);
		}
		
	}
}

class MainROAN
{
	public static void main (String[] args) {
		ROAN ob=new ROAN();
		ob.reverseNumber();
	}
}