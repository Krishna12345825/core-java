package Multithreading;
class Test12 extends Thread 
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

public class TestApp6 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Test12.mt=Thread.currentThread();
		Test12 t=new Test12();
		t.start();
		for (int i=1;i<=10;i++ ){
		System.out.println("main thread");
		Thread.sleep(2000);//20sec sleep
		}
	}

}
