package Abirami;
@FunctionalInterface
interface variable
{
	boolean variable(String input);
}
public class Funcdemo {

	public static void main(String[] args) 
	{
		variable emailCheck=email->email.contains("@");
		System.out.println(emailCheck.variable("abiash@gmail.com"));
	}

}
