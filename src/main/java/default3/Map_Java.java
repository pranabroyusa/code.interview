package default3;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Map_Java {
	//Hashmap
	//@Test()
	public void m1()
	
	{
		Map<String,Integer> myhashMap=new HashMap<String,Integer>();
		myhashMap.put("Pranab", 75039);
		myhashMap.put("Manisha", 10472);
		myhashMap.put("Prachi", 10476);
		myhashMap.put("Aditi", 66665);
		myhashMap.put("Dia", 54544);
		myhashMap.put("Sumon", 23345);
		/*
		 * Set<Map.Entry<String, Integer>> mySet=myhashMap.entrySet();
		 * for(Map.Entry<String, Integer> result: mySet) {
		 * System.out.println(" Key is : "+result.getKey()+" Value is : "+result.
		 * getValue()); }
		 */
		Map<String,Integer> myhashMap2=new HashMap<String,Integer>();
		myhashMap2.putAll(myhashMap);
		Set<Map.Entry<String, Integer>> mySet2=myhashMap.entrySet();
		for(Map.Entry<String, Integer> result: mySet2)
		{
			System.out.println(" Key is : "+result.getKey()+" Value is : "+result.getValue());
		}
		
	}
	//Linked HashMap using Entry set
	//@Test()
	public void m2()
	
	{
		Map<String,Integer> myhashMap=new LinkedHashMap<String,Integer>();
		myhashMap.put("Pranab", 75039);
		myhashMap.put("Manisha", 10472);
		myhashMap.put("Prachi", 10476);
		myhashMap.put("Aditi", 66665);
		myhashMap.put("Dia", 54544);
		myhashMap.put("Sumon", 23345);
		/*
		 * Set<Map.Entry<String, Integer>> mySet=myhashMap.entrySet();
		 * for(Map.Entry<String, Integer> result: mySet) {
		 * System.out.println(" Key is : "+result.getKey()+" Value is : "+result.
		 * getValue()); }
		 */
		Map<String,Integer> myhashMap2=new HashMap<String,Integer>();
		myhashMap2.putAll(myhashMap);
		Set<Map.Entry<String, Integer>> mySet2=myhashMap.entrySet();
		for(Map.Entry<String, Integer> result: mySet2)
		{
			if(result.getKey()=="Aditi")
			{
				result.setValue(88888);
				
			}
			System.out.println(" Key is : "+result.getKey()+" Value is : "+result.getValue());
		}
		
	}
	
	@Test()
	public void m3()
	
	{
		Map<String,Integer> myhashMap=new LinkedHashMap<String,Integer>();
		myhashMap.put("Pranab", 75039);
		myhashMap.put("Manisha", 10472);
		myhashMap.put("Prachi", 10476);
		myhashMap.put("Aditi", 66665);
		myhashMap.put("Dia", 54544);
		myhashMap.put("Sumon", 23345);
		
		Set<String>mySet=myhashMap.keySet();
		Iterator<String>it2=mySet.iterator();
		while(it2.hasNext())
		{
			System.out.println("Key is : "+it2.next()+" Value is :"+myhashMap.get(it2.next()));
		}
	}

}
