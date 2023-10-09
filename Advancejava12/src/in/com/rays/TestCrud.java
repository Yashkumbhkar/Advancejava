package in.com.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class TestCrud {

	 public static void main(String[] args) throws Exception {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection conn = 	 DriverManager.getConnection("jdbc:mysql://localhost:3306/yash","root","root");
		 
		  PreparedStatement ps = conn.prepareStatement("insert into employe values(?,?,?)");
		  ps.setInt(1,11);
		  ps.setString(2, "nadu");
		  ps.setInt(3, 4544);
		   
		   int i = ps.executeUpdate();
		   System.out.println("data insered"+i);
	}
}
