package Practise;

public class ExceptionFinally {
public static void main(String[] args) {
	
	try {
		double div =15/0;
		System.out.println(div);
	} 
	catch (Exception e) {
		System.out.println("Can't divide from zero");// TODO: handle exception
	    System.exit(0);
	}
	finally {
		System.out.println("We are final");
	}
	}
	}
