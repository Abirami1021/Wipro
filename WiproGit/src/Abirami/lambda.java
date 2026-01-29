package Abirami;
//Without lambda
interface Drawn
{
	void draw();
}
public class lambda {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Without lambda
		/*Drawn d=new Drawn()
		{
		public void draw()
		{
		System.out.print("Drawing ");
		}
		};*/
		
		//With Lambda
		Drawn d=()->System.out.print("Drawing ");
d.draw();
	}
}
