package Array_In_Java;
//WAP to get min and max elem in an array

public class Lunch12 {

	public static void main(String[] args) {

		int []arr= {1,34,67,89};
		int max=arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]<max) {
				max=arr[i];
			}
		}
		System.out.println("The max value is  "+ max);
		
		
		int max1=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]>max1) {
				max1=arr[i];
			}
		}
		System.out.println(" The max value is "+max1);
	}

}
