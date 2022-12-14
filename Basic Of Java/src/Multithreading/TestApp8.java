package Multithreading;
class Test2 extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
			System.out.println(" I am lazy persion ");
		}
		System.out.println("I am entering into sleeping state");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

public class TestApp8 
{

	public static void main(String[] args) 
	{
		
		Test2 t = new Test2();
		t.start();
		t.interrupted();
		System.out.println(" main thread");
	}

}
