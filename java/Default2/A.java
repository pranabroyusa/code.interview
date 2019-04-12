package Default2;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public  class A {
	
	public  static ArrayList<Integer> m1()
	{
	ArrayList<Integer>arr=new ArrayList<Integer>(); 
	
	for(int i=0;i<10;i++)
	{
		arr.add(i);
	}
	 return arr;
	}
	
	
	
	@Test
	public void m2()
	{
		Collections.shuffle(A.m1());
		System.out.println(A.m1());
	}
	
	

}
