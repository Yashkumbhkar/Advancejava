package in.co.rays.util;

import java.sql.Connection;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public  final class JdbcDataSource {

	private static JdbcDataSource jds = null;
	  
	 private ComboPooledDataSource ds = null;
	    
	  ResourceBundle rb = ResourceBundle.getBundle("in.com.rays.bundle.app");
	 
	   private JdbcDataSource() {
		   try {
			   
			   ds = new ComboPooledDataSource();
			   
			   ds.setDriverClass(rb.getString("driver"));
			   ds.setJdbcUrl(rb.getString("url"));
			   ds.setUser(rb.getString("username"));
			   ds.setPassword(rb.getString("password"));
			   ds.setInitialPoolSize(Integer.parseInt(rb.getString("initialpoolsize")));
			   ds.setAcquireIncrement(Integer.parseInt(rb.getString("acquireincrement")));
			   ds.setMaxPoolSize(Integer.parseInt(rb.getString("maxpoolsize")));
			
		} catch (Exception e) {
	
		} 
	
	   }
	   public static JdbcDataSource getInstance () {
		   
		   if (jds == null) {
			 jds = new JdbcDataSource();
		}
		   
		   
		return jds;
		   
	   }
	   
	   public static Connection getConnection () {
		   try {
			 return getInstance().ds.getConnection();
		} catch (Exception e) {
		
		}
		   
		   
		return null;
		   
	   }
}