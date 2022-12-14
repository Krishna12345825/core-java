package Multithreading;
class ThreadB1 extends Thread{
	int total=0;
	@Override
	public void run() {
		synchronized(this){
			System.out.println("Child thread started calculation");//step-2
			for (int i=0;i<=100 ; i++){
			total+=i;
			}
			System.out.println("Child thread trying to give notification");//step-3
			this.notify();
			}
	}
}

public class TestApp14 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ThreadB1 b= new ThreadB1();
		b.start();
		

		synchronized(b){
			System.out.println("Main thread is calling wait on B object");//step-1
			b.wait(10000);//10sec
			System.out.println("Main thread got notification");//step-4
			System.out.println(b.total);
			}
		
	}

}

