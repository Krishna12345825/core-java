package Multithreading;
class DemoThread3 extends Thread
{
	public void run()
	{
		System.out.println(" run methods");
	}
	
	public void start()
	{
		System.out.println(" start method ");
	}
}

public class MyThread3
{

	public static void main(String[] args) 
	{
		DemoThread3 th = new DemoThread3();
		th.start();
		System.out.println(" main method");
	}

}
