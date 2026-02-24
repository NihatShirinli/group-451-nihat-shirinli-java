package classwork_6;

public class Nine {
	public static void main(String[] args) {
		int i = 0;
		
		if(1 <= i && i <= 2) {
			System.out.println("младенец");
		}else if(3 <= i && i<= 6) {
			System.out.println("дошкольник");
		}else if(7 <= i && i <= 10) {
			System.out.println("младший школьник");
		}else if(11 <= i && i <= 14) {
			System.out.println("подросток младший");
		}else if(15 <= i && i <= 17) {
			System.err.println("подросток старший");
		}else if(18 <= i && i <= 64) {
			System.out.println("взрослый");
		}else if(i > 65) {
			System.out.println("пожилой человек");
		}else if(i < 0) {
			System.out.println("Возраст не может быть отрицательным");
		}
	}
}
