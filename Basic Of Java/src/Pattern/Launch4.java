package Pattern;

public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
		 	{
				// G (i==0 && j>0 && j< (3*n)/4) || 
				/*(j==0 && i>0 && i<n-1) ||
				(i==(n-1)/2 && j>=(n-1)/2 && j<=(3*n)/4) ||
				(j==(3*n)/4 && i>=(n-1)/2) ||
				(i==n-1 && j<(n-1)/2) ||
				(j==(n-1)/2 && i>=(n-1)/2)*/
				
				 //H j==0 || j==(3*n)/4 || i==(n-1)/2 && j<=(3*n)/4
				if(j==0 || i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 ||
						j==(n-1)/2 && i<(n-1)/2 && i>0)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
