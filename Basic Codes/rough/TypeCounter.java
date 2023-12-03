import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;


class Result {

    
    public static void typeCounter(String str) 
    {
        str=str.toLowerCase();
        if(str.length()>30000)
        {
            System.exit(0);
        }
        
        String[] arr=str.split(" ");
        if(arr.length>=1000)
        {
            System.exit(0);
        }
        
        int cntInt=0, cntDouble=0, cntString=0;
        
        int j=arr.length;
        for(int i=0;i<j;i++)
        {
            try{
                Integer.parseInt(arr[i]);
                cntInt++;
            }
            catch(NumberFormatException ne1)
            {
                try{
                    Double.parseDouble(arr[i]);
                    cntDouble++;
                }
                catch(NumberFormatException ne2)
                {
                    cntString++;
                }
            }
        }
        System.out.println("string "+cntString);
        System.out.println("integer "+cntInt);
        System.out.println("double "+cntDouble);
    }

}

public class TypeCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}
