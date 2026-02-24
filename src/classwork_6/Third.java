package classwork_6;

public class Third {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 7;
		if(a + b > c && a + c > b && b + a > c && b + c > a && c + a > b && c + b > a) {
			System.out.println("Треугольник существует");
		}else {
			System.out.println("Треугольник не существует");
		}
	}
}
