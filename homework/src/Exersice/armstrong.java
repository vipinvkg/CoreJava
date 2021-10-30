package Exersice;

public class armstrong {
public static void main(String[] args) {
	int num = 153;
	int b =0;
	int c =0;
	int r;
	b=num;
	
	while (b!=0){
		r=b%10;
		c= c+(r*r*r);
		b=b/10;
			}
if (c==num){
	System.out.println(c);
	System.out.println("given no. is Armstrong");
}
else{
System.out.println("given no. is not armstrong");
}
}
}