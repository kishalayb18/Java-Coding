import java.io.*;

class word_make
{
	private String num,result,a;
	private int n;
	private String[]x={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninenteen"};
	private String[]y={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	
	public word_make()
	{
		num="";
		result="";
		a="";
		n=0;
	}
	
	public word_make(String number)
	{
		num=number;
		result="";
		a="";
		n=0;
	}
	
	public void one_digit(String t)
	{
		n=Integer.parseInt(t);
		result=result+" "+x[n-1];
	}
	
	public void two_digit(String t)
	{
		n=Integer.parseInt(t);
		if(n<=19)
		{
			result=result+" "+x[n-1];
		}
		else
		{
			a=t.substring(0,1);
			n=Integer.parseInt(a);
			result=result+" "+y[n-2];
			a=t.substring(1);
			if(a.compareTo("0")!=0)
				one_digit(a);
		}
	}
	
	public void three_digit(String t)
	{
		a=t.substring(0,1);
		n=Integer.parseInt(a);
		result=result+" "+x[n-1]+" hundred ";
		a=t.substring(1);
		if(a.compareTo("00")!=0)
			two_digit(a);
	}
	
	public void number()
	{
		int l=num.length();
		if(l==1)
			one_digit(num);
		else if(l==2)
			two_digit(num);
		else
			three_digit(num);
	}
	
	public void display()
	{
		System.out.println(result);
	}
}

public class num_to_word
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number");
		String num=br.readLine();
		int n=Integer.parseInt(num);
		if(n==0)
			System.out.println("zero");
		else if(n<=999)
		{
			word_make ob=new word_make(num);
			ob.number();
			ob.display();
		}
		else
			System.out.println("OUT OF RANGE!!!");
	}
}