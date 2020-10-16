package sh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Write a program for inserting records into table.
 */
public class Q2 {

	public static void main(String[] args) throws SQLException {

		String driver = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		}

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SH", "root", "qwertyuiop1234[]");
		Statement st = con.createStatement();

		String query = "insert into employee values(2, \"Jatin\", \"Thakur\", 30000, 1001, \"jatinthakur@xyz.com\", \"Mandi\")";
		String query1 = "insert into employee values(3, \"Daya\", \"singh\", 30000, 1001, \"dayasingh@xyz.com\", \"Delhi\")";
		String query2 = "insert into employee values(1, \"Bhavya\", \"Arora\", 25000, 1001, \"bhavya@xyz.com\", \"Chandigarh\")";
		try {
			st.executeUpdate(query2);
			System.out.println("Insertion Successful");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		try {
			st.executeUpdate(query);
			System.out.println("Insertion Successful");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		try {
			st.executeUpdate(query1);
			System.out.println("Insertion Successful");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		st.close();
		con.close();
	}

}
