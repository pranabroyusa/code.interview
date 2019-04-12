package default3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class Collection_Framework_1 {
	// Sort a list
	//@Test
	public void m1()
	{ 
		List<Integer>li=new ArrayList<Integer>();
		li.add(5);
		li.add(11);
		li.add(9);
		li.add(7);
		li.add(3);
		Collections.sort(li);
		for(Integer i :li)
		{
			System.out.println(i);
		}
	}
		// list to Array
		//@Test
		public void m2()
		{ 
			List<Integer>li=new ArrayList<Integer>();
			li.add(5);
			li.add(11);
			li.add(9);
			li.add(7);
			li.add(3);
			Integer[] arr = new Integer[li.size()];
			for(int i=0;i<li.size();i++)
			{
				arr[i]=li.get(i);
			}
			Arrays.sort(arr);
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}		
	}
		// Array to List
		//@Test
		public void m3()
		{ 
			Integer[]arr = {7,9,11,13,5};
			List<Integer> li=new ArrayList<Integer>();
			for(int i=0;i<arr.length;i++)
			{
				li.add(arr[i]);
			}
			Collections.sort(li);
			//System.out.println(li);
			for(Integer i: li)
			{
				System.out.println(i);
			}
			
			
		}
		// Array to List Reverse Order
		//@Test
		public void m4()
		{ 
			Integer[]arr = {7,9,11,13,5};
			Arrays.sort(arr);
			
			List<Integer> li=new ArrayList<Integer>();
			for(int i=arr.length-1;i>=0;i--)
			{
				li.add(arr[i]);
			}
			;
			for(Integer i: li)
			{
				System.out.println(i);
			}
			
			
		}
		
		//Binary Search
		//@Test
		public void m5()
		{ 
		        int arr[] = {9,29,17,43,2};
		        int key = 43; 
		        int result = Arrays.binarySearch(arr,key);  
		        if (result < 0)  
		            System.out.println("Element is not found!");  
		        else  
		            System.out.println("Element is found at index: "+result);  
		      
			
		}
		// Middle value of the array
		//@Test
		public void m6()
		{ 
		        int arr[] = {9,29,17,23};
		        Arrays.sort(arr);//2,9,17,17,29,43
		      if((arr.length%2)==0)
		      {
              System.out.println((arr[((arr.length)/2)-1]+arr[((arr.length)/2)])/2);
		      }
		      else
		      {
	    	  System.out.println(arr[(arr.length)/2]); 
		      }
		       
		        
			
		}
		
		@Test
		public void m7()
		{ 
       List<Integer>li=new ArrayList<Integer>();
       // Add method
       li.add(5);
       li.add(11);
       li.add(9);
       //Get Method
       // System.out.println(li.get(2));
       List<Integer>li2=new ArrayList<Integer>();
		
		  li2.add(5); li2.add(11); li2.add(9);
		 
       //Contains Method--->Contains one object
       //System.out.println(li2.contains(5));
       //ContainsAll Method--->Contains one object
       //System.out.println(li2.containsAll(li));
		  // isEmpty Method
       //System.out.println(li2.isEmpty());
		  //Iterator
       Iterator it=li2.listIterator();
       
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
       
       

		        
			
		}

}
