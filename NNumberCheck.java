package com.Conditional;
import java.util.*;
public class NNumberCheck //N Numbers Smallest Check
{

	public static void main(String[] args) 	
	{
		int smallest=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=sc.nextInt();
		
		System.out.println("The Numbers are:");
		int b=sc.nextInt();
		
		for(int i=0;i<a-1;i++)
		{
			b=sc.nextInt();
			if(b<smallest)
			{
				smallest=b;
			}
		}
		System.out.println("The Smallest Number is:"+smallest);
		
		

	}

}
