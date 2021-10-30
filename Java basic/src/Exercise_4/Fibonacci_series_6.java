package Exercise_4;

public class Fibonacci_series_6 {
public static void main(String[] args) {
	int n = 100, a = 0, b = 1;
   while (a <= n){

System.out.print(a + ",");

int c = a + b;
 a = b;
 b = c;

   }
}
}
