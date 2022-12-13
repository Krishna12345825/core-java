package Multithreading;
class Demo1Thread implements Runnable
{

	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		System.out.println(" child thread ");
	}
	
}

public class MyRunnable1 
{

	public static void main(String[] args) {
		
		Demo1Thread th = new Demo1Thread();
		Thread t = new Thread(th);  //call MyRunnable run()
		t.start();
		for(int i=1;i<=10;i++)
			System.out.println("main thread");
	}

}
