package in.com.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddTest1 { 
	  
	 public static void main(String[] args) throws Exception {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/raysss","root","root");
		 Statement stmt = conn.createStatement();
		 int i = stmt.executeUpdate("insert into rays values (1,'yash',65656)");
		 stmt.executeUpdate("insert into rays values (2,'yash',65656)");
		 stmt.executeUpdate("insert into rays values (3,'yash',65656)");
		 stmt.executeUpdate("insert into rays values (4,'yash',65656)");
		 stmt.executeUpdate("insert into rays values (5,'yash',65656)");
		 stmt.executeUpdate("insert into rays values (6,'yash',65656)");
	//	 stmt.executeUpdate("alter table rays add number int");
	 //executeUpdate(" update table rays number = 45454545 where id = 1");
		 stmt.executeUpdate("update rays set number = 6767676 where id = 1");
		 System.out.println("data inserted"+i);
	}

}
