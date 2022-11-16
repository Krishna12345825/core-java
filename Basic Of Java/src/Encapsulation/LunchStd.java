package Encapsulation;

class Student1
{
	private String name;
	private int age;
	private String city;
	
	public Student1(String name, int age, String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
	String getCity()
	{
		return city;
	}
}
public class LunchStd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 std1= new Student1("krishna",12,"Bihar");
		//std1.setData("Rohan", 18, "Bengaluru");
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
		System.out.println(std1.getCity());
	}

}
