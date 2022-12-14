package ExceptionHandling;
//UncheckedException --> Compiler will not force us to handle(It will not be checked during compile time)
//CheckedException--> it will be checked by compiler 

public class LaunchException5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(" Before sleep");
		Thread.sleep(4000);
		System.out.println(" After the nap ");
		

	}

}
