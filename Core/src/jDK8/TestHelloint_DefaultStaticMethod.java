package jDK8;

public class TestHelloint_DefaultStaticMethod {

	public static void main(String[] args) {
		
		Helloint_DefaultStaticMethod h = (a,b)->{
			return a+b;
		};
	int c = h.add(10, 20);
	System.out.println(c);
	h.defmethod();
	Helloint_DefaultStaticMethod.staticmethod();
	}
}
