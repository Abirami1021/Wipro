package Abirami;

interface vehicle
{
	void start();
	
	default void fuelType()
	{
		System.out.println("Crying in the corner");
	}
	
}
class carss implements vehicle{
	public void start()
	{
		System.out.println();
	}
}
public class test {
public static void main(String[] args)
	{
 
	vehicle v=new carss();
	v.start();
	v.fuelType();
	
	}
}
 
 