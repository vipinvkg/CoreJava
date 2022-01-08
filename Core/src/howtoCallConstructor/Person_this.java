package howtoCallConstructor;

public class Person_this {

	protected String fname;
	protected String lname;
	protected String address;
	
	public Person_this() {
	System.out.println("Default Constroctor");
	}
	public Person_this(String fn, String ln) {
		fname = fn;
		lname = ln;
		//System.out.println("2 parameterized Constructor " + fname + " "+ lname);
		}
	public Person_this(String fn, String ln,String add) {
		this(fn, ln);
		address = add;
		//System.out.println("3 Parameterized Constructor " + fname + " "+ lname+ " "+ address );
		}
}
