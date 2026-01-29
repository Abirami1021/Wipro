package Abirami;
import java.util.*;
public class LinkedListEg 
{
	public static void main(String aar[])
	{
		
	LinkedList<String> patient=new LinkedList<>();
	patient.add("Abi");
	patient.add("Ashu");
	patient.add("Selva");
	
	patient.addFirst("Emergency Suresh");
	patient.addLast("Pooja");
	
	System.out.println("Patient list: "+patient);
	System.out.println("First patient: "+patient.getFirst());
	System.out.println("First patient: "+patient.getLast());
	System.out.println(patient.contains("Pooja"));
	
	System.out.println(patient.removeFirst());
      patient.remove("Pooja");
	System.out.println(patient.size());
	System.out.println("Updated List: ");
	
	for(String p:patient)
	System.out.println(p);
}
}
