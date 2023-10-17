package in.co.rays.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import in.co.rays.model.UserModel;
import in.com.rays.bean.UserBean;


public class TestUser {

	 public static void main(String[] args) throws Exception {
		
		//  testAdd();
	  testupdate();
		 //testsearch();
		   
		    
	}

	private static void testsearch() throws Exception {
	
		 UserBean bean = new UserBean();
		  bean.setFirstName("y");
		  bean.setId(2);
		  
		   UserModel model = new UserModel ();
		   List list = model.search(bean, 1, 2);
		   
		 Iterator it = list.iterator();
		  while (it.hasNext()) {
			  
			   bean = (UserBean)it.next();
			   System.out.println("\t"+bean.getId());
			   System.out.println("\t"+bean.getFirstName());
			   System.out.println("\t"+bean.getLastName());
			   System.out.println(bean.getLoginId());
			   System.out.println(bean.getPassword());
			   System.out.println(bean.getDob());
			   System.out.println(bean.getAddress());
			
		}
		 
	}

	private static void testupdate() throws Exception {
		
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 // UserBean bean = new UserBean();
		   
		//   bean.setFirstName("vishu");
		  // bean.setLastName("sharma");
	//	   bean.setLoginId("vishu@gmail.com");
		//   bean.setPassword("2323");
		  // bean.setDob(sdf.parse("2004-04-04"));
		//   bean.setAddress("dewas");
		  // bean.setId(1);
		   
		  
		  
		  
		//   UserModel model = new UserModel();
		  //  model.update(bean);
		 
		 UserModel model = new UserModel();
		  UserBean bean = model.findById(5);
		   
		   bean.setFirstName("raj");
		   bean.setLastName("kumbhkar");
		   bean.setLoginId("raj@gmail.com");
		   model.update(bean);
		 
		 
		 
		 
	}

	private static void testAdd() throws Exception {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		UserBean bean = new UserBean();
		
		   
		 
		 bean.setFirstName("vishu");
		 bean.setLastName("sharma");
		 bean.setLoginId("r@gmail.com");
	 bean.setPassword("12336");
	bean.setDob(sdf.parse("2003-05-04"));
		bean.setAddress("rewa");

		UserModel model = new UserModel();
		model.add(bean);

			 
				 
	}
}
