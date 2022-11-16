package MethodOverloading;

class Display
{
	void disp()
	{
		System.out.println("iNeuron");
	}
	void disp(String name)
	{
		System.out.println(name);
	}
	void disp(int age)
	{
		System.out.println(age);
	}
}

public class Lunch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display d=new Display();
		d.disp();
		d.disp(28);
		d.disp("Hyder");
	}

}
