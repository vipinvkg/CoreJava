package com.raystech.OOP;

public class TestShallowCloning {

	public static void main(String[] args) throws Exception {
		
		Account_ShallowCloning a1 = new Account_ShallowCloning();
		a1.setBal(1000);
		a1.setType("saving");
		
		Customer_ShallowCloning c1 = new Customer_ShallowCloning();
		c1.setId(101);
		c1.setName("vipin");
		c1.setAcc(a1);
		
		Customer_ShallowCloning c2 = (Customer_ShallowCloning) c1.clone();
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getAcc().getBal());
		System.out.println(c1.getAcc().getType());
		
		System.out.println(c2.getId());
		System.out.println(c2.getName());
		System.out.println(c2.getAcc().getBal());
		System.out.println(c2.getAcc().getType());
		
	}
}
