package Exersice;

public class Jjjjjj {
int a = 10;
static int b = 20;

public static void main(String[] args) 
{
	Jjjjjj ob1 = new Jjjjjj ();
	System.out.println(ob1.a);
	System.out.println(Jjjjjj.b);
	ob1.a=1000;
	Jjjjjj.b=2000;
	
	System.out.println(ob1.a);
	System.out.println(Jjjjjj.b);
	Jjjjjj ob2 = new Jjjjjj ();
	System.out.println(ob2.a);
	System.out.println(Jjjjjj.b);
}

}
