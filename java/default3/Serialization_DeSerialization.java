package default3;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.testng.annotations.Test;


public class Serialization_DeSerialization  {

	@Test
	public void test() throws IOException, ClassNotFoundException
	{
		//serialized();
		deSerialized();
	}

public void serialized() throws IOException
{
	Serialization_Class sc=new Serialization_Class("Pranab",10472);
    //Saving of object in a file 
    FileOutputStream file = new FileOutputStream("C:\\Users\\Pranab Pc\\Desktop\\file.ser"); 
    ObjectOutputStream out = new ObjectOutputStream(file); 
      
    // Method for serialization of object 
    out.writeObject(sc); 
      
    out.close(); 
    file.close(); 
      
    System.out.println("Object has been serialized"); 
	
}


public void deSerialized() throws IOException, ClassNotFoundException
{
	
    FileInputStream file = new FileInputStream("C:\\Users\\Pranab Pc\\Desktop\\file.ser"); 
    ObjectInputStream oit = new ObjectInputStream(file); 
      
    // Method for deSerialization of object 
    Serialization_Class ob1 = (Serialization_Class)oit.readObject(); 
      
    oit.close(); 
    file.close(); 
    System.out.println("Name is : "+ob1.s+" Zip is : "+ob1.zip);
      
    System.out.println("File has been DeSerialized"); 
	
}
}
