package Multithreading;

class Threadss extends Thread
{
	
}
public class MyThread5 
{

	public static void main(String[] args) 
	{
       Threadss t = new Threadss();
		t.start();
		System.out.println(t.getName());  //Thread-0
		System.out.println(Thread.currentThread().getName());  //main
		Thread.currentThread().setName("Krishna kumar yadav");
		System.out.println(Thread.currentThread().getName());
		//System.out.println(10/0);
	}

}
