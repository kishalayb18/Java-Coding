import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Random
{
	public void read()
	{
		try	//write the whole read code inside try while using BufferedReader
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Enter string");
		String a=br.readLine();
		System.out.println (">"+a);
		System.out.println ("Enter int");
		String b=br.readLine();
		
		int c=Integer.parseInt(b);// in 2 lines
		System.out.println (2*c);
		System.out.println ("Enter int");
		
		int d=Integer.parseInt(br.readLine());	//in one line
		System.out.println (2*d);
		}
		catch(IOException e1) //with every try there must be 1 or more than 1 catch
		{
			System.out.println (e1);
		}
	}
}
class testRandom
{
	public static void main (String[] args) throws Exception 
	{
	Random ob=new Random();
	ob.read();
	}
}