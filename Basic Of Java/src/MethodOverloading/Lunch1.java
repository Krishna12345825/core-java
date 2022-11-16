package MethodOverloading;

// Can we overload main method in java ?

public class Lunch1 {

	public static void main(String[] args) {
   System.out.println("its actual main method");		
		
	}
	
	public static void main(int [] args) {
		   System.out.println("accepting int args");		
				
			}
	
	public static void main(double b) {
		   System.out.println("double value");		
				
			}

}
