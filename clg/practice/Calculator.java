public class Calculator
{
	//int a,b;
	static void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition is: "+c);
	}

	static void sub(int a, int b)
	{
		int c=a-b;
		System.out.println("Substraction is: "+c);
	}

	static void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("Multiplication is: "+c);
	}

	static void div(int e, int f)
	{
		int g=e/f;
		System.out.println("Divition is: "+g);
	}

	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		Calculator.add(a,b);
		Calculator.sub(a,b);
		Calculator.mul(a,b);
		Calculator.div(a,b);
	}
}