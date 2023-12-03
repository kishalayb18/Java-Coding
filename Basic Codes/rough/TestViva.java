/*class Base
{
	private int data;
	public Base()
	{
		data=5;
	}
	public int getData()
	{
		return this.data;
	}
}

class Derived extends Base
{
	private int data;
	public Derived()
	{
		data=6;
	}
	private int getData()
	{
		return data;
	}
	public static void main (String[] args) {
		Derived myData=new Derived();
		System.out.println (myData.getData());
	}
}*/


class Abc
{
	String s,a="",b;
	int i;
	public void kabab(String s)
	{
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='-')
			{
				a=a+'_';
			}
			else
				a=a+s.charAt(i);
		}
		System.out.println (a);
	}

}
class Test
{
	public static void main (String[] args) 
	{
		Abc ob=new Abc();
		ob.kabab("op-po-iu");
		
		
	}
}