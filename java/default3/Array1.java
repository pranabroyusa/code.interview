package default3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class Array1 {
	//@Test
	public void arraySorting()
	{
		int[] num= {23,13,74,35,65};		
         Arrays.sort(num);
         System.out.println(num[num.length-2]);
         
	}
	
	//@Test
	public void arraySorting1()
	{
		
		int[] num= {23,13,74,35,65};
		int temp;
         for(int i=0;i<num.length;i++)
         {
        	 for(int j=i+1;j<num.length;j++)
        	 {
        		 if(num[i]>num[j])
        		 {
        			 temp=num[i];
        			 num[i]=num[j];
        			 num[j]=temp;
        		 }
        		 
        	 }
         }
         for(int i=0;i<num.length-1;i++)
         {
         System.out.println("------------"+num[i]+",");
         }
         System.out.println("------------"+num[num.length-1]);
	}
	@Test
	public void arraySorting2()
	{
		List<Integer>li=new ArrayList<Integer>();
		int[] num= {23,13,74,35,65};
		for(int i=0;i<num.length;i++)
		{
			li.add(num[i]);
		}
		Collections.sort(li);
		/*
		 * Iterator<Integer> it=li.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		for(int i=li.size()-1;i>=0;i--)
		{
			System.out.println(li.get(i));
		}
		
        	
	}
	
	//@Test
		public void arraySorting3()
		{
			int[] num= {23,13,74,35,65};
			Arrays.sort(num);
			for(int i=0;i<num.length;i++)
			{
				System.out.println("    "+num[i]);
			}
			
	        	
		}
}
