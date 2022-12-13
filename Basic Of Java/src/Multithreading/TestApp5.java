package Multithreading;
class Test11 extends Thread 
{
	static Thread mt;
	@Override
	public void run(){
	try{
	mt.join();
	}
	catch (InterruptedException e){
	}
	for (int i=1;i<=10 ;i++ ){
	System.out.println("child thread");
	}
	}
}

public class TestApp5 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Test11 t = new Test11();
		t.start();
		t.join();
		for (int i=1;i<=10;i++ ){
		System.out.println("main thread");
		Thread.sleep(2000);//20sec sleep
		}
	}

}
