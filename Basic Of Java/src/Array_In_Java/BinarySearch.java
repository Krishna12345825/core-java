package Array_In_Java;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] ar= {10,20,30,40,50,60,70,80,90};
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the target to be searched");
		int target= scanner.nextInt();
		int start=0;
		int end=ar.length-1;
		while (start<=end)
		{
			int mid= start+(end-start)/2;
			if(target==ar[mid])
			{
				System.out.println(" target "+target+ " Found at index "+mid);
			   break;
			}
			else if (target<ar[mid])
			{
				end= mid-1;
			}
			else if (target>ar[mid])
			{
				start= mid+1;
			}
		}
		if (start>end) 
		{
			System.out.println(" key not found");
		}
	}
}