package Multithreading;
class Display13 {
	public void wish(String name) {
		synchronized(this) {
			for(int i=1;i<=10;i++)
			{
				System.out.println("Good Morning");
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					
				}
				System.out.println(name);
			}
		}
	}
}
class MyThreada extends Thread
{
	Display13 d;
	String name;
	MyThreada(Display13 d, String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}


public class TestApp11 
{

	public static void main(String[] args) 
	{
		Display13 d= new Display13();
		MyThreada t1= new MyThreada(d, "krishna");
		MyThreada t2= new MyThreada(d, "kumar");
		t1.start();
		t2.start();
		
	}

}
