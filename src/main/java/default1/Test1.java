package default1;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver=null;

	public static void main(String[] args)
	{
	System.out.println("Hello World");
	}
	
	
	@Test
	public void m1() throws IOException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranab Pc\\Desktop\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pranab Pc\\Desktop\\Drivers\\geckodriver.exe");
		
		
		//WebDriver driver = new ChromeDriver();
		driver=new FirefoxDriver();
	    driver.get("https://www.bbc.com/");
	    Assert.assertEquals(4, 15);
	 
	}
	
	public void take_Screenshot() throws IOException
	{
		 //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("C:\\Users\\Pranab Pc\\Desktop\\Screenshots\\abc.jpg");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);
          
	}

}
