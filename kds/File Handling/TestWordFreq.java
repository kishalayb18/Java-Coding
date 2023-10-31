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
				System.out.println ("Enter String");
				s=d.readLine();
				bw.write(s);
				break;	
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
			FileWriter fw1=new FileWriter("WordFreq.txt");
			BufferedWriter bw1=new BufferedWriter(fw1);
			
			BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the word thats frequency you want to find: ");
			String x=d.readLine();
			bw1.write("Frequency Searched For The Word '"+x+"'");
			
			int c=0;
			StringTokenizer st=new StringTokenizer(s);
			int m=st.countTokens();
			while(st.hasMoreTokens()==true)
			{
				String q=st.nextToken();
				if(q.equals(x)==true)
					{
						c++;
					}	
			}
			
			bw1.write("\nFreq="+c+"/"+m);
			bw1.close();
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