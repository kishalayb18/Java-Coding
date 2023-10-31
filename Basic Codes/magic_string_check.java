import java.io.*;

class check
{
	private String str;
	
	public check()
	{
		str="";
	}
	
	public check(String s)
	{
		str=s;
	}
	
	public int calc(int a,int b)
	{
		return b-a;
	}
	
	public boolean search()
	{
		boolean flag=false;
		
		for(int i=0;i<str.length()-1;i++)
		{
			int a=str.charAt(i);
			int b=str.charAt(i+1);
			
			int c=calc(a,b);
			if(c==1)
			{
				flag=true;
				break;
				
			}
		}
		
		return flag;
	}
	
	public void display()
	{
		boolean flag=search();
		
		if(flag==true)
			System.out.println("Magic String");
		else
			System.out.println("Not a Magic String");
	}
}

public class magic_string_check
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();
		
		check ob=new check(str);
		ob.display();
	}
}