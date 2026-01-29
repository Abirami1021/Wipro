package Abirami;

class Rights
{
	private String name;
	private int age;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
public class Vote {

	public static void main(String[] args) 
	{
		Rights v=new Rights();
		v.setName("Abi");
		v.setAge(21);
		System.out.println("Identity: "+v.getName());
		if(v.getAge()<18)
		{
			System.out.println("Voting Rights: "+v.getAge()+" Not eligible");
		}
		else
		{
			System.out.println("Voting Rights: "+v.getAge()+" Eligible");
		}
		// TODO Auto-generated method stub

	}

}
