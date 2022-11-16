package Assignment1;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n=14;
		for (int i = 0; i <n; i++) {
 			for (int j = 0; j <n; j++) {
				if (j==0 || j==(n-1) || i==0 ||
					i==(n-1) || j<7-i || j>5+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}

}
