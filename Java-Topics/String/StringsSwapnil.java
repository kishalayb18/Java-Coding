import java.util.*;
public class Strings {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str = sc.nextLine();
        System.out.print("Enter String 2: ");
        String str1 = sc.nextLine();
        int len = str.length();
        System.out.println("Length: "+len);
        System.out.print("Charcters: ");
        for(int i=0; i<len; i++){
            System.out.print(str.charAt(i)+" ");
        }

        //sort using characters in string
        char arr[]=str.toCharArray();
            Arrays.sort(arr);
        System.out.println("\nSorted characters: "+String.valueOf(arr));

        //to reverse the String
            String rev="";
            for(int i=len-1; i>=0; i--){
                rev += str.charAt(i);
            }
            System.out.println("Reversed: "+rev+" ");

        //vowels and consonants read in string
        char vowCh[]= new char[len];
        char consCh[]= new char[len];
        int j=0,k=0,vow=0,cons=0;
        for(int i=0; i<len; i++){
            char ch = str.toUpperCase().charAt(i);
            if(ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
                vowCh[j]=ch;
                vow ++;
                j++;
             }
             if(!(ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U')){
                consCh[k]=ch;
                cons++;
                k++;
            }
        }
        //printing the vows, cons and their count
        System.out.print("Vow Count="+vow+" Vowels are : ");
        for(j=0; j<len; j++){
            System.out.print(vowCh[j]);
        }
        System.out.print("\nCons Count="+cons+" Consonants are : ");
        for(k=0; k<len; k++){
            System.out.print(consCh[k]);
        }

        //string comparision
        System.out.println("\nStrings matched: "+str.equals(str1));
        //compare strings
        System.out.println("Compared string: "+str.compareTo(str1)); //0 means matched ,<0 str>str1 and ,>0 str>str1
        //to find position of string in a string
        System.out.println("Position present: "+str.indexOf(str1)); //ap in swapnil is at 2
        //count no. of occurences
        int c=0,a=-1;
        while((a=str.indexOf(str1,a+1))!= -1){
                c++;
            }
        System.out.println(str1+" is present in "+str+" ="+c+" times.");
        //concatenation
        System.out.println("Concatenated string : "+str.concat(str1).concat("Stringo"));
        //upper and lower
        System.out.println("Upper Case: "+str1.toUpperCase());
        System.out.println("Lower Case: "+str1.toLowerCase());
    }
}
