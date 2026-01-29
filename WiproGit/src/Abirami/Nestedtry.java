package Abirami;

public class Nestedtry 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
			try													
			{
				int a=10/0;
			}
			catch (ArithmeticException e)
			{
				System.out.println("Inner catch: Divide by zero"+e);
			}
			int arr[]= {1, 2, 3};
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Outer Catch : Array index error"+e);
		}

	}

}
