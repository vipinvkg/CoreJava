package com.raystec;

import java.sql.SQLException;

public class TestRegistration {

public static void main(String[] args) throws Exception {
	add();
	//auth();
	//nauth();
}

private static void nauth() throws Exception {
	RegistrationModel m = new RegistrationModel();
	m.authent("gupta.vipin02@gmail.com", "vipin123");
	
}

private static void auth() throws Exception {
	RegistrationModel u = new RegistrationModel();
	u.authentication("gupta.vipin02@gmail.com", "vipin");
	
}

private static void add() throws Exception {
	RegistrationBean bean = new RegistrationBean();
	bean.setFname("Ankita");
	bean.setLname("Kumari");
	bean.setLoginid("ankita@gmail.com");
	bean.setPassword("gagan123");
	bean.setConpassword("gagan123");
	bean.setGender("male");
	bean.setDob("20/10/2020");
	
	RegistrationModel model = new RegistrationModel();
	model.add(bean);
}
}
