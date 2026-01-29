package Abirami;

class PatientRegistration
{

private String id;
private String name;
private int age;
private String illness;
void setAll(String id,String name,int age,String illness)
{
	this.id=id;
	this.name=name;
	this.age=age;
	this.illness=illness;
}
public String getId()
{
	return id;
}
public String getName()
{
	return name;
}
public int getAge()
{
	return age;
}
public String getIllness()
{
	return illness;
}
void Display()
{
	System.out.println("Patient Id: "+id);
	System.out.println("Patient Name: "+name);
	System.out.println("Patient Age: "+age);
	System.out.println("Patient Illness: "+illness);
}
}
abstract class Doctor
{
	public static String DocName;
	public static String Specilisation;
	public void DocInfo(String DocName,String Specilisation)
	{
		System.out.println("Docator's Name :"+DocName);
		System.out.println("Doctor's Specialzation: "+Specilisation);
	}
	abstract void Diagnosis();
}
class DocType extends Doctor{
	void Diagnosis()
	{
		System.out.println("Helath issue");
	}
}
class DocS extends DocType{
	void Diagnosis()
	{
		System.out.println("General Physiscian");
	}
}

public class HealthCareSector {

	public static void main(String[] args)
	{
		PatientRegistration p=new PatientRegistration();
		p.setAll("4567", "Anu", 32, "Fever");
		p.Display();
		DocType d=new DocType();
		d.DocInfo("Dr.Abi","Gynacologist");
		d.Diagnosis();
		DocType r=new DocS();
		r.Diagnosis();
	
	}
}
