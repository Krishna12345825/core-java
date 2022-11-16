package String;

import java.util.Scanner;

public class CopyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s1 = sc.nextLine();
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("Original  String " + s1);
		System.out.println("After Copy String " + s2);

	}

}
