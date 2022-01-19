package jDK8;

public class TestHelloint_Lambda {

	public static void main(String[] args) {
		
		Helloint_FuctionalInterface h = (a,b) -> {
			System.out.println(a+b);
		};h.say(10,20);
	}
}
