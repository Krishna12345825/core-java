package Assignment1;

public class Question5 {

	public static void main(String[] args) {
		int j,i,n=14;
		for ( i = 0; i <n; i++) {
			for ( j = 0; j <n; j++) {
				if (i==0 || i==(n-1) || j==0 ||j<n/2-i || j<i-5) {
			 		System.out.print("*");
		 	 	}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
