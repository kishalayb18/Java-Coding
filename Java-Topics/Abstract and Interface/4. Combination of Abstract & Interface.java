abstract class class1
{
  abstract public void gx();
}

abstract class class2
{
	abstract public void fx();
}

class ex extends class1
{
	public void gx() 
	{
		System.out.println ("hello");
	}
}

interface x
{
	final String s="Welcome";
	public void disp(String s);
}

interface y
{
	public void mess();
}

interface z extends x,y	//INTERFACE INHERITS INTERFACE, WHICH IS NOT POSSIBLE IN CASE OF ABSTRACT
{
	public void show();
}

final class q extends ex implements x,y	//COMBINATION OF ABSTRACT CLASS AND INTERFACE
{
	public void disp(String name)//from interface x
	//public keyword is mandatory while overriding interface's methods 
	{
		System.out.println (s+"  "+name);
	}
	public void mess()//from interface y
	{
		System.out.println ("Good bye");
	}
}

class test
{
	public static void main (String[] args) 
	{
		q ob=new q();
		ob.disp("ram");
		ob.mess();
    }
}
