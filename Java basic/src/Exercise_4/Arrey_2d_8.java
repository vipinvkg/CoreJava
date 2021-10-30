package Exercise_4;

public class Arrey_2d_8 {
public static void main(String[] args) {
	int[][] tables = new int [9][10];
	int c;
	for (int i = 0; i <tables.length; i++) {
		for (int j = 2; j <=tables[i].length; j++) {
			c=(i+1)*j;
			
			System.out.print(c + "\t ");
			
		}
		System.out.println("");
	}
}
}