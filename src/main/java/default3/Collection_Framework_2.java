package default3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class Collection_Framework_2 {
	
		//@Test
		public void arrayList()
		{ 
			List<Integer>li=new ArrayList<Integer>();
			//long t1=System.currentTimeMillis();
			for(int i=1;i<=1000000;i++)
			{
				li.add(i);
			}
			long t11=System.currentTimeMillis();
			//li.add(49, 500);
			//li.remove(46);
			for(int i=1;i<1000000;i++)
			{
				li.get(i);
			}
			long t12=System.currentTimeMillis();
			System.out.println("Time taken by array list :"+(t12-t11));
			List<Integer>ll=new LinkedList<Integer>();
			//long t3=System.currentTimeMillis();
			for(int i=1;i<=1000000;i++)
			{
				ll.add(i);
			}
			for(int i=1;i<1000000;i++)
			{
				ll.get(i);
			}
			long t13=System.currentTimeMillis();
			//ll.add(47, 500);
			//ll.remove(44);
			
			
			long t14=System.currentTimeMillis();
			System.out.println("Time taken by link list :"+(t14-t13));
	   }
	
}
