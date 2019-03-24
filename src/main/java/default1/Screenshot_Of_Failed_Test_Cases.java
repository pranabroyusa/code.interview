package default1;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class Screenshot_Of_Failed_Test_Cases {
	WebDriver driver=null;
	@Test
	public void m1() throws IOException {
		
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\Pranab Roy\\Desktop\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://www.bbc.com/");
	   System.out.println(driver.getTitle());
	   Assert.assertEquals(5, 8);
	   // take_Screenshot();
	}
	
	public void take_Screenshot() throws IOException
	{
		 //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("C:\\Users\\Pranab Roy\\Desktop\\ScreenShots\\abc.jpg");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);
          
	}
	
	@AfterMethod()
	public void m4(ITestResult result) throws IOException
	{
	if(ITestResult.FAILURE==result.getStatus())
	{
		   take_Screenshot();
	}
	}
}
	


