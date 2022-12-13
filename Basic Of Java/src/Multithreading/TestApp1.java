package Multithreading;
class MyThread extends Thread
{
	
}

public class TestApp1
{

	public static void main(String[] args)
	{
	 System.out.println(Thread.currentThread().getPriority());  // 5
	 Thread.currentThread().setPriority(9);
	// MyThread h = new MyThread();
	 System.out.println(Thread.currentThread().getPriority());   //9

	}

}
