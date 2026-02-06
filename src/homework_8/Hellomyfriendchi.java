package homework_8;

public class Hellomyfriendchi {
	public double sumNumbers(Integer a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Hellomyfriendchi hello = new Hellomyfriendchi();
		
		System.out.println(hello.sumNumbers(6, 5.2));
		System.out.println(hello.sumNumbers(10, 7.1));
	}
}
