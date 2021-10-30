package ExceptionHandling;

public class Propogate {
	public static void main(String[] args) throws LoginException {
		Authenticate("sonu");
		System.out.println("Invalid");
	}

	private static void Authenticate(String login) throws LoginException {
		if(!"admin".equals(login)){
			LoginException d=new LoginException();
			throw d;
		}
		
	}
}