class MultipleCatchBlock3 
{ 
public static void main(String args[]) 
{ 
try
{ 
int a[]=new int[5]; 
a[10]=30/0;
} 
/*catch(Exception e) 
{
	System.out.println("common task completed");
} 
*/
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("task 2 completed");
} 
catch(ArithmeticException e) 
{
	System.out.println("task1 is completed");
} 

System.out.println("rest of the code..."); 
} 
}