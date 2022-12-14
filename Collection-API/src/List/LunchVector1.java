package List;

import java.util.*;

public class LunchVector1 
{

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		v.add(600);
		Enumeration em = v.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		
		System.out.println(v);

		
		
	}

}
