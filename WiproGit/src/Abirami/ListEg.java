package Abirami;
import java.util.*;
public class ListEg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String>name=new ArrayList<>();
		ArrayList<String>name1=new ArrayList<>(); //both are same suntax
		
		name.add("Abi");
		name.add("Ash");
		name.add("Abi");
		name.add("Abirami");
		name.add("Ashwin");
		name.add("Abisu");
		name.set(2, "Ais");
		
		for(String n:name)
		{
			System.out.println(n);
		}
		
		System.out.println();
		System.out.println(name.contains("Abi"));
		name.remove(3);
		System.out.println(name);
	
		
		
		
		System.out.println(name.indexOf("Abisu"));      // first occurrence index
		System.out.println(name.lastIndexOf("Abi"));  // last occurrence index

		System.out.println(name.isEmpty());

	}

}
//allows dulicate valuess