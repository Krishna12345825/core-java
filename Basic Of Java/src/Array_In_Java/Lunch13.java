package Array_In_Java;

public class Lunch13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] a= {10,20,30,40,50};
		
      int[][] a= {{10,20},{30,40,50},{60,70,80,90}};
      
      for(int arr[]:a)
      {
    	  for(int element:arr)
    	  {
    		  System.out.print(element+ " ");
    	  }
    	  System.out.println();
      }
				
	}

}
