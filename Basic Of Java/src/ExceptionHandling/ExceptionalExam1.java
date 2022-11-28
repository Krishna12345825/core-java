package ExceptionHandling;

import java.util.Scanner;

public class ExceptionalExam1 {

	public static void main(String []args) {
		System.out.println("Connection to calc app is established");
		try {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first num to divide");
		int num1= scan.nextInt();
		
		System.out.println("Enter the 2nd num to divide");
		int num2= scan.nextInt();
		int res= num1/num2;
		System.out.println("The result is "+ res);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("You are trying to divide by zero illogical ");
		}
		System.out.println("Connection is terminated");
		
	}
}
