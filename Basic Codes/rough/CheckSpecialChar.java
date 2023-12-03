import java.util.*;
import java.io.*;

class CheckSpecialChar
{
	
	
	public boolean checkingSpChr(String str)
	{
		String spArr[]={"@","#","$","%","^","&","*","(",")","-","+","/",":",".",",","<",">","?","|"};
		boolean flag=false;
		for(String e:spArr)
		{
			if(str.contains(e))
			{
				 flag=true;
				 break;
			}
		}
		return flag;
	}	
}

class MainCheckSpecialChar
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		CheckSpecialChar ob=new CheckSpecialChar();
		boolean b=ob.checkingSpChr(s);
		System.out.println (b);
	}
}
