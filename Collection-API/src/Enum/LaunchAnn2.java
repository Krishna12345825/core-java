package Enum;

@interface cricketPlayer
{
	 // @---  > its not interface but its annotation being created
     String country();
     int runs();
}

class viratkohli
{
	private int innings;
	private String name;
	
	int getInnings()
	{
		return innings;
	}
	
	public void setInnings(int innings) {
		this.innings=innings;
		}
	public String getName() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
}

public class LaunchAnn2 {

	public static void main(String[] args) {
		viratkohli vk = new viratkohli();
		vk.setInnings(300);
		vk.setname("Krishna Kumar");
		
		
		System.out.println(vk.getInnings());
		System.out.println(vk.getName());
		

	}

}
