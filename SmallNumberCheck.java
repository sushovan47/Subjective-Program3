package com.Conditional;
public class SmallNumberCheck //Smallest Numbers Check Among Three Numbers 
{

	public static void main(String[] args)  
	{
		int a=-2;
		int b=354;
		int c=40;
		if(a<b&&a<c)
			System.out.println("The Smallest Number is:"+a);
		else if(b<a&&b<c)
			System.out.println("THe smallest Number is:"+b);
		else if(c<a&&c<b)
			System.out.println("The Smallest Number is:"+c);
		else
			System.out.println("All Numbers Are Same");
	}

}
