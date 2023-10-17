package in.co.rays.test;

import java.util.Iterator;
import java.util.List;

import in.co.rays.model.MarksheetModel;
import in.com.rays.bean.MarksheetBean;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {
		
		
		 testadd();
	//	testupdate();
	//	testdelete();
	//	testFindById();
		//testserch();
		
	}

	private static void testserch() throws Exception {
		 MarksheetBean bean = new MarksheetBean();
		 bean.setName("shu");
		 bean.setRollN0(102);
		  MarksheetModel model = new MarksheetModel();
		   List list  = model.search( null , 1 , 5);
		   Iterator it  = list.iterator();
		    while (it.hasNext()) {
		    	
		    	
		    	bean = (MarksheetBean)it.next();
		    	System.out.println(bean.getId());
		    	System.out.print("\t" +bean.getName());
		    	System.out.print( "\t"+bean.getRollN0());
		    	System.out.print("\t"+bean.getPhysics());
		    	System.out.print("\t"+bean.getChemistry());
		    	System.out.print("\t"+bean.getMaths());
				
			}
		
	}

	private static void testFindById() throws Exception {
	        MarksheetModel model = new MarksheetModel();
	        
		   MarksheetBean bean = model.findById(11);
		   if(bean!=null) {
			   System.out.println(bean.getId());
			   System.out.println(bean.getName());
			   System.out.println(bean.getRollN0());
			   System.out.println(bean.getPhysics());
			   System.out.println(bean.getChemistry());
			   System.out.println(bean.getMaths());
		   }else {
			   System.out.println("ID does not exist");
		   }
	}

	private static void testdelete() throws Exception {
		 MarksheetModel model  = new MarksheetModel();
		 
		model.delet(13);
	}

	private static void testupdate() throws Exception {
	   MarksheetBean bean  = new MarksheetBean();
	    bean.setId(2);
	    bean.setName("anil");
	    bean.setRollN0(102);
	    bean.setPhysics(67);
	    bean.setChemistry(67);
	    bean.setMaths(23);
	      MarksheetModel model =  new MarksheetModel();
	      model.update(bean);
		
	}

	private static void testadd() throws Exception {
	  
		  MarksheetBean bean = new MarksheetBean();
		  bean.setId(11);
		 bean.setName("viru");
		  bean.setRollN0(111);
		  bean.setPhysics(90);
		  bean.setChemistry(45);
		  bean.setMaths(56);
		  
		   MarksheetModel model = new MarksheetModel();
		   model.add(bean);
		
	}
	}
	

