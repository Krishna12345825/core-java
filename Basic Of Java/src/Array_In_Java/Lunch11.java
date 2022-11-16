package Array_In_Java;

//WAP to get the sum of all elements in an array

public class Lunch11 {

	public static void main(String[] args) {

		int[] a= {20,10,30,40};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("The Sum is " + sum);
	}

}
