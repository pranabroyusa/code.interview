package Default2;

import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Fail_Test implements IRetryAnalyzer {

	
	int count=0;
	int retry_count=3;
	public boolean retry(ITestResult result) {
		
		if(count<retry_count)
		{
			count++;

			return true;
		}
		return false;
	}

	
	
}
