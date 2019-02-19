package com.Conditional;
import java.util.*;
public class NNumber_Check  //N Numbers Biggest Check
{

	public static void main(String[] args) 
	{
		int big=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		
		System.out.println("The Numbers Are:");
		int b=sc.nextInt();
		for(int i=0;i<b-1;b++)
		{
			b=sc.nextInt();
			if(b>big)
			{
				big=b;
			}
		}
		System.out.println("The Bigger Number is:"+big);
		

	}

}
