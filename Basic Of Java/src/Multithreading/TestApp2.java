package Multithreading;
class Test extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(" Child Thread");
		}
	}
}

public class TestApp2
{

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.setPriority(10);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(" main Thread");
		}
		

		
	}

}
