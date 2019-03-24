package Default2;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Prime_Number {
	
	@Test
	public void m1()
	{
		
		int[]arr= {13,67,36,31,44}; 
	 
		for( int i=0;i<arr.length;i++)
		{
			int x=arr[i];
			 boolean is_Prime=true;
			
			for( int j=2;j<x;j++)
			{
				
			if(x%j==0)
			{
				is_Prime=false;
				break;
				
			}
			}
			if(is_Prime)
				   System.out.println(x + " is a Prime Number");
			
			
		}
			
		}

	}


