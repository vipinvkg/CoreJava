package Exercise_4;

public class Harmonic_Series13 {
public static void main(String[] args) {
	int num = 5;
	double res = 0.0;
	System.out.println("The Harmonic Series is: ");
	
	while (num>0){
		res= res+ (double)1 / num;
		
		num--;
		
		System.out.print(res + ",");
		
	}
}
}
