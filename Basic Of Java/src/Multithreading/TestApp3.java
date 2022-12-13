package Multithreading;
class Tests extends Thread
{
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(" Child Thread");
			Thread.yield();
		}
	}
}

public class TestApp3 
{

	public static void main(String[] args) 
	{
	
		Tests t= new Tests();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(" Parent Thread ");
		}
	}

}
