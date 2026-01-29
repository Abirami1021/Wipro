package Abips;
 
import java.util.*;
public class ComparatorEg {
public static void main(String[] args)
{
TreeMap<Integer, String>Employee=new TreeMap<>(Comparator.reverseOrder());
Employee.put(101, " Vinay ");
Employee.put(102, " Sonali ");
Employee.put(103, " Renu ");
Employee.put(104, " Sai ");
		
System.out.println(Employee);
		
 
}
}
 