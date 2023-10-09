package in.com.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class TestAdd {

	 public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunrays","root","root");
		 Statement stmt = conn.createStatement();
		 int i = stmt.executeUpdate("insert into yash values(1,'yash',545555)");
		 stmt.executeUpdate("insert into yash values(4,'dinesh',54555987)");
		 stmt.executeUpdate("insert into yash values(2,'ayush',5409)");
		 stmt.executeUpdate("insert into yash values(3,'ravi',5000)");
		 System.out.println("data inserted "+ i);
		 stmt.executeUpdate("delete from yash where id =1");
		 stmt.executeUpdate("alter table yash add number varchar(50)");
		 stmt.executeUpdate("update  yash set number = 787920387 where id =1");
	}
}
