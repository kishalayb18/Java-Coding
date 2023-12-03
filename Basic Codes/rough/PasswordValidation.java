import java.util.*;
class PasswordValidator 
{
	boolean len=false,space=true,upper=false,lower=false,digit=false,spChar=false;
    boolean flag=false;
    
    
    public boolean isValid(String password)
    {
    	len=false;
    	space=true;
    	upper=false;
    	lower=false;
    	digit=false;
    	spChar=false;
    	flag=false;
    	
        //for checking if password length
        if (((password.length() >= 8) && (password.length() <= 15))) 
        {
            len=true;
        }
        
        //check space
        if (password.contains(" ")) 
        {
            space=false;
        }
        
        //UPPER CASE	
       	for (int i = 65; i <= 90; i++) 
        {
	        char c = (char)i;
	        if (password.contains(Character.toString(c)))
	        {
	        	upper=true;
	        }
        }
        
        //Checking lower case
        for (int i = 90; i <= 122; i++) 
        {
	        char c = (char)i;
	        if (password.contains(Character.toString(c)))
	        {
	        	lower=true;
	        }
        }
        
        // check digits from 0 to 9
        for (int i = 48; i <= 57; i++) 
        {
        	char c = (char)i;
	        if (password.contains(Character.toString(c)))
	        {
	        	digit=true;
	        }
        }
        
        //Check Special Char
        String spArr[]={"@","#","$","%","^","&","*","(",")","-","+","/",":",".",",","<",">","?","|"};
        for(String e:spArr)
		{
			if(password.contains(e))
			{
				 spChar=true;
				 
			}
		}
		
		if(len&&space&&upper&&lower&&digit&&spChar)
		{
			flag=true;
			
		}
		System.out.println (len);
		System.out.println (space);
		System.out.println (upper);
		System.out.println (lower);
		System.out.println (digit);
		System.out.println (spChar);
		System.out.println (flag);
		
		
        return flag;
    }
}

class MainPwValidator
{
	
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        PasswordValidator ob=new PasswordValidator();
        
	    String password1 = sc.nextLine();
	    if (ob.isValid(password1)) 
	    {
	    	System.out.println("Valid Password");
	    } 
	    else {
	    	System.out.println("Invalid Password!!!");
	    }
	    
	    String password2 = sc.nextLine();
	    if (ob.isValid(password2)) 
	    {
	    	System.out.println("Valid Password");
	    } 	
	    else 
	    {
	    	System.out.println("Invalid Password!!!");
    	}
    }
}