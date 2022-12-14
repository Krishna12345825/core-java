package Multithreading;

class Display{
	public void wish(String name) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(" Good Morning ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}
}

class Mythread22 extends Thread{
	Display d;
	String name;
	Mythread22(Display d, String name){
		this.d=d;
		this.name=name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
	
}
public class TestApp9 
{

	public static void main(String[] args)
	{

		Display d= new Display();
		Mythread22 t1= new Mythread22(d,"Krishna");
		Mythread22 t2= new Mythread22(d,"kumar");
		t1.start();
		t2.start();

	}

}
