package Default2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReTestFailed_Test_cases {
	@Test(retryAnalyzer=Default2.Retry.class)
	public void m1()
	{
		Assert.assertEquals(5, 8);
	}
	
	@Test(retryAnalyzer=Default2.Retry.class)
	public void m2()
	{
		Assert.assertEquals(5, 7);
	}

}
