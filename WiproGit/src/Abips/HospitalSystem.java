/*package Abips;
import java.util.*;
public class PatientUnique {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
	
		Set<String> set=new HashSet<>();
		set.add("12");
		set.add("11");
		set.add("120");
		set.add("19");
		set.add("18");
		set.add("19");
		set.add("12");
		
		while(true)
		{
			System.out.println("Enter ID: ");
			String a=ob.nextLine();
			if(a==null || a.isEmpty())
			{
				break;
			}
			
			if(set.contains(a))
			{
				System.out.println("\n"+a+" is Already registered");
			}
			else
			{
				System.out.println("Please enter your  new id: "+a);

				set.add(a);
				}
			for(String d:set)
			{
			System.out.println(d);
			}
			break;	}}}*/
package Abips;

import java.util.HashSet;
import java.util.Set;

public class HospitalSystem {

    private int patientId;
    private String name;
    private int age;

    // 👇 MUST be here (class level)
    private static Set<HospitalSystem> patients = new HashSet<>();

    public HospitalSystem(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public static void registrationPatient(HospitalSystem patient) {

        if (patients.contains(patient)) {
            System.out.println("Patient ID " + patient.patientId + " is already registered");
        } else {
            patients.add(patient);
            System.out.println("Patient added : " + patient);
        }
    }

    public static void displayPatient() {
        System.out.println("\nRegistered Patients:");
        for (HospitalSystem p : patients) {   // ✅ NO ERROR HERE
            System.out.println(p);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        HospitalSystem patient = (HospitalSystem) obj; // ✅ NO ERROR HERE
        return this.patientId == patient.patientId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(patientId);
    }

    @Override
    public String toString() {
        return "Patient [ID=" + patientId + ", Name=" + name + ", Age=" + age + "]";
    }

    public static void main(String[] args) {

        HospitalSystem p1 = new HospitalSystem(101, "Ravi", 30);
        HospitalSystem p2 = new HospitalSystem(102, "Ram", 28);
        HospitalSystem p3 = new HospitalSystem(101, "Ramesh", 35);

        registrationPatient(p1);
        registrationPatient(p2);
        registrationPatient(p3);

        displayPatient();
    }
}
