package Encapsulation;

class Demo2
{
	static int a;
	static
	{
		a=10;
	}
	static void disp()
	{
		System.out.println("static disp "+a);
	}
}
public class LaunchStaticMethods {
	static void disp2()
	{
		System.out.println("disp 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method");
		disp2();
		Demo2.disp();
		
		Demo2 d = new Demo2();
		d.disp();
	}

}
