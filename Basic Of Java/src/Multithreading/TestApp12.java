package Multithreading;
class ThreadB extends Thread{
	int total=0;
	public void run() {
		for(int i=0;i<=100;i++) {
			total+=i;
		}
		System.out.println("Child thread trying to give notification");
		this.notify();
	}
}

public class TestApp12 
{

	public static void main(String[] args) 
	{
		ThreadB b= new ThreadB();
		b.start();
		System.out.println(b.total);

		
	}

}
