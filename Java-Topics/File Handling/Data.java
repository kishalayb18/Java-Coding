import java.util.*;
import java.io.*;
public class Data {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("data.csv"));

        /*//------Alternate way to declare-----
        File text = new File("data.csv");
        Scanner scan = new Scanner(text);
        //The above two codes are are written together as above.
        //scan object reads the file from the location. You can even give location as ("D:/data.csv") 
        //Note: File is found inside java.io package so must import that*/

        while(true)     //this loop will run until it finds the next String and if not found then it breaks inside catch block
        {
            try{
                String str = scan.next();       //we are taking the String from the file
                Scanner sc = new Scanner(str);      //str string is passed as Scanner object
                sc.useDelimiter(",");           //the useDelimiter(",") splits the statement wherever comman(,) is present
                while(sc.hasNext())             //until hasNext returns true it will print the words out of csv
                {
                    System.out.println(sc.next());
                }
                sc.close();
            }
            catch(NoSuchElementException nse)   //executed when there are no more inputs to read from file
            {
                break;
            }
        }
    }
}
