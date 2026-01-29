package Abirami;

class Record
{
	private String name;
	private String status;
	private String healthissue;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setStatus(String status)
	{
		this.status=status;
	}
	public void setHealthissue(String healthissue)
	{
		this.healthissue=healthissue;
	}
	public String getName()
	{
		return name;
	}
	public String getStatus()
	{
		return status;
	}
	public String getHealthissue()
	{
		return healthissue;
	}
}
public class Patient {

	public static void main(String[] args) 
	{
		Record r=new Record();
		r.setName("Arun");
		r.setStatus("Good");
		r.setHealthissue("Fever");
		System.out.println(r.getName());
		System.out.println(r.getStatus());
		System.out.println(r.getHealthissue());
		// TODO Auto-generated method stub

	}

}
