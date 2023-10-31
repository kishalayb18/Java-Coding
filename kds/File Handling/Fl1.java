import java.io.*;
import java.util.*;
class Fl1
{
	private String s;
	
	public void write()
	{
		try
		{
			DataInputStream d=new DataInputStream(System.in);
			
			FileWriter f=new FileWriter("xy.txt");
			BufferedWriter wr=new BufferedWriter(f);
			
			while(true)
			{
				System.out.println ("Enter String: ");
				s=d.readLine();
				s=s.toLowerCase();
				if(s.equals("end"))
					break;
				wr.write(s);
				wr.write("\n");
			}
			
			wr.close();
		}
		catch(IOException e1)
		{
			System.out.println (e1);
		}
	}
	
	
	public void read() throws IOException
	{
		FileReader fr=new FileReader("xy.txt");
		BufferedReader br=new BufferedReader(fr);
		String s1="";
		
		while((s1=br.readLine()) != null)
		{
			System.out.println (s1);
		}
		br.close();
	}
	
	
	public static void main (String[] args) throws IOException {
		
		Fl1 ob=new Fl1();
		ob.write();
		ob.read();
		
}

}