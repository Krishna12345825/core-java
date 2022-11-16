package Encapsulation;

class Students
{
	private int age;
	private String name;
	private String city;
	private boolean married;
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	public boolean isMarried()
	{
		return married;
	}
	
}
public class LunchEncap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students st= new Students();
		st.setName("Krishna kumar");
		st.setCity("Bhubneshwer");
		System.out.println(st.getName());
		System.out.println(st.getCity());
		
		Student st1= new Student();
		st1.setAge(19);
		System.out.println(st1.getAge());
	}

}
