import java.io.*;
import java.util.*;

class SortNames
{
	private String s;
	public SortNames()
	{
	
	}

	
	public void writeFile()
	{
		try
		{
			DataInputStream d= new DataInputStream(System.in);
			FileWriter fw= new FileWriter("unsorted.txt");		/******* 1 ********/
			BufferedWriter wr=new BufferedWriter(fw);
	
			while(true)
			{
			 	System.out.println ("Enter String: ");
			 	s=d.readLine();
			 	s=s.toLowerCase();
			 	
			 	if(s.equals("end"))
			 	{
			 		break;
			 	}			 	
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


	public void sort()
	{		
		try
		{
	    FileReader fr=new FileReader("unsorted.txt");		
		BufferedReader br=new BufferedReader(fr);
		String s1="";
		int i,j;
		String[] arr=new String[100];
		int cnt=0;
		while((s1=br.readLine())!=null)
		{
			arr[cnt]=s1;
			cnt++;
		}
		br.close();
		
			for(i=0;i<cnt-1;i++)
			{
				for(j=0;j<cnt-i-1;j++)
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
			for(i=0;i<cnt;i++)
			{
				bw.write(arr[i]);
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
	ob.writeFile();		
	ob.sort();
}
}