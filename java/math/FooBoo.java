package math;

import org.testng.annotations.Test;

public class FooBoo {
	
	//FooBoo
  @Test
  public void remainder()
  {
    int x=30;

    	if(x%5==0 && x%3==0)
        {
        	System.out.println("--- FooBoo");
        }
    	
    
    else if(x%3==0)
    {
    	System.out.println("--- Foo");
    }
    else if(x%5==0)
    {
    System.out.println("--- Boo");
    }
    else
    {
    	System.out.println("--- None");
    }
    
  }

}
