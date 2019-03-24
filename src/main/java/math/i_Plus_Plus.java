package math;

import org.testng.annotations.Test;

public class i_Plus_Plus {
	@Test
	
	public void m1()
	{
		int i=1;
		int j=++i;
		System.out.println("Value of i :"+i+" Value of j :"+j);
		
		
	}
	
	@Test

	public void m2()
	{
		int i=1;
		int j=i++;
		System.out.println("Value of i :"+i+" Value of j :"+j);
		
		
	}

}
