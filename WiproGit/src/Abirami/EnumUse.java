package Abirami;
enum Status
{
	//Monday,Tuesay,Wednesday,Thursday,Friday,Saturday,Sunday;
Sucess(200),
	ERROR(500);
	private final int code;
	Status(int code)
	{
		this.code=code;
	}
	public int getCode()
	{
		return code;
	}
}
public class EnumUse {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Status Stat=Status.ERROR;
		System.out.println(Stat);
		System.out.println(Stat.getCode());

	}

}
