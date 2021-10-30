package Exercise_4;

public class Reversedigits_5 {
	public static void main(String[] args) {
String s = "vipin";
char[]ch= s.toCharArray();
String rev = "";

for (int i =ch.length-1; i>=0; i--) {
	
	rev= rev+ch[i];
}
	System.out.println(rev);
	
}
}

