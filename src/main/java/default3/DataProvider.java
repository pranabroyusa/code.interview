package default3;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider="TestData")
	public void m1(String s,Integer i)
	{	
		System.out.println("Browser name is :"+s+" Age is :"+i);
		System.out.println("Browser name is :"+s+" Age is :"+i);
	}
	
	
	//@DataProvider(name = "TestData")
	 public Object[][] getData()
	 {
		 Object [][] data= new Object[2][2];
		 data[0][0]="Yahoo";
		 data[0][1]=9;
		 data[1][0]="Google";
		 data[1][1]=11;
		 return data;
	 }

}
