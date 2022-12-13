package Multithreading;

class Threaddss extends Thread 
{
	public void run()
	{
		System.out.println(" run() executed by Thread :: "+ Thread.currentThread().getName());
	}
}
public class MyThread6 
{

	public static void main(String[] args) 
	{
		Threaddss th = new Threaddss();
		th.start();
        System.out.println(" main() executed by Thread ::" + Thread.currentThread().getName());
	}

}
