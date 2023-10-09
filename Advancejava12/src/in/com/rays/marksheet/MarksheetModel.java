package in.com.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import java.sql.DriverManager;
public class MarksheetModel {

	   
	    public void add(MarksheetBean bean) throws Exception {
	    	
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	 Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/yash","root","root");
	    	 PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
	    	 ps.setInt(1,bean.getId());
	    	 ps.setString(2,bean.getName());
	    	 ps.setInt(3, bean.getRollNo());
	    	 ps.setInt(4,bean.getPhysics());
	    	 ps.setInt(5,bean.getChemistry());
	    	 ps.setInt(6,bean.getMaths());
	    	 int i = ps.executeUpdate();
	    	 System.out.println("data inserted"+i);
	    	 
	    	 
	    	 
	    }	
	    
	    public void update(MarksheetBean bean ) throws Exception {
	    	
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn = 	DriverManager.getConnection("jdbc:mysql://localhost:3306/yash","root","root");
	    PreparedStatement ps = conn.prepareStatement("update marksheet set name =? , Roll_number =?, physics=?,chemistry = ?, maths = ? where id = ?");
	    
	     ps.setString(1,bean.getName());
	     ps.setInt(2,bean.getRollNo());
	     ps.setInt(3,bean.getPhysics());
	     ps.setInt(4,bean.getChemistry());
	     ps.setInt(5,bean.getMaths());
	     ps.setInt(6,bean.getId());
	      
	      int i = ps.executeUpdate();
	      System.out.println("Data updated"+i);
	    	
	    }


	    public void delete (int id ) throws Exception {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection conn =   	DriverManager.getConnection("jdbc:mysql://localhost:3306/yash","root","root");
	    PreparedStatement ps =  conn.prepareStatement("delete from marksheet  where id = ?");
	       
	     ps.setInt(1, id);
	      int i  = ps.executeUpdate();
	       
	       System.out.println("data deleted " + i);
	
	     
	    }  
	    
	     public MarksheetBean findById(int id ) throws Exception {
			
	    	  Class.forName("com.mysql.cj.jdbc.Driver");
	    	 Connection conn =   DriverManager.getConnection("jdbc:mysql://localhost:3306/yash","root","root");
	    	 PreparedStatement ps = conn.prepareStatement("select * from marksheet where id =?");
	    	 ps.setInt(1,id);
	    	 ResultSet rs = ps.executeQuery();
	    	 
	    	  MarksheetBean bean = null;
	    	   
	    	   while (rs.next()) {
	    		   
	    		   bean = new MarksheetBean();
	    		   bean.setId(rs.getInt(1));
	    		   bean.setName(rs.getString(2));
	    		   bean.setRollNo(rs.getInt(3));
	    		   bean.setPhysics(rs.getInt(4));
	    		   bean.setChemistry(rs.getInt(5));
	    		   bean.setMaths(rs.getInt(6));
	    		   
	    		   
	    	   }
	    	   return bean;
	    	 
	     }
	      public List search() throws Exception{
	    	  Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yash","root","root");
	    	  PreparedStatement ps = conn.prepareStatement("select * from marksheet");
	    	  ResultSet  rs = ps.executeQuery();
	    	   List list = new  ArrayList();
	    	   while (rs.next()){
	    		   
	    		    MarksheetBean bean = new MarksheetBean();
	    		    bean.setId(rs.getInt(1));
	    		    bean.setName(rs.getString(2));
	    		    bean.setRollNo(rs.getInt(3));
	    		    bean.setPhysics(rs.getInt(4));
	    		    bean.setChemistry(rs.getInt(5));
	    		    bean.setMaths(rs.getInt(6));
	    		    
	    		    list.add(bean);
	    	   }
	    	  return list;
	      }
}


