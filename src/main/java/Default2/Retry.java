package Default2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	int count=0;
	int max=3;
	public boolean retry(ITestResult result) {
		if(count<=max) {
			count=count+1;
			return true;	
		}
		return false;
	}

}
