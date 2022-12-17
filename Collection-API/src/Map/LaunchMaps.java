package Map;

import java.util.*;
import java.util.Map.Entry;
public class LaunchMaps {

	public static void main(String[] args) {
		
		//Map hm= new  HashMap();
		//jdk 1.2
		// order of insertion is not  preserved
		HashMap hm = new HashMap();
		hm.put(10, "sachin");
		hm.put(7, " MSD");
		hm.put(18, "kohli");
		System.out.println(hm);
		
		
		System.out.println(hm.get(10) +" after this");
		System.out.println(" *****************");
		System.out.println("*******************");
		
		Collection c = hm.values();
		Iterator itr= c.iterator();
		while(itr.hasNext()) {
			
		 //System.out.println(itr.next());
			String o= (String) itr.next();
			System.out.println(o);
		}
		
		
		System.out.println("************************");
		System.out.println("*************************");
		Set s = hm.keySet();
		Iterator  itr2= s.iterator();
		while(itr2.hasNext()) {
			//System.out.println(itr2.next());
			Integer i = (Integer) itr2.next();
			System.out.println(" Key  : " + i);
			
		}
		
		System.out.println("********************");
		System.out.println("********************");
		
		
		Set es= hm.entrySet();
		Iterator  itr3 = es.iterator();
		while(itr3.hasNext()) {
		//	System.out.println(itr3.next());
			
			Map.Entry data = (Entry) itr3.next();
			System.out.println(data.getKey()+ " : " + data.getValue());		
		}
		
		System.out.println("********************");
		System.out.println("********************");
      // jdk 1.4
		// maintains order of insertion
		LinkedHashMap lhm= new LinkedHashMap();
		lhm.put(10, "Krishna Kumar");
		lhm.put(5 , "Rahul Kumar ");
		lhm.put(18, "Rani Kumari ");
		
		System.out.println(lhm);
		
		
	}

}
