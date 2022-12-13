package Multithreading;
class DemoThread1 extends Thread
{
	public void run()
	{
		System.out.println("No agrs method ");
	}
	
	public void start()
	{
		System.out.println("start agrs method ");
	}
}

public class Mythread2 {

	public static void main(String[] args) {
	
		DemoThread1 td = new DemoThread1();
		td.start();
	}

}
