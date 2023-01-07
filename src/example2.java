
public class example2 {
	static int c;
	static void v1(int c) {
	 example2.c= c;
	 System.out.println(c);
	 
	}

	public static void main(String[] args) {
		System.out.println(c);
		v1(50);
		System.out.println(c);
		
		// TODO Auto-generated method stub

	}

}
