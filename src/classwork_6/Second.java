package classwork_6;

public class Second {
	public static void main(String[] args) {
		int n = 5;
		if(90 <= n && n <= 100) {
			System.out.println("отлично");
		}else if(75 <= n && n <= 89) {
			System.out.println("хорошо");
		}else if(60 <= n && n <= 74) {
			System.out.println("удовлетворительно");
		}else if(n < 60) {
			System.out.println("неудовлетворительно");
		}else if(100 < n && 0 > n) {
			System.out.println("Некорректный балл");
		}
	}
}
