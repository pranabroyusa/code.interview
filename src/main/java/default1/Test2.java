package default1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void m6() throws IOException {
		//String path="cmd /c start d:\\sample\\sample.bat";
		String path="cmd C:\\Users\\Pranab Pc\\Desktop\\run.bat";
		
		Runtime rn=Runtime.getRuntime();
		Process pr=rn.exec(path);
		
	}
	
	@Test
	public void m7()  {
		Assert.assertEquals(5, 7);
		
	}

}
