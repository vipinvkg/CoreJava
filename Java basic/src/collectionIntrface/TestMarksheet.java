package collectionIntrface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {

	public static void main(String[] args) {
		Marksheet a = new Marksheet();
		a.setRollNo("111");
		a.setFname("Megha");
		a.setLname("Singh");
		a.setPhy(70);
		a.setChe(75);
		a.setMat(80);
		Marksheet b = new Marksheet();
		b.setRollNo("113");
		b.setFname("Vipin");
		b.setLname("Gupta");
		b.setPhy(89);
		b.setChe(90);
		b.setMat(95);

		Marksheet c = new Marksheet();
		c.setRollNo("112");
		c.setFname("Rakesh");
		c.setLname("Kumar");
		c.setPhy(66);
		c.setChe(64);
		c.setMat(76);

		Marksheet d = new Marksheet();
		d.setRollNo("115");
		d.setFname("Rakesh");
		d.setLname("Dubey");
		d.setPhy(88);
		d.setChe(61);
		d.setMat(89);

		Marksheet e = new Marksheet();
		e.setRollNo("114");
		e.setFname("Kavita");
		e.setLname("pathak");
		e.setPhy(65);
		e.setChe(77);
		e.setMat(88);

		ArrayList<Marksheet> f= new ArrayList<Marksheet>();
		f.add(a);
		f.add(b);
		f.add(c);
		f.add(d);
		f.add(e);
	TestComparator_Fname fn = new TestComparator_Fname();
	//TestComprator_Lname ln = new TestComprator_Lname();
	TestComprator_Phy ph = new TestComprator_Phy();
	Collections.sort(f,ph);
		
Iterator<Marksheet> it = f.iterator();
while (it.hasNext()) {
	Marksheet o = (Marksheet) it.next();
	System.out.println(o.getRollNo()+" "+ o.getFname()+" "+ o.getLname()+" "+o.getPhy()+" "+o.getChe()+" "+o.getMat());
}
			}
	
		
	
}
