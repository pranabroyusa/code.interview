package default3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Duplicate_In_String {
	
	//@Test
	public void m1()
	{
		String s="bangladeshisthe best";
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		map.put('u', 7);
		map.put('u', 9);
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(map.containsKey(c))
			{
				int count=map.get(c);
				map.put(c, ++count);
				
			}
			else
			{
				map.put(c, 1);
			}
			
			
		}
		Set<Map.Entry<Character, Integer>> mySet=map.entrySet();
		  for(Map.Entry<Character, Integer> result: mySet) {
		  System.out.println(" Key is : "+result.getKey()+" Value is : "+result.
		 getValue()); }
	}

	
	 @Test
	 public void m2()
	 {
		 Map<Character,Integer> map = new HashMap<Character,Integer>();
			
			map.put('u', 7);
			map.put('u', 9); 
			map.put('u', 11);
			System.out.println(map.get('u'));
	 }
}
