/*
 There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example


There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int arr[n]: the colors of each sock

Returns
int: the number of pairs

Input Format
The first line contains an integer n, the number of socks represented in arr.
The second line contains n space-separated integers,arr[i], the colors of the socks in the pile.
*/

import java.util.*;
class Socks
{
	int n;
	int cnt=0, pair=0,sum=0;
	int arr[];
	int temp[];
	Scanner sc=new Scanner(System.in);
	
	public Socks()
	{
		n=sc.nextInt();
		arr=new int[n];
		temp=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	public int findPairs()
	{
		int j=0,flag=1;
		for(int e: arr)
		{
			flag=1;
			for(int x: temp)
			{
				if(e==x)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				//temp is used to get an array of unique elements
				temp[j]=e;
				j++;
				cnt=0;
				
				for(int ele: arr)
				{
					if(e==ele)
					{
						//no. of a element in the main array
						cnt++;
					}
				}
				pair=cnt/2;
				sum+=pair;
				
			}
		}
		
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
		
		for(int x: temp)
		{
			System.out.print(x+" ");
		}
		
		
		return sum;
	}
}

class SourceSocks
{
	public static void main (String[] args) 
	{
		Socks ob=new Socks();
		int res=ob.findPairs();
		System.out.println ("Pairs="+res);
	}
}