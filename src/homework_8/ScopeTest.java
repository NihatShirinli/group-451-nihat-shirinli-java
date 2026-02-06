package homework_8;

public class ScopeTest {
	public void textScopes() {
		int x = 10;
		int y = x * 2;;
		if (x > 5) {
		    System.out.println("y = " + y);
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
