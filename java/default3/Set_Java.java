package default3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class Set_Java {
	
	//@Test
	public void m1()
	{
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(11);
		hs.add(12);
		hs.add(13);
		hs.add(11);
		hs.add(14);
		hs.add(15);
		hs.add(16);
		hs.add(13);
		hs.add(17);
		hs.add(18);
	Iterator it=hs.iterator();
	while(it.hasNext())
	{
		System.out.println("----"+it.next());
	}
		
	}
	
	//@Test
	public void m2()
	{
		LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
		lhs.add(11);
		lhs.add(12);
		lhs.add(13);
		lhs.add(11);
		lhs.add(14);
		lhs.add(15);
		lhs.add(16);
		lhs.add(13);
		lhs.add(17);
		lhs.add(18);
	Iterator it=lhs.iterator();
	while(it.hasNext())
	{
		System.out.println("----"+it.next());
	}
		
	}
	@Test
	public void m3()
	{
		List<Integer>li=new ArrayList<Integer>();
		li.add(11);
		li.add(12);
		li.add(13);
		li.add(11);
		li.add(14);
		li.add(15);
		li.add(16);
		li.add(13);
		li.add(17);
		li.add(18);
		LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
		Iterator it=li.iterator();
		while(it.hasNext())
		{
			
			lhs.add((Integer) it.next());	
		}
	//lhs.addAll(li);
	Iterator it2=lhs.iterator();
	while(it2.hasNext())
	{
		System.out.println("----"+it2.next());
		
	}
		
	}

}
