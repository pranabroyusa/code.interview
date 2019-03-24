package math;

import org.testng.annotations.Test;

public class i_Plus_Plus {
	@Test
	// ++i
	public void m1()
	{
		int i=1;
		int j=++i;
		System.out.println("Value of i :"+i+" Value of j :"+j);
		
		
	}
	
	@Test
	//i++
	public void m2()
	{
		int i=1;
		int j=i++;
		System.out.println("Value of i :"+i+" Value of j :"+j);
		
		
	}

}
