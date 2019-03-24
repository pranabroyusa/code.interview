package Default2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Count_Duplicate {
	@Test
	public void m2()
	{
	String s="yahoogoogle";


	Map<Character,Integer> map = new HashMap<Character,Integer>();
	
	char[]ch=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		//char c=s.charAt(i);
		char c=ch[i];
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
}


