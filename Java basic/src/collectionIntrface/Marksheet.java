package collectionIntrface;

public class Marksheet implements Comparable<Marksheet> {

	private String rollNo;
	private String Fname;
	private String Lname;
	private int phy;
	private int che;
	private int mat;
	
	public Marksheet(){
		
	}
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChe() {
		return che;
	}
	public void setChe(int che) {
		this.che = che;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}

	@Override
	public int compareTo(Marksheet m) {
		
		return rollNo.compareTo(m.rollNo);
	}
	
	
	
	
	
	
}
