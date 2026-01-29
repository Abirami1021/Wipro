package Abirami;

class PracticeEmp 
{
	int id;
	String name;
	String salary;
	int start(int id)
	{
		return id;
	}
}
class Manager extends PracticeEmp
{
	String pause(String name)
	{
		return name;
	}
}
class Developer extends PracticeEmp
{
	String end(String salary)
	{
		return salary;
	}
}
class Main
{
	
	public static void main(String[] args) 
	{

		 PracticeEmp e = new PracticeEmp();
	        System.out.println(e.start(101));

	        // Manager object
	        Manager m = new Manager();
	        System.out.println(m.start(201));     // inherited
	        System.out.println(m.pause("Abi"));  // own method

	        // Developer object
	        Developer d = new Developer();
	        System.out.println(d.start(301));       // inherited
	        System.out.println(d.end("30000"));
	}

}
