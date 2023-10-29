import java.util.*;
abstract class Compartment
{
	abstract public void notice();	//abstract method declaration, with no method definition
	//it is compulsory to write abstract keyword before Abstract class or Abstract method
}

class FirstClass extends Compartment
{
	@Override //this is an annotation, it makes the compiler understand more specificly that the method is overriden, it is optional
	public void notice()	//method overriding which is declared in the abstract class
	{
		System.out.println ("This is First-Class");
	}
}

class Ladies extends Compartment
{
	//@Override	//optional, but good practice to write
	public void notice()	//method overriding which is declared in the abstract class
	{
		System.out.println ("This is Ladies Compartment");
	}
}

class General extends Compartment
{
	@Override
	public void notice()
	{
		System.out.println ("This is General Compartment");	//method overriding which is declared in the abstract class
	}
}

class NoticeCompartment
{
	public static void main (String[] args) 
	{
	FirstClass ob1=new FirstClass();
	Ladies ob2=new Ladies();
	General ob3=new General();
	
	ob1.notice();
	ob2.notice();
	ob3.notice();		
    }
}

/*
 *NOTE:
 *	ABSTRACT METHODS DOES NOT HAVE ANY METHOD DEFINATION
 *	WE CAN'T CREATE ABSTRACT CLASS'S OBJECT
 *	EVERY METHODS MUST BE DEFINED IN THE INHERITED SUBCLASS AT LEAST WITH BLANK DEFINITION, THIS FULL IMPLEMENTATION IS MUST
 *	IF SOME METHODS WHICH ARE DECLARED IN THE ABSTRACT CLASS BUT NOT DEFINED IN THE SUBCLASS, THEN THAT SCENARIO IS KNOWN AS PARTIAL IMPLEMENTATION
 *	IN CASE OF PARTIAL IMPLEMENTATION THE SUB CLASS ALSO BECOMES AN ABSTRACT CLASS
 *	ONE ABSTRACT CLASS CAN'T INHERIT ANOTHER ABSTRACT CLASS
 *	ONE CLASS CAN'T INHERIT MORE THAN 1 ABSTRACT CLASS
 *	TO OVERCOME THESE PROBLEMS INTERFACE WAS INTRODUCED
 **/