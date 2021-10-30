package Exercise_4;

public class Palindrome_12 {
public static void main(String[] args) {
	int num = 141;
	int rev= 0;
	int rem = 0;
	int r=num;
	while (num!=0){
		rem = num % 10;
		rev= rev*10 + rem;
		num = num/10;
		}
if (r==rev){
	System.out.println(r + " is Palindrome.");
}
else {
	System.out.println(r + " is not Palindrome");
}
}
}
