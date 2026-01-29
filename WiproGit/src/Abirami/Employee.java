package Abirami;
class Emp {
    private int salary;

    // setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // getter
    public int getSalary() {
        return salary;
    }
}
public class Employee {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Emp e =new Emp();
	e.setSalary(3000000);
		System.out.println(e.getSalary());

	}

}
