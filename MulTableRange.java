package com.Conditional;
import java.util.*;
public class MulTableRange  //Checking Mathematical Table of the Given Range 1 to 10
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number from a Range:");
		int a=sc.nextInt();
		
		System.out.println("Enter the Second Number from a Range:");
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			System.out.println("Multiplication Table of:"+i);
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}

	}

}
