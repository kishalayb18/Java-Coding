class Volume
{

	void vol(int a, int b, int c)
	{
		int v=(a*b*c);
		System.out.println("Vol of Rectangle: "+v);
	}

	void vol(int a)
	{
		int v=a*a*a;
		System.out.println("Vol of Cube: "+v);
	}

	void vol(int r, int h)
	{
		double v=(3.14*r*r*h);
		System.out.println("Vol of Cylinder: "+v);
	}

	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		Volume ob=new Volume();
		ob.vol(a);
		ob.vol(a,b,c);	
		ob.vol(a,b);
	}
}