package Encapsulation;

class Demo
{
	static int a;
	static int b;
	
	static
	{
		System.out.println("static bloack");
		a=10;
		b=20;
	}
	static void disp()
	{
		System.out.println("static method");
		System.out.println(a);
		System.out.println(b);
	}
	int x;
	int y;
	{
		x=10;
		y=20;
		System.out.println("Non static java block");
	}
	Demo()
	{
		System.out.println("constructor");
	}
	void disp1()
	{
		System.out.println("Non static method");
		System.out.println(x);
		System.out.println(y);
	}
	void disp2()
	{
		disp();
	}
}

public class LunchStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo.disp();
		Demo d= new Demo();
		d.disp();
		d.disp1();
	}

}
