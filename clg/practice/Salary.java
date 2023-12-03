class Sal
{
	double b, da, hra, ma, gr;
	
	Sal()
	{
		b=0;
	}
	Sal(double z)
	{
		b=z;
		System.out.println ("Basic: "+z);
	}
	double  reg(double z)
	{
		b=z;
		da=b*(15.0/100);
		hra=b*(12.0/100);
		ma=b*(0.5/100);
		double regsal=b+da+hra+ma;
		System.out.println ("Regular Sal="+regsal);
		return regsal;
	}
}

class Sci extends Sal
{
	Sci()
	{
		System.out.println ("SCIENTIST");
	}
	Sci(double a)
	{
		super(a);
	}
	
	void netsci(double a, int i)
	{
		int pub=1500;
		int pub_bon=pub*i;
		double net_sci=reg(a)+pub_bon;
		System.out.println ("Number of publication: "+i);
		System.out.println ("Bonus/Publication: "+pub);
		System.out.println ("Net Salary: "+net_sci);
		System.out.println ("");	
	}
		
}

class Leader extends Sal
{
	Leader()
	{
		System.out.println ("PROJECT LEADER");
	}
	Leader(double a)
	{
		super(a);
	}
	
	void netlead(double a, int i)
	{
		int proj=1000;
		int proj_bon=proj*i;
		double net_lead=reg(a)+proj_bon;
		System.out.println ("Number of Projects: "+i);
		System.out.println ("Bonus/Project: "+proj);
		System.out.println ("Net Salary: "+net_lead);
		System.out.println ("");	
	}
		
}


class Developer extends Sal
{
	Developer()
	{
		System.out.println ("DEVELOPER");
	}
	Developer(double a)
	{
		super(a);
	}
	
	void netdeve(double a, int i)
	{
		int pat=800;
		int pat_bon=pat*i;
		double net_deve=reg(a)+pat_bon;
		System.out.println ("Number of Patents: "+i);
		System.out.println ("Bonus/Patent: "+pat);
		System.out.println ("Net Salary: "+net_deve);
		System.out.println ("");	
	}
		
}


class Salary
{
	public static void main (String[] args) 
	{
		double m=Double.parseDouble(args[0]);
		double a=Double.parseDouble(args[1]);
		double x=Double.parseDouble(args[2]);
		int n=Integer.parseInt(args[3]);
		int b=Integer.parseInt(args[4]);
		int y=Integer.parseInt(args[5]);
		
		Sci s1=new Sci();
		Sci s2=new Sci(m);
		s2.netsci(m,n);
		
		Leader p1=new Leader();
		Leader p2=new Leader(a);
		p2.netlead(a,b);
		
		Developer d1=new Developer();
		Developer d2=new Developer(x);
		d2.netdeve(x,y);
		
	}
}