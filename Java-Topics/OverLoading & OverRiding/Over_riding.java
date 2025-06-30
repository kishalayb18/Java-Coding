import java.util.*;

abstract class Instrument
{
	abstract public void play();
}

class Piano extends Instrument
{
	public void play()
	{
		System.out.println ("tan tan tan tan");
	}
}

class  Flute extends Instrument
{
	public void play()
	{
		System.out.println ("toot toot toot toot");
	}
}

class  Guitar extends Instrument
{
	public void play()
	{
		System.out.println ("tin tin tin tin");
	}
}

class Over_riding
{
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		Instrument [] x;
		x=new Instrument[5];
		
		for(int j=0;j<x.length;)
		{
			double z=Math.random();
			
			int i=(int) (10*z);
		//System.out.println (z+" "+i);
			if(i==1)
			{
				x[j++]=new Piano();
			}
			else if(i==2)
			{
				x[j++]=new Flute();	
			}
			else if(i==3)
			{
				x[j++]=new Guitar();	
			}
		}
		for(int k=0;k<x.length;k++)
		{
			x[k].play();
			
			if(x[k] instanceof Piano==true)
			{
				System.out.println ("obj of Piano");
				//Piano h=(Piano) x[k];
				//h.play();
			}
			else if(x[k] instanceof Flute==true)
			{
				System.out.println ("Obj of Flute");
			}
			else if(x[k] instanceof Guitar==true)
			{
				System.out.println ("Obj of Guitar");
			}
		}
	}
}