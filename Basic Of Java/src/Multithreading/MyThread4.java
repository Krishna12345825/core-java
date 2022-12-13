package Multithreading;

class DemoThread4 extends Thread 
{
	public void start()
	{
		super.start();
		System.out.println(" start method");
	}
	public void run()
	{
		System.out.println(" run method ");
	}
	
}
public class MyThread4
{

	public static void main(String[] args) 
	{
		DemoThread4 th = new DemoThread4();
		th.start();
       System.out.println(" main method ");
	}

}
