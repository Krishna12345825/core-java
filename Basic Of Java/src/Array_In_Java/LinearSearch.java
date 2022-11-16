package Array_In_Java;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar= {10,20,40,30,60,70,80,90};
		boolean flag=false;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the target to be searched");
		int target=scanner.nextInt();
		for (int i = 0; i < ar.length; i++)
		{
			if(target==ar[i])
			{
				System.out.println("key "+ target +" found at index " + i);
			  flag=true;
			  break;
			}
		}
		if (flag==false) 
		{
			System.out.println("key not found");
		}
	}

}
