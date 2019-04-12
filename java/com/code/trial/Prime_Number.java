package com.code.trial;

import org.testng.annotations.Test;


public class Prime_Number {

	boolean isPrime=true;
	//@Test
	public void m1()
	{
	
		// Number to check
	 int x=41;
	 //checking  loop 2 to x-1
	 for(int j=2;j<x;j++)
		{
		   if(x%j==0)
		   {
			   isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		
	 
	if(isPrime)
		   System.out.println(x + " is a Prime Number");
		else
		   System.out.println(x + " is not a Prime Number");
}
	
	@Test
	public void  m4()
	{
		
		int [] number= {13,11,19,234,431};
		
		for( int i=0;i<number.length;i++)
		{
			int x= number[i];
			boolean isPrime=true;
			
			for(int j=2;j<x;j++)
			{
			   if(x%j==0)
			   {
			      isPrime=false;
			      break;
			   }
			}
			//If isPrime is true then the number is prime else not
			if(isPrime)
			   System.out.println(x + " is a Prime Number");
			else
			   System.out.println(x + " is not a Prime Number");
		   }
		   }
	
}
