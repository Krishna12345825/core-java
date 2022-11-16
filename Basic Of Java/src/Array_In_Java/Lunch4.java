package Array_In_Java;

import java.util.Scanner;

public class Lunch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		int [][] arr= new int[3][]; // array declaration
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[2];
		 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter marks of class "+i +" student"+j);
				arr[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("The marks of students are");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
