package Abiiashu;
import java.sql.*;
public class Callabeljdbc {
	
	 
	public static void main(String[] args)
	{
		
	try {
		
	Class.forName("com.mysql.cj.jdbc.Driver"); // is a static method of the Class, class used to load a class dynamically at runtime.
		   
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Abi@2004");
	 
	Statement stmt=con.createStatement();
	 
	ResultSet rs=stmt.executeQuery(" select * from employee");
	 
	while (rs.next())
	{
		System.out.println(rs.getInt("emp_id") + "\t" + rs.getString("first_name")+ "\t" +rs.getString("last_name")+ "\t" +rs.getString("address")+ "\t"+
				rs.getDouble("salary")+ "\t" +rs.getString("phone_number")+ "\t" +rs.getString("dept_name"));
	}
	con.close();
	}
		catch (Exception e)
	   {
			System.out.println(e);
	   }
	}
	 
	}

