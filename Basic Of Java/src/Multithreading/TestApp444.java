package Multithreading;

class Display221{
	public void wish(String name) {
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				System.out.println("Good Morning");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					
				}
				System.out.println(name);
			}
		}
	}
}

class MyThread23 extends Thread{
	Display221 d;
	String name;
	MyThread23(Display221 d, String name){
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class TestApp444{

	public static void main(String[] args) {
		Display221 d1 = new Display221();
		Display221 d2= new Display221();
		MyThread23 t1= new MyThread23(d1,"Krishna");
		MyThread23 t2= new MyThread23(d2,"Kumar");
		t1.start();
		t2.start();
	}

}
