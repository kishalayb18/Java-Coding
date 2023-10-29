class Rectangle
{
	int a,b;
	void area(int a, int b)
	{
		int c;
		c= a*b;
		System.out.println("Area is: "+c);
	}

	void peri(int a, int b)
	{
		int c;
		c=2*(a+b);
		System.out.println("Perimeter is: "+c);
	}

	public static void main(String[] args)
	{
		Rectangle ob=new Rectangle();
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		ob.area(a,b);
		ob.peri(a,b);
	} 
}
