package Array_In_Java;

import java.util.Scanner;

public class Lunch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		int [][][] arr= new int[2][3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					  System.out.println("Enter marks of College "+ i+ " Class "+ j + " Student "+k);
					  arr[i][j][k]=scanner.nextInt();
				}
			}
		}
		
		System.out.println("Markd stored are as follows");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] +" ");
				}
				System.out.println();
			}
		}
	}

}
