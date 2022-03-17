package com.raystec.marksheet;

public class TestMarksheetModel {

	public static void main(String[] args) throws Exception {
		
		//testadd();
		//testUpdate();
		//delete();
		//testget();
		//testsearch();
		testgetmaritlist();
		
	}

	private static void testgetmaritlist() throws Exception {
		MarksheetBean bean = new MarksheetBean();		
		MarksheetModel model = new MarksheetModel();
		model.getmeritlist(bean);
		
	}

	private static void testsearch() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		
		
		MarksheetModel model = new MarksheetModel();
		model.search();
		
	}

	private static void testget() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setRollno("Rays101");
		
		MarksheetModel model = new MarksheetModel();
		model.get(bean);
		
	}

	private static void delete() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(14);
		
		MarksheetModel model = new MarksheetModel();
		model.delete(bean);
	}

	private static void testUpdate() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setFname("Deepak");
		bean.setId(4);
		
		MarksheetModel model = new MarksheetModel();
		model.update(bean);
		
	}

	private static void testadd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		
		//bean.setId(11);
		bean.setRollno("Rays112");
		bean.setFname("Ramji");
		bean.setLname("Sharma");
		bean.setPhysics(67);
		bean.setChemistry(77);
		bean.setMath(68);
		
		MarksheetModel model = new MarksheetModel();
model.add(bean);
	
	}

}
