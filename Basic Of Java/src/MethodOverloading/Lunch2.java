package MethodOverloading;

class calculator5
{
	float add (float a,int b )
	{
		return a+b;
	}
	
	float add(int c, float a)
	{
		return a+c;
	}
}

public class Lunch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  calculator5 calculator = new calculator5();
//  calculator.add(10, 20);
	}

}
