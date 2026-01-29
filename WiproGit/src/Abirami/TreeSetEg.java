package Abirami;
import java.util.*;

public class TreeSetEg
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>();
		Scanner ob=new Scanner(System.in);
		String v=ob.nextLine();
		if(v!=null)
		{
			System.out.println("ENter: "+ts.add(v));
		}
		else
		{
			System.out.println("Null value");
		}
		/*ts.add("Cbe");
		ts.add("Andhra");
		ts.add("Chennai");
		ts.add("Blr");
		//----not allow null in tree it gives exception errorts.add(null);
		
		System.out.println(ts);*/
		
		/* try {
			
			cites.add("Delhi");
			cites.add("Mumbai");
			cites.add("Chennai");
			cites.add("Delhi");
			cites.add(null);	
		}
catch(NullPointerException e)
		{
	System.out.println(cites);
	System.out.println("Null value not allowedin Treeset");*/

	}

}
