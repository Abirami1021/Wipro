package Abirami;

public class Excep {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			int a[]= {10,20,30};
		
			System.out.println(a[2]);
		}
		
		catch(Exception e)
		{
			System.out.println("Generic Exception");
		}
		finally
		{
			System.out.println("Final block executes");
		}

	}

}
