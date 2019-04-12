package com.code.trial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Array_To_Array_List {
	@Test
	public void m1()
	{
		/*
		 * Integer[] arr=new Integer[5]; arr[0]=6; arr[1]=11; arr[2]=4; arr[3]=9;
		 * arr[4]=8;
		 */
		// Array to ArrayList
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		Integer [] arr= {6,9,12,31,7};
		Arrays.sort(arr);
		
		//List<Integer> al=Arrays.asList(arr);
		//Collections.sort(al);
		
		  for(int i=arr.length-1;i>=0;i--) 
		  { 
			  System.out.println("array is :"+arr[i]);
		  }
		  
		 // al.add(arr[i]); }
		 
      //System.out.println(al);
      
		/*
		 * for(Integer i:al) { System.out.println("  Arraylist :"+i.intValue()); }
		 */
}
}