package interfaces;

public class Businessman implements Richman,SocialWorker{

	private String name;
	private String address;
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public Businessman() {
		// TODO Auto-generated constructor stub
	}
	public Businessman(String fn, String add) {
		name = fn;
		address = add;
	}
	@Override
	public void earnmoney() {
		System.out.println("Earn Money");
		
	}

	@Override
	public void donation() {
		System.out.println("Donate");
		
	}

	@Override
	public void party() {
		System.out.println("Party");
		
	}

	@Override
	public void helpToOthers() {
		System.out.println("Help");
		
	}

	public static void main(String[] args) {
		Businessman rm = new Businessman("Vipin", "indore");
		rm.donation();
		rm.earnmoney();
		rm.party();
		rm.helpToOthers();
		System.out.println(rm.getAddress());
		System.out.println(rm.getName());
		
	}
}
