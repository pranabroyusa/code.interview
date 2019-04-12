package default3;

public class Singleton {
	
	    // static object of Singleton 
	    private static Singleton single_instance=new Singleton();
	  
	    // private constructor restricted to this class itself 
	    private Singleton() 
	    { 
	    	System.out.println(" Singleton object created");
	    } 
	  
	    // static method to create instance of Singleton class 
	    public static Singleton getInstance() 
	    { 
	        return single_instance; 
	    } 
	} 

