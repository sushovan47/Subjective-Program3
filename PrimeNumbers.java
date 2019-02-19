package com.Conditional;
public class PrimeNumbers
{
	public static void main(String[] args) 
	{
		for(int i=2;i<=100;)
		{
			int prime=1;
			for(int j=2;j<=i;j++)
			{
				if((i%j)==0 & (j!=i))
						{
							prime=0;
						}
			}
			if(prime!=0)
			{
				System.out.println(i+"is a Prime Number");
				i++;
			}
			else
			{
				System.out.println(i+"is not a Prime Number");
				i++;
			}
		}
		
		

	}

}
