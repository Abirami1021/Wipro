package Abips;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Mapusecase {

    public static void main(String[] args) {

       

        TreeMap<Integer, String> tm = new TreeMap<>();

        // Pre-added patients
        tm.put(1, "Abi");
        tm.put(2, "Abar");
        tm.put(3, "Abisu");
        tm.put(4, "Abinaya");
        tm.put(10, "Ais");
        tm.put(11, "Ashu");
        tm.put(21, "Anu");

        System.out.println("Initial patients list: " + tm);

        // Retrieve 
        System.out.println("Patient with ID 1: " + tm.get(1));

        // Update
        if (tm.containsKey(10)) {
            tm.put(10, "Aathi");
            System.out.println("Updated patient with ID 10: " + tm.get(10));
        }

        // Add 
        if (!tm.containsKey(17)) {
            tm.put(20, "Vijay");
            System.out.println("Added new patient: ID 20, Name " + tm.get(20));
        } else {
            System.out.println("Patient ID 17 already exists");
        }

        // list all
        System.out.println("\nList of patients: " + tm);

        // Check exists
        System.out.println("Is patient name 'Abar' present? " + tm.containsValue("Abar"));

        // Total patients
        System.out.println("Total number of patients: " + tm.size());

        // Remove
        if (tm.containsKey(21)) {
            tm.remove(21);
            System.out.println("Removed patient with ID 21");
        }

       
        System.out.println("First patient entry: " + tm.firstEntry());
        System.out.println("Last patient entry: " + tm.lastEntry());

        //after updates
        System.out.println("\nPatients after updates: " + tm);

        // Clear
        tm.clear();
        System.out.println("After clearing the system: " + tm);

       
    }
}
