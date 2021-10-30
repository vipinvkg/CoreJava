package ExceptionHandling;

public class LoginException  extends Exception{
public LoginException() {
	super("User not found");
}
}
