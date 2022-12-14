package Multithreading;
class  ThreadBB extends Thread{
	int total=0;
	
	public void run() {
		synchronized(this) {
			System.out.println("child thread startd calculation");
			for(int i=0;i<=100;i++) {
				total+=i;
			}
			System.out.println("child thread trying to give notification");
			this.notify();
		}
	}

}

public class TestApp13 {

	public static void main(String[] args)throws InterruptedException {
		
		ThreadBB b = new ThreadBB();
		b.start();
		Thread.sleep(10000);   // 10 sec
		synchronized(b) {
			System.out.println("Main thread is calling wait on B object");
			b.wait();
			System.out.println("Main thread got notification");
			System.out.println(b.total);
		}
	}

}
