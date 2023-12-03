class Rectangle
{

	Rectangle(int w, int l)
	{
		int f=w;
		int g=l;
		System.out.println("Width="+f);
		System.out.println("Length="+g);
		
	}
	
	
	int area(int p,int q)
	{		
		int a=p*q;
		System.out.println("Area="+a);
		return a;
	}
}

class Rectbox extends Rectangle
{

	Rectbox(int w, int l,int h)
	{
		super(w,l);
		int x=h;
		System.out.println("Height="+x);

	}
	
	void vol(int w, int l, int h)
	{
		int v=h*area(l,w);
		System.out.println( "Volume="+v);
		
	}
}

class Maintest
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		Rectbox ob1=new Rectbox(a,b,c);	
		ob1.vol(a,b,c);	
		
	}
}
