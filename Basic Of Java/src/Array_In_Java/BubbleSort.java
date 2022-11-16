package Array_In_Java;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {7,5,2,3,1,4,6};

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}
	}

}
