package com.code.trial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class A {


		
		@Test
		public void m2()
		{
		//HashMap<String, List<String>> mapOfPosts = new HashMap<String, List<String>>();
		HashMap<String, String> mapOfPosts = new HashMap<String, String>();

		ArrayList<String> post1Comments = new ArrayList<String>();
		ArrayList<String> post2Comments = new ArrayList<String>();

		// Collect comments of a certain post
		post1Comments.add("comment1");
		post1Comments.add("comment2");
		
		String s1=new String("");
		for (String s: post1Comments) {
			s1=s1+s;
		}
		
		post2Comments.add("comment1");
		post2Comments.add("comment2");
		
		String s2=new String("");
		for (String s: post1Comments) {
			s2=s2+s;
		}
		//System.out.println("------"+s1);
		// Attach comments to post
		mapOfPosts.put("post1", s1);
		mapOfPosts.put("post2", s2);
		
		System.out.println(mapOfPosts);
		}
		
		
		
		@Test
		public void m3()
		{
		
		HashMap<String, Integer> mapOfPosts = new HashMap<String, Integer>();

		ArrayList<Integer> VoteA = new ArrayList<Integer>();
		ArrayList<Integer> VoteB  = new ArrayList<Integer>();

		// Collect comments of a certain post
		VoteA.add(12);
		VoteA.add(17);
		VoteA.add(10);
		
		
		Integer i1=new Integer(0);
		for (Integer i: VoteA) {
			i1=i1+i;
		}
		
		VoteB.add(21);
		VoteB.add(13);
		VoteB.add(15);
		
		
		Integer i2=new Integer(0);
		for (Integer i: VoteB) {
			i2=i2+i;
		}
		//System.out.println("------"+s1);
		// Attach comments to post
		mapOfPosts.put("Anower", i1);
		mapOfPosts.put("Razaul", i2);
		
		System.out.println(mapOfPosts);
		}
		
		
		@Test
		public void  m4()
		{
			
			int [] number= {13,11,19,234,431};
			
			for( int i=0;i<number.length;i++)
			{
				int x= number[i];
				System.out.println(" Current nuber is ----- "+x);

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
		
			
			
		
@Test
public void  m7()
{
	
	for(int i=1;i<10;i++)
	{
		if( i==5)
		{
				break;
			
		}
		System.out.println(" value is :"+i);
	}
	
	for(int i=1;i<10;i++)
	{
		if( i==5)
		{
				continue;
					
		}
		System.out.println(" value is :"+i);
	}
}

}





