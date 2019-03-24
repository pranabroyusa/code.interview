package default3;

import org.testng.annotations.Test;

public class Synchronization {

	public static void main(String[]args)
	//@Test
	//public void m1()
	{
	Thread th1=new Thread(new Runnable() {
		
		public void run() {
			try {
				
				print_Number();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	});
	th1.start();
Thread th2=new Thread(new Runnable() {
		
		public void run() {
			try {
				print_Number();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	});
th2.start();
Thread th3=new Thread(new Runnable() {
	
	public void run() {
		try {
			print_Number();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
});
	th3.start();
	}
	
	private synchronized static  void print_Number() throws InterruptedException
	{

		Thread t = Thread.currentThread();
		System.out.println(" Current Thread is :"+t.getName());
		for(int i=1;i<=10;i++)
		{
			System.out.println("  Printing :"+i);
			Thread.sleep(400);
		}
	}
}