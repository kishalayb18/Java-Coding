 import java.util.*;
 class sysdate
 {
 	public static void main (String[] args) 
 	{
 		Calendar d=Calendar.getInstance();
       int d1=d.get(Calendar.MONTH);
       d1++;
       String r1=String.valueOf(d.get(Calendar.DATE))+"/"+String.valueOf(d1)+"/"+String.valueOf(d.get(Calendar.YEAR));
       String r2=String.valueOf(d.get(Calendar.HOUR))+":"+String.valueOf(d.get(Calendar.MINUTE))+":"+String.valueOf(d.get(Calendar.SECOND));
       System.out.println (r1+" "+r2);
    }
 }