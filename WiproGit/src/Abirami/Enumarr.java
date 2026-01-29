package Abirami;

enum Day
{
	Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}
public class Enumarr {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Day[] ob=Day.values();
		for(Day d:ob)
		{
			System.out.println(d);
			Day[] working=new Day[5];
			working[0]=Day.Monday;
		}

	}

}
