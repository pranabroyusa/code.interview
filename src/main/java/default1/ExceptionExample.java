package default1;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionExample {
		public void testMethod1(){
			File file = new File("test.txt");
			DataInputStream dataInputStream =  null;
			try{
				dataInputStream = new DataInputStream(new FileInputStream(file));
				while(true){
					dataInputStream.readInt();	
				}			
			}catch (EOFException e){			
				e.printStackTrace();
			}
			catch (IOException e){
				e.printStackTrace();
			}
			finally{
				try{
					if (dataInputStream != null){
						dataInputStream.close();
					}
				}catch (IOException e){
					e.printStackTrace();
				}
			}
		}
		public static void main(String[] args){
			ExceptionExample instance1 = new ExceptionExample();
			instance1.testMethod1();
		}
	}


