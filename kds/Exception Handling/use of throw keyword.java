import java.io.*;
class TestThrow1 
{ 
	static void votingAge() 
	{
		BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("Enter Your Age: ");
		 	int age=Integer.parseInt(ds.readLine());
		 	
		 	if(age<18) 
			{
				throw new ArithmeticException("Not Eligible For Voting."); 
			}
			
			else 
			{
				System.out.println("Welcome To Vote.");
			}
		}
		
		catch(NumberFormatException e1)
		{
			System.out.println ("WRONG INPUT. \nOnly Integer Value Is Accepted");
		}
		catch(IOException e2)
		{
			System.out.println ("Given Input Is Wrong.");
		}
		
		
		
	} 
	public static void main(String args[]) 
	{ 
		TestThrow1.votingAge(); 
		System.out.println("\nTHANK YOU"); 
	}
}