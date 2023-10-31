import java.io.*;
import java.util.*;
class WordFreq
{
	private String s;
	
	public void write_file()
	{
		try
		{
			DataInputStream d=new DataInputStream(System.in);
			FileWriter fw=new FileWriter("WordFreq.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			
			while(true)
			{
				System.out.println ("Enter String (type end to stop) : ");
				s=d.readLine();
				if(s.equals("end")==true)
					break;
									
				bw.write(s);
				bw.write("\n");	
			}
			
			bw.close();
		}
		catch(IOException e1)
		{
		}
	}
	
	public void read_file()
	{
		try
		{
			FileReader fr= new FileReader("WordFreq.txt");
			BufferedReader br=new BufferedReader(fr);
			String s1="";
			while((s1=br.readLine())!=null)
			{
				System.out.println(s1);
			}
			br.close();
		}
		catch(IOException e2)
		{
		}	
	
	}
	public void freq_Word()
	{
		try
		{
			
			BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the word thats frequency you want to find: ");
			String x=d.readLine();
			
			FileReader fr= new FileReader("WordFreq.txt");
			BufferedReader br=new BufferedReader(fr);
			String s1="";
			int m=0;
			int c=0;
			while((s1=br.readLine())!=null)
			{
			
			
			StringTokenizer st=new StringTokenizer(s1);
			m=m+st.countTokens();
			while(st.hasMoreTokens()==true)
			{
				String q=st.nextToken();
				if(q.equals(x)==true)
					{
						c++;
					}	
			}
			}
			br.close();
			System.out.println ("\nFreq="+c+"/"+m);

		}
		catch(IOException e)
		{
			System.out.println("Input Error");
		}
	}
	
}


class TestWordFreq
{
	public static void main (String[] args) {
	WordFreq ob=new WordFreq();
	ob.write_file();
	ob.freq_Word();
	ob.read_file();

}
}