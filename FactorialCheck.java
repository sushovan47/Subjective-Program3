package com.Conditional;
import java.util.*;
public class FactorialCheck //Checking a given Number Factorial.
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers:");
		int a=sc.nextInt();
		int b=1;
		for(int i=1;i<=a;i++)
		{
			b=b*i;
		}
		System.out.println("The Factorial of " + a + " is:"+b);
	}
}
