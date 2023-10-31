import java.util.*;
class Time
{
	public static int count;
	private int hour, min, sec;
	
	public Time()
	{
	
		hour=0;
		min=0;
		sec=0;
		count++;
		System.out.println("TIME->"+count);
	}
	
	public Time(int p, int q, int r)  //Parameterize Constructor
	{
		hour=p;
		min=q;
		sec=r;
		count++;
		System.out.println("TIME->"+count);
	}
	
	public void read()
	{

		
		while(true)
		{
			Scanner z= new Scanner(System.in);
			System.out.println("Hour: ");
			hour=z.nextInt();
			System.out.println("Minutes: ");
			min=z.nextInt();
			System.out.println("Seconds: ");
			sec=z.nextInt();
			if((sec>=0&&sec<60 ) && (min>=0&&min<60) &&(hour>=0&&hour<24))
				break;
		}
	}
	
	public void disp()
	{
		System.out.println(hour+":"+min+":"+sec);
	}
	
	public static Time add(Time t1, Time t2)
	{
		Time t3= new Time();
		t3.hour=t1.hour+t2.hour;
		t3.min=t1.min+t2.min;
		t3.sec=t1.sec+t2.sec;
		
		if(t3.sec>=60)
		{
			t3.min++;
			t3.sec=t3.sec-60;	
		}
		if(t3.min>=60)
		{
			t3.hour++;
			t3.min=t3.min-60;
		}

		t3.hour=t3.hour%24;
		
		return t3;
	}
	
}

	class Timemain
	{
	
		public static void main (String[] args) 
		{
			Time x=new Time();
			x.read();
			
			Time y= new Time();
			y.read();
			
			Time z=Time.add(x,y);
			
			x.disp();
			y.disp();
			z.disp();
		}
	}