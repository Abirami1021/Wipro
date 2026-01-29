package Abirami;

class Aadi
{
	private boolean engine;
	private int speed;
	private int fuel;
	
	Aadi(boolean engine,int speed,int fuel)
	{
		this.engine=engine;
		this.speed=speed;
		this.fuel=fuel;
	}
	public boolean getEngine()
	{
		return engine;
	}
	public int getSpeed()
	{
		return speed;
	}
	
	public int getFuel()
	{
		return fuel;
	}
	
}
public class Newcar {

	public static void main(String[] args) {
		Aadi ob=new Aadi(true,56,78);
		System.out.println(ob.getEngine());
		System.out.println(ob.getSpeed());
		System.out.println(ob.getFuel());

	}

}
