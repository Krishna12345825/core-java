package Multithreading;
class MyThreadsa extends Thread{}
public class TestApp17
{

	public static void main(String[] args) 
	{
		
		System.out.println(Thread.currentThread().isDaemon());//false
		Thread.currentThread().setDaemon(true);//RE:IllegalThreadStartException
		MyThreadsa t=new MyThreadsa();
		System.out.println(t.isDaemon());//false
		t.setDaemon(true);
		t.start();
		System.out.println(t.isDaemon());//true
	}

}
