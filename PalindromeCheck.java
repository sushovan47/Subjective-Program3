package com.Conditional;
import java.util.*;
public class PalindromeCheck   //Check a Number is Palindrome Or Not
{
	public static void main(String[] args)
	{
		String a,b="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value:");
		a=sc.next();
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("The Value is in Reverse Order:"+b);
		if(b.equals(a))
		{
			System.out.println("The Given Value is a Palindrome Number");
		}
		else
		{
			System.out.println("The Given Value is not a Palindrome Number");
		}

	}

}
