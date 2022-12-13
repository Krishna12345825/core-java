package List;
// TO use of the collection classes we need to import
  import java.util.*;
public class Lunch2 
{

	public static void main(String[] args) 
	{
        ArrayList all= new ArrayList();
        all.add(10);
        all.add(20);
        all.add(30);
        all.add(40);
        all.add(50);
        
        // Homogeneous type of data is allowed 
        System.out.println(all);
		System.out.println("******************************");
		
		
		ArrayList al2= new ArrayList();
		al2.add("Krishna");
		al2.add("Kumar");
		al2.add('K');
		al2.add(18.5);
		al2.add(18.5);
		
		System.out.println(al2);
		System.out.println("**************************");
		
		// we can add entire collection into another collection
		
		ArrayList al3 = new ArrayList();
		al3.addAll(al2);
		System.out.println(al3);
		
		System.out.println("**************************");
		
		ArrayList al4 = new ArrayList();
		al4.add(11);
		al4.add(22);
		al4.add(33);
		al4.add(44);
		System.out.println("existing data " + al4);
		
        al4.add(2, 28);
		
		System.out.println("after adding in 2nd index "+al4);
		al4.add(0, 5);
		
		System.out.println("after adding in 0th index "+al4);
		
		al4.add(55);
		
		System.out.println("after adding in rear end "+al4);
		al4.addAll(1, al2);
		System.out.println(al4);
        
	}
	

}
