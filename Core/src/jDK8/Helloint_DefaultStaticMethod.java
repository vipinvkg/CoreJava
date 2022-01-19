package jDK8;
@FunctionalInterface
public interface Helloint_DefaultStaticMethod {

	public int add(int a,int b);
	
	public default void defmethod() {
		System.out.println("Test default");
	}
	public static void staticmethod() {
		System.out.println("Test Static");
	}
}
