package Abips;
import java.util.*;
class Student
{
	String id;
	String name;
	int mark;
	
	Student(String id,String name,int mark)
	{
		this.id=id;
		this.name=name;
		this.mark=mark;
	}
		void display() {
	        System.out.println(id + " " + name + " " + mark);
		}
}
public class Prac {

	public static void main(String[] args) 
	{
		//nner ob=new Scanner();
		List<Student>list=new ArrayList<>();
		list.add(new Student("1","Abi",80));
		list.add(new Student("2","Abisu",90));
		list.add(new Student("3","Abar",20));
		list.add(new Student("4","Abinaya",40));
		list.add(new Student("5","Abisree",60));
		System.out.println("All students: ");
		for(Student s:list)
		{
			s.display();
		}

		System.out.println("\nStudents with marks: ");
		for(Student s:list)
		{
			if(s.mark>80)
			{
				s.display();
			}
		}
		}
		

	}
