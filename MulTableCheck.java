package com.Conditional;
import java.util.*;
public class MulTableCheck   //Checking Multiplication Table of A Given Number
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number for checking Multiplication Number:");
		int a=sc.nextInt();
		
		System.out.println("The Multiplication table of:"+a);
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+(a*i));
		}

	}

}
