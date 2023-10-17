package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransaction {

	 public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yash", "root", "root");

			try {

				conn.setAutoCommit(false);

				Statement stmt = conn.createStatement();

				int i = stmt.executeUpdate("insert into employe values(12, 'shivanshi', 1000)");

				i = stmt.executeUpdate("insert into employe values(13, 'deepesh', 1000)");

				i = stmt.executeUpdate("insert into employe values( 14,'yash', 1000)");

				conn.commit();
				conn.close();
				System.out.println("Data inserted " + i);

			} catch (Exception e) {

				conn.rollback();

			

		}

	
	}
}
