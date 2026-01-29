package Abirami;
import java.util.*;
public class SmartHome {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//autoboxing double to Double
		
		ArrayList<Double> temp= new ArrayList<>();
		temp.add(22.3);
		temp.add(44.5);
		temp.add(66.7);
		temp.add(88.9);
		
		//analyzer temperature (un boxing)
		System.out.println("Temp Analysis");
		
		for(Double te:temp) 
		{
		if(te>22.0)//unboxing Double to double
		{
		System.out.println("HIgh "+te);	
		}
		else
		{
			System.out.println("Low "+te);	
		}
		}
		//convert temp values to String
		System.out.println("\nTemp as String");
		
		for(Double te:temp)//for each loop conveting Double to double
		{
			String va=Double.toString(te);//wrapper mthnd
			System.out.println(va);
		}

	}

}
