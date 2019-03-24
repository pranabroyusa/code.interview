package default1;

import java.io.IOException;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void m6() throws IOException {
		//String path="cmd /c start d:\\sample\\sample.bat";
		String path="cmd C:\\Users\\Pranab Pc\\Desktop\\run.bat";
		
		Runtime rn=Runtime.getRuntime();
		Process pr=rn.exec(path);
		
	}

}
