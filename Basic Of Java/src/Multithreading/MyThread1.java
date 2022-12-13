package Multithreading;

class DemoThread extends Thread
{
	public void run()
	{
		System.out.println("No args Method");
	}
	
	public void run(int i)
	{
		System.out.println("Zero args method "+ i);
	}
}

public class MyThread1
{

	public static void main(String[] args) {
		
     DemoThread d = new DemoThread();
       d.start();
       
	}

}
