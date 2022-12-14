package Multithreading;
class Thread1 extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("I am lazy persion ");
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e) {
			System.out.println("I got interrupted ");
		}
	}
}

public class TestApp7 
{

	public static void main(String[] args)
	{
		Thread1 t= new Thread1();
		t.start();
		t.interrupted();
		System.out.println("End of Main....");

	}

}
