package Multithreading;

class Display22 {
	public synchronized void displayNumbers() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
	}
	
public synchronized void displayCharacters() {
	for(int i=65;i<=75;i++)
	{
		System.out.println((char)i);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException  e) {
			
		}
	}
 }
}

class MyThread33 extends Thread{
	Display22 d;
	MyThread33(Display22 d){
		this.d=d;
	}
	
	public void run() {
		d.displayNumbers();
	}
}
class MyThread34 extends Thread{
	Display22 d;
	MyThread34(Display22 d){
		this.d=d;
	}
	@Override
	public void run() {
		d.displayCharacters();
	}
}
public class TestApp10 
{

	public static void main(String[] args)
	{
		Display22 d1= new Display22();
		MyThread33 t1= new MyThread33(d1);
		MyThread34 t2= new MyThread34(d1);
		t1.start();
		t2.start();
	}

}
