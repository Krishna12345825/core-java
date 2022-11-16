package Assignment2;

//1. WAP to find the duplicates present in an array.
public class Question1 {

	public static void main(String[] args) {
		int arr[]= {12,4,5,4,12};
          duplicates(arr);
	}
	public static void duplicates(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[i]==arr[j])
				{
					System.out.print(arr[j]+ " ");
				}
			}
		}
	}

}
