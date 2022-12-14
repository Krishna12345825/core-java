package ExceptionHandling;
import java.util.*;

class Alpha
{
	void alpha() throws ArithmeticException
	{
		System.out.println(" connection to calculate app is established ");
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the first Number to divide ");
		int num1=scan.nextInt();
		System.out.println(" Enter the Second Number to divide ");
		int num2= scan.nextInt();
		int rest = num1/num2;
		System.out.println(" The result is " + rest);
		System.out.println(" Connection is terminated ");
		
	}
}

class Beta
{
	void beta() throws ArithmeticException
	{
		Alpha a = new Alpha();
		a.alpha();
	}
}
public class LunchException4 {

	public static void main(String[] args) {
		
		try {
			Beta b = new Beta();
			b.beta();
			
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
			System.out.println(" Exception finally handled in main");
		}
	}

}
