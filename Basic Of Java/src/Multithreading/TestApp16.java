package Multithreading;
class AA extends Thread{
public synchronized void d1(BB b){
System.out.println("Thread-1 starts execution of d1()");
try{
Thread.sleep(5000);//5sec
}
catch (InterruptedException e){
}
System.out.println("Thread-1 trying to call B last()");
b.last();
}
public synchronized void last(){
System.out.println("Inside A last() method");
}
}
class BB extends Thread{
public synchronized void d2(AA a){
System.out.println("Thread-2 starts execution of d2()");
try{
Thread.sleep(5000);//5sec
}
catch (InterruptedException e){
}
System.out.println("Thread-2 trying to call A last()");
a.last();
}
public synchronized void last(){
System.out.println("Inside B last() method");
}
}

public class TestApp16 extends Thread
{
	AA a=new AA();
	BB b=new BB();
	public void m1(){
	this.start();
	a.d1(b);//line executed by main thread
	}
	public void run(){
	b.d2(a);//line executed by child thread
	}
	public static void main(String[] args) 
	{
		TestApp16 t= new TestApp16();
		t.m1();
	}

}
