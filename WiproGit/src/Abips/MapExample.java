package Abips;
import java.util.*;
import java.util.Map;
public class MapExample
{
public static void main(String ss[])
{
	Map<Integer,String>Employee=new HashMap<>();
	Employee.put(101, "Abi");
	Employee.put(102, "Abar");
	Employee.put(103, "Abisu");
	Employee.put(null,null);
	
	if(Employee.containsKey(null))
	{
		Employee.remove(null);
		Employee.put(104, "Ais");
	}
	String em=Employee.get(103);
	System.out.println(em);
	System.out.println(Employee.containsKey(101));
	System.out.println(Employee.containsKey("Ais"));
	System.out.println(Employee);
}
	
}
