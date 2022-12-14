package Multithreading;

class MyThreadsaa extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(2000);// 2sec
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class TestApp18 {

	public static void main(String[] args) {

		
		MyThreadsaa t= new MyThreadsaa();
		t.start();
	 
		System.out.println("end of main thread");
	}

}
