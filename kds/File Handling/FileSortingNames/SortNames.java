import java.io.*;
import java.util.*;

class SortNames
{
	private String s;
	String[] arr;
	int i=0;
	int cnt=0;
	SortNames()
	{
		arr=new String[100];
	}

	
	public void writeFile()
	{
		try
		{
			DataInputStream d= new DataInputStream(System.in);
			FileWriter fw= new FileWriter("unsorted.txt");		/******* 1 ********/
			BufferedWriter wr=new BufferedWriter(fw);
			wr.write("UNSORTED NAME LIST:\n\n");
			while(true)
			{
			 	System.out.println ("Enter String: ");
			 	s=d.readLine();
			 	s=s.toLowerCase();
			 	
			 	if(s.equals("end"))
			 	{
			 		break;
			 	}
			 	
				wr.write(i+1+". "+s);
			 	wr.write("\n");
			 	
			 	arr[i]=s;
			 	i++;
			 	cnt++;
			 				 	
			}
			wr.close();
		}
		catch(IOException e1)
		{
			System.out.println (e1);
		}
	}


	public void readFile() throws IOException
	{
		FileReader fr=new FileReader("unsorted.txt");		/******* 2 ********/
		BufferedReader br=new BufferedReader(fr);
		String s1="";
		int i=0;
		while((s1=br.readLine())!=null)
		{
			System.out.println (s1);
			

		}
		br.close();
	}
	
	public void sort()
	{		try
			{
	
			for(int i=0;i<cnt-1;i++)
			{
				for(int j=0;j<cnt-i-1;j++)
				{
					if(arr[j].compareTo(arr[j+1])>0)
					{
						String temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			
			FileWriter fw1=new FileWriter("sorted.txt");
			BufferedWriter bw=new BufferedWriter(fw1);
			bw.write("SORTED NAME LIST:\n\n");
			for(i=0;i<cnt;i++)
			{
				bw.write(i+1+". "+arr[i]);
				bw.write("\n");
			}
			bw.close();
			}
			catch(IOException e3)
			{
				
			}
		}
}

class TestSortNames
{
	public static void main (String[] args) throws IOException {
	SortNames ob=new SortNames();
	ob.writeFile();		//INPUT
	//ob.disp();
	ob.readFile();		//OUTPUT
	ob.sort();
}
}