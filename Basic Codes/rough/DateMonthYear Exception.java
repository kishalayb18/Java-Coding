import java.util.*;
import java.io.*;
import java.text.*;

class DayException extends Exception
{
	public DayException()
	{
		System.out.println ("DayException:Invalid Day");
	}
}

class MonthException extends Exception
{
	public MonthException()
	{
		System.out.println ("MonthException:Invalid Day");
	}
}

class YearException extends Exception
{
	public YearException()
	{
		System.out.println ("YearException:Invalid Day");
	}
}

class DateValidation
{
	public void checkDate()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			String arr[]=s.split("/");
			
			int d=Integer.parseInt(arr[0]);
			int m=Integer.parseInt(arr[1]);
			int y=Integer.parseInt(arr[2]);
			
			
			if(d<1||d>31)
			{
				throw new DayException
					
			}
				
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");			
			sdf.setLenient(false);
			Date dt=new Date();
			DateFormat df;
			
			dt=sdf.parse(s);		
			df=DateFormat.getDateInstance(DateFormat.LONG);
			
			String s1=df.format(dt);
			System.out.println (s1);
		}
		catch(DayException de)
		{
			
		}
		catch(MonthException me)
		{
			
		}
		catch(YearException ye)
		{
			
		}
		catch(ParseException pe)
		{
			
		}

	}
}

class SourceDateMonthYearException
{
	public static void main (String[] args) throws ParseException,DayException,MonthException,YearException
	{
		DateValidation ob=new DateValidation();
		ob.checkDate();
	}
}