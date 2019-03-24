package Default2;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Binary_Search {
	@Test
	public void m1()
	{
		int[] arr= {25,12,33,56,71};
		int x=Arrays.binarySearch(arr, 33);
		if(x<0)
		{
		System.out.println("Is Not present");	
		}
		else
		{
			System.out.println("Is  present");
		}
		
	}

}
