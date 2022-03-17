package com.raystec.Studentmgt;

public class TestStudent {

	public static void main(String[] args) throws Exception {
		//add();
		//update();
		//delete();
		//get();
		//search();
	}

	private static void search() throws Exception {
		StudentBean bean = new StudentBean();
		
		StudentModel model = new StudentModel();
		model.search(bean);
		
	}

	private static void get() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setRollNo("A102");

		StudentModel model = new StudentModel();
		model.get(bean);
	}

	private static void delete() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setRollNo("A103");
		
		StudentModel model = new StudentModel();
		model.delete(bean);
		
	}

	private static void update() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setFirstName("Nitin");
		bean.setLastName("Kumar");
        bean.setSession("2018");
		bean.setRollNo("A102");
		
		StudentModel model = new StudentModel();
		model.update(bean);

		
	}

	private static void add() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setRollNo("A108");
		bean.setFirstName("mohit");
		bean.setLastName("Singh");
		bean.setSession("2018-19");
		
		StudentModel model = new StudentModel();
		model.add(bean);
		
	}
}
