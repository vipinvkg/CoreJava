package com.raystec.test;

import java.sql.SQLException;

import com.raystec.RegistrationBean;
import com.raystec.RegistrationModel;

public class TestRegistration {

public static void main(String[] args) throws Exception {
	//add();
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
	bean.setFname("Gagan");
	bean.setLname("Kumar");
	bean.setLoginid("gagan.kumar01@gmail.com");
	bean.setPassword("gagan123");
	bean.setConpassword("gagan123");
	bean.setGender("male");
	bean.setDob("20/10/2020");
	
	RegistrationModel model = new RegistrationModel();
	model.add(bean);
}
}
