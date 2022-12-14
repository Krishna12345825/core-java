package ExceptionHandling;

import java.util.*;

//Re-throwing an exception
class Alpha1
{
	void alpha() throws ArithmeticException
	{
		System.out.println(" Connection to calculate app is established ");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println(" Enter the first number to divide ");
			int num1= scan.nextInt();
			System.out.println(" Enter the Second number to divide ");
			int num2= scan.nextInt();
			int res= num1/num2;
			System.out.println(" The result is "+ res);
			
		} catch (ArithmeticException  e) {
			System.out.println(" Exception handled in alpha only ");
			throw e;
		}
		finally {
			System.out.println(" connection is terminated ");
		}
	}
}

public class LaunchException6 {

	public static void main(String[] args) {
		
		try {
			System.out.println(" Main method connetion ");
			Alpha1 a = new Alpha1();
			a.alpha();
		} catch (ArithmeticException e) {
			System.out.println(" Exception handled in main");
		}

	}

}
