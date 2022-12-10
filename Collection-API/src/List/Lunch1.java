package List;

import java.util.*;

public class Lunch1 
{

	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
	// duplicates object are not allow 
		al.add(30);
		System.out.println(al);
		
		
	 boolean res = al.contains(30);
	 System.out.println(res);
	 System.out.println(al.contains(20));
	 
	 
	 int index= al.indexOf(20);
	 System.out.println(index);
	 
	 System.out.println(al.isEmpty());
	 al.ensureCapacity(10);
	 System.out.println(al.size());
	 al.trimToSize();
	 System.out.println(al.getClass());
	 
	 
	 al.clear();
	 System.out.println(al);
	 System.out.println(al.size());
	}

}
