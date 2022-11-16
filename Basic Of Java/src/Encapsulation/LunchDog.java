package Encapsulation;

class Dog
{
	private String name;
	private int cost;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public int getCost()
	{
		return cost;
	}
}
public class LunchDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.setName("Bittu");
		System.out.println(d.getName());
		d.setCost(10000);
//		int cost= d.getCost();
//		System.out.println(cost);
		
		System.out.println(d.getCost());
	}

}
