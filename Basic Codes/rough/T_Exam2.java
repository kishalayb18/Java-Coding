/**
 * COUNT NO. OF VOWELS IN A STRING
 *
 *INPUT FORMAT 
 *1 STRING INPUT
 *
 *CONSTRAINT 1<=STRING LENGTH<=500
 *
 *OUTPUT FORMAT
 *SHOULD RETURN AN INTEGER DENOTING NO. OF VOWELS IN THE STRING INPUT
 *
 *CASE 1:
 *I/P : HELLO WORLD
 *O/P : 3
*/
import java.util.*;
class Count 
{
    
    	Scanner sc=new Scanner(System.in);
    	String lineMain, line;
    	int vowels = 0;
    	
    	public void sRead()
    	{
    		 lineMain = sc.nextLine();
    		 if(lineMain.length()>500)
    		 {
    		 	System.exit(0);
    		 }
    		 line = lineMain.toLowerCase();
    	}
        int cntV()
        {
        	  for(int i = 0; i < line.length(); ++i){

            	char ch = line.charAt(i);
            	if(ch == 'a' || ch == 'e' || ch == 'i' 
            		|| ch == 'o' || ch == 'u') 
                {
                	++vowels;
            	}          
        	}
        	return vowels;
        }
}


public class T_Exam2 {
    
    public static void main (String[] args) {
		Count p=new Count();
		p.sRead();
		System.out.println (p.cntV());
		
	}
}