package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Student1 {
	private String name;
	private int age;
	private String city;

	public Student1(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}

public class LaunchMapsCom {

	public static void main(String[] args) {

		Student1 st1 = new Student1("Krishna Kumar ", 18, "Gaya");
		Student1 st2 = new Student1("Rani Kumari ", 14, "Gaya");
		Student1 st3 = new Student1("manish Kumar ", 49, "Gaya");

		HashMap hm = new HashMap();
		hm.put(1, st1);
		hm.put(2, st2);
		hm.put(3, st3);

		System.out.println(hm);

		System.out.println("*******************");
		System.out.println("*******************");

		// view
		// entrySet

		Collection col = hm.values();
		Iterator itr = col.iterator();
		while (itr.hasNext()) {
			System.out.println(" Value of Student  : " + itr.next());

		}

		System.out.println("*******************");

		Set set = hm.keySet();

		Iterator itr2 = set.iterator();
		while (itr2.hasNext()) {
			System.out.println("Key of Student : " + itr2.next());

		}
		System.out.println("********************");
		Set bothData=hm.entrySet();
		Iterator itr3=bothData.iterator();
		
		while(itr3.hasNext())
		{
			Entry data= (Entry)itr3.next();
			System.out.println(data.getKey() + " : " + data.getValue());
		}

	}

}
