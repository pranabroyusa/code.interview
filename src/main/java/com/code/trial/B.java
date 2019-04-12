package com.code.trial;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class B {
	
	@Test
	public void m1()
	{
		int x=18;
	
		List<Integer>li=new ArrayList<Integer>();
		li.add(2);
		li.add(8);
		li.add(9);
		li.add(6);
		li.add(4);
		li.add(11);
		li.add(5);
		li.add(9);
		li.add(12);
		li.add(3);
		li.add(12);
		//int[]arr=new int[li.size()];
		Object[] arr = li.toArray();
		
		//int[]arr=new int[li.size()];
		for(int i=0;i<arr.length;i++ )
		{
			arr[i]=li.get(i);
		}
		
		
		for(int n=0;n<arr.length-1;n++)
		{
			
			for(int m=n+1;m<arr.length-1;m++)
			{
				
				if(((Integer) arr[m]+(Integer) arr[n])==x)
				{
				//if(arr[m]+arr[n]==x){
				System.out.println(arr[m]+" +  "+arr[n]+" is "+x);
				}
			}
		}
		
		
		/*int[]arr=new int[li.size()];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=li.get(i);
		}
		for(int m=0;m<arr.length-1;m++)
		{
			for(int n=m+1;n<arr.length-1;n++)
			{
				if (arr[m]+arr[n]==x)
				System.out.println(arr[m]+"   ----"+arr[n]);
				
			}
		}*/
		
		
	}

}
