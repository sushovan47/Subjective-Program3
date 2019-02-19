package com.Conditional;
import java.util.*;
public class FactorialRangeCheck  //Checking Factorial of Given Range.
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int c;
		System.out.println("Enter the first Number of the Factorial");
		int a=sc.nextInt();
		
		System.out.println("Enter the Second Number of the Factorial");
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			c=1;
			System.out.println("The Values are:"+i);
			for(int j=1;j<=i;j++)
			{
				c=c*j;
			}
			System.out.println("The Factorial Values Are Respectivley:"+c);
		}
		
		

	}

}
