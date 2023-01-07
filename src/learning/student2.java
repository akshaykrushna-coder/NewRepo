package learning;
public class student2{
	public static void main (String args[]) {
		student s1 = new student();
		student s2 = new student();
		s1.insertRecord(100,"akshay");
		s2.insertRecord(14,"krushna");
		s1.displayInformation();
		s2.displayInformation();
		
	}

}
class student{
	int roll_no;
	String name;
	void insertRecord(int r, String n) {
		roll_no= r;
		name = n;
		
	}
	void displayInformation () {
		System.out.println(roll_no + " "+ name);
		
	}
}
