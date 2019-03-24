package math;

import org.testng.annotations.Test;

public class PrimeNumber {
	@Test
	public void Prime_Number()
	{
		int []num={23,45,61,29,31,44};
		
		for(int i=0;i<num.length;i++)
		{
			
			 boolean status=true;
			for(int j=2;j<num[i];j++)
			{
				if(num[i]%j==0)
				{
					status=false;
					break;
				}
			}
			if(status)
			{
				System.out.println(num[i]+" Prime Number");
			}
		}
	}
	
	

}

