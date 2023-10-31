import java.io.*;
import java.util.*;
class fl
{
	private String s;

	public void write() 
	{
		try
		{
		DataInputStream d=new DataInputStream(System.in); 
		
		File f1=new File("F:\\Documents\\Java\\kds\\File\\f1.txt"); //creating file object

		FileOutputStream w=new FileOutputStream(f1);	//to write
		
		System.out.println ("Enter string ::");
		s=d.readLine();
		byte[] b=s.getBytes();	//bytes array conversion
		w.write(b);
		w.close();
		}
		catch(IOException e1)
		{
		}
	}

	public void read() throws IOException
	{
		File f1=new File("F:\\Documents\\Java\\kds\\File\\f1.txt");
		FileInputStream r=new FileInputStream(f1);
		int c;
		while((c=r.read())!=-1)
		{
			System.out.print( (char )c );
		}
		r.close();
	}

	public void freq_char() throws IOException
	{
		File f1=new File("F:\\Documents\\Java\\kds\\File\\f1.txt");
		FileInputStream r=new FileInputStream(f1);
		int c;
		String t="";
		while((c=r.read())!=-1)
		{
		t=t+( (char )c );
		}
		
		System.out.println ();
		t=t.toLowerCase();
		
		for(int i=97;i<=122;i++)
		{
			int ct=0;
			for(int j=0;j<t.length();j++)
			{
				if(t.charAt(j)==i)
					ct++;
			}
			if(ct!=0)
				System.out.println (((char)i)+"  "+ct);
		}
		
		r.close();
	}
	
	public static void main (String[] args) throws IOException
	{
		fl k=new fl();
		k.write();
		k.read();
	    k.freq_char();
	}
}		