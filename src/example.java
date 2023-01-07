
public class example {
static int a = m1(5);
 static int m1(int a){
	System.out.println("variable a is created"+a);
	return 20;
}

static int m2() {
	System.out.println("variable b is created");
	return 10;
	
}
	public static void main(String args[]) {
		int a=4;
		System.out.println("main");
		System.out.println("a :"+ example.a);
		System.out.println("b :"+ b);
	}
	static int b = m2();

	static {
		
	}	
}

	


