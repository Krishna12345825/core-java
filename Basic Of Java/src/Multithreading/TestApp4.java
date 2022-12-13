package Multithreading;
 class MyTest extends Thread
 {
	 public void run()
	 {
	 for(int i=1; i<10;i++)
	 {
		 System.out.println(" Rani  Thread");
		 try{
		 Thread.sleep(2000);
		 }
		 catch (InterruptedException e){
		 } 
	 } 
	}  
	 
 }
public class TestApp4 
{

	public static void main(String[] args) throws InterruptedException
	{
		MyTest t = new MyTest();
		t.start();
		t.join(1000);
		for (int i = 0; i <=10; i++) {
			System.out.println(" Krishna Thread ");
		}
	}

}
