package default3;

import org.testng.annotations.Test;

public class Fibonaccci_Number {

	@Test()
	public void m1()
	{
		int a=0;
		int b=1;
		System.out.println("----"+a);
		int c;
		for(int i=0;i<10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			
			System.out.println("----"+c);
		}
	}
}
