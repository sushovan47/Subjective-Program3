package com.Conditional;
import java.util.*;
public class PrimeNumberCheck    //Checking A Number Is Prime or Not.
{
	public static void main(String[] args)
	{
		int a,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value Want to Check:");
		 a=sc.nextInt();
		
		
		
		for( i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("The Value is A Prime Number");
		}
		else
		{
			System.out.println("The Value is Not A Prime Number");
		}

	}

}
