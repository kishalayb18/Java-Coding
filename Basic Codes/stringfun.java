import java.io.*;
import java.util.*;

class find
{
	private String st;
	
	public find()
	{
		st="";
	}
	
	public find(String s)
	{
		st=s;
	}
	
	public void word()
	{
		String[] x=st.split(" ");
		System.out.println("NO OF WORDS : "+x.length);
	}
	
	public void longest_shortest()
	{
		int l=0,s=0;
		String longest="",shortest="";
		
		StringTokenizer str1=new StringTokenizer(st);
		StringTokenizer str2=new StringTokenizer(st);
		while(str1.hasMoreTokens()==true)
		{
			String t=str1.nextToken();
			
			if(t.length()>longest.length())
			{
				longest=t;
				l=longest.length();
			}
		}
		
		System.out.println("LONGEST WORD : "+longest+"\t"+"NUMBER OF LETTERS : "+l);
		
		shortest=longest;
		s=l;
		while(str2.hasMoreTokens()==true)
		{
			String q=str2.nextToken();
			
			if(q.length()<shortest.length())
			{
				shortest=q;
				s=shortest.length();
			}
		}
		
		System.out.println("SHORTEST WORD : "+shortest+"\t"+"NUMBER OF LETTERS : "+s);
	}
	
	public void frequency()
	{
		for(int i=0;i<st.length();i++)
		{
			char c=st.charAt(i);
			boolean flag=false;
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(st.charAt(j)==c)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				for(int k=0;k<st.length();k++)
				{
					if(st.charAt(k)==c)
						count++;
				}
				if(c==' ')
					System.out.println("<space>"+"\t"+count);
				else
					System.out.println(c+"\t"+count);
			}
		}
	}
}

public class stringfun
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();
		
		find ob=new find(str);
		ob.word();
		ob.longest_shortest();
		ob.frequency();
	}
}