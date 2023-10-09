package in.com.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	
	 public static void main(String[] args) throws Exception {
		
		 // testadd();
		 // testupdate();
	//    testdelete();
	 //   testFindById();
	    testSearch();
	 }
	private static void testSearch() throws Exception {
		 MarksheetModel model = new MarksheetModel();
		 List list = model.search();
		 Iterator it  = list.iterator();
		  
		  while(it.hasNext()) {
			  MarksheetBean bean = (MarksheetBean)it.next();
			  
			  System.out.println(bean.getId());
			  System.out.print("\t"+bean.getName());
			  System.out.print("\t"+bean.getRollNo());
			  System.out.print("\t"+bean.getPhysics());
			  System.out.print("\t"+bean.getChemistry());
			  System.out.print("\t"+bean.getMaths());
			  
			  
		  }
		
	}
	private static void testFindById() throws Exception {
		 MarksheetModel model = new MarksheetModel();
		  MarksheetBean bean = model.findById(12);
		  if (bean!=null) {
			  System.out.println(bean.getId());
			  System.out.println(bean.getName());
			  System.out.println("\t"+bean.getName());
			  System.out.println("\t"+bean.getPhysics());
			  System.out.println("\t"+bean.getChemistry());
			  System.out.println("\t"+bean.getMaths());
			  
		  }else {
			  System.out.println("id does not exist");
		  }
		
	}
	private static void testdelete() throws Exception {
		
		   MarksheetModel model = new MarksheetModel();
		   model.delete(15);
		
	}
	private static void testupdate() throws Exception  {
		
		 MarksheetBean bean = new MarksheetBean();
		  bean.setName("virat");
		  bean.setRollNo(109);
		  bean.setPhysics(56);
		  bean.setChemistry(99);
		  bean.setMaths(99);
		  bean.setId(15);
		  
		  
	
		  MarksheetModel  model = new MarksheetModel();
		  model.update(bean);
		
	}

	private static void testadd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(15);
		bean.setName("vrat");
		bean.setRollNo(104);
		bean.setPhysics(40);
		bean.setChemistry(78);
		bean.setMaths(51);
		
		MarksheetModel model = new MarksheetModel();
		model.add(bean);
	}
	
}
