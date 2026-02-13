package classwork_5;

public class Student {
	String name = "Nihat";
	int age = 12;
	int graded = 7;
	
	static int student1Overall = 50;
	static int student2Overall = 1;
	
	public static void main(String[] args) {
		System.out.println(Math.max(student1Overall, student2Overall));
	}
}
