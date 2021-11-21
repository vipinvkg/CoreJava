package Exercise_4;

public class Armstrong_10 {

	public static void main(String[] args) {
		int num = 153;
		int c = 0;
		int r;
		int s = 0;
		c= num;
	
		while (c!=0){
			
			r = c %10;
			s= s+ (r*r*r);
			c= c/10;
		}
	if (s==num){
		System.out.println("given no. is Armstrong " + s);
	}
	else{
		System.out.println("Given no. is not Armstrong");
	}
	}
	
}
