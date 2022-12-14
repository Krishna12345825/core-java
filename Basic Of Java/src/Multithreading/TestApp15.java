package Multithreading;

class A {
public void d1(B b){
System.out.println("Thread-1 starts execution of d1()");
try{
Thread.sleep(5000);//5sec
}
catch (InterruptedException e){
}
System.out.println("Thread-1 trying to call b last()");
b.last();
}
public void last(){
System.out.println("Inside A last() method");
}
}
class B {
public void d2(A a){
System.out.println("Thread-2 starts execution of d2()");
try{
Thread.sleep(5000);//5sec
}
catch (InterruptedException e){
}
System.out.println("Thread-2 trying to call A last()");
a.last();
}
public void last(){
System.out.println("Inside B last() method");
}
}
public class TestApp15  extends Thread {
	A a=new A();
	B b=new B();
	public void m1(){
	this.start();
	a.d1(b);//executed by main thread
	}
	public void run(){
	b.d2(a);//executed by child thread
	}

	public static void main(String[] args) {
		TestApp15 t= new TestApp15();
		t.m1();
	}

}
