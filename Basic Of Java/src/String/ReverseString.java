package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");

		
		
//		String s1 = sc.nextLine();
//		String s2 = "";
//		for (int i = s1.length() - 1; i >= 0; i--) {
//			s2 = s2 + s1.charAt(i);
//		}
//		System.out.println("Original Reverse String : " + s1);
//		System.out.println("After Reverse String : " + s2);

		
		
		
		
		
		
		// 2. Methods

//		String s1 = sc.nextLine();
//		String s2 = "";
//		String sarr[] = s1.split(" ");
//		for (String element : sarr) {
//			for (int i = element.length() - 1; i >= 0; i--) {
//				s2 = s2 + element.charAt(i);
//			}
//			s2 = s2 + " ";
//		}
//		System.out.println(s2);

		
		
		
		
		// 3. method   
		// input krishna kumar-> kumar krishna

		String s1 = sc.nextLine();
		String s2 = "";
		String sarr[] = s1.split(" ");
		for (int i = sarr.length - 1; i >= 0; i--) {
			s2 = s2 + sarr[i] + " ";
		}
		System.out.println(s1);
		System.out.println(s2);

	}

}
