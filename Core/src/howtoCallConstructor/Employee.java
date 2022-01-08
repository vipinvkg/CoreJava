package howtoCallConstructor;

public class Employee extends Person_this {
private String designation;
	public Employee() {
	System.out.println("Default const of employee");
	}
	public Employee(String des, String fn, String ln,String add) {
		super(fn, ln, add);
		designation = des;
		System.out.println(fname + lname + designation + address);
		}
}
