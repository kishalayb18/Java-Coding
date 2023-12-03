/*package whatever //do not write package name here */

import java.io.*;
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int arr[] = new int[31];
        int x1=x;
        int d=0, i=0, y=0;
        while(x1!=0){
            d=x1%10;
            x1=x1/10;
            arr[i]=d;
            i++;
        }
        int i1=i;
        for(int j=0;j<i;j++){
            y= y+(int)(arr[j]*Math.pow(10,i1-1));
            System.out.println (y);
            i1--;
        }
        System.out.println (y);
        if(x==y){
            return true;
        }
        else{
            return false;
        }
        
    }
}
class Palindrome {
	public static void main (String[] args) {
		Solution ob = new Solution();
		System.out.println(ob.isPalindrome(121));
	}
}