import java.util.*;

class Rev
{
public static void main(String[] args)
{
int num=0,rev=0;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();
int temp=num;

while(num !=0)
{
rev=rev*10;
rev=rev+num%10;
num=num/10;
}
num=temp;

System.out.println(rev);
if(rev>num)
{
System.out.println(1);
}
else
{
System.out.println(0);
}
}
}

/*
import java.io.*;
import java.util.*;

class Rev
{
public static void main(String[] args) throws IOException
{
int num=0,rev=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();
temp=num;
while(num !=0)
{
rev=rev*10;
rev=rev+num%10;
num=num/10;
}
System.out.println(rev);
if(temp<rev)
{
System.out.println(1);
}
else 
{
System.out.println(0);
}
}
}*/