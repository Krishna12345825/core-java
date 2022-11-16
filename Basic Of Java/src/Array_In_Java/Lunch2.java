package Array_In_Java;

import java.util.Scanner;

public class Lunch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to store and display marks of 5 students
		Scanner scanner = new Scanner(System.in);
		
		int []arr= new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please Enter marks of student "+ i);
			arr[i]= scanner.nextInt();
		}
		System.out.println("The marks of students are as follows");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
