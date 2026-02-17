package Abiiashu;
import java.sql.*;
public class Createtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to DB
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_db", "root", "Abi@2004");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. SQL Query
            String sql = "CREATE TABLE emplo (" +
                    "emp_id INT PRIMARY KEY AUTO_INCREMENT," +
                    "first_name VARCHAR(50)," +
                    "last_name VARCHAR(50)," +
                    "address VARCHAR(100)," +
                    "salary DOUBLE," +
                    "phone_number VARCHAR(15)," +
                    "dept_name VARCHAR(50))";

            // 5. Execute Query
            stmt.executeUpdate(sql);

            System.out.println("Table Created Successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}