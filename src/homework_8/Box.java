package homework_8;

public class Box {
	int value;
	
	public void changeValue(Box boxe) {
		boxe.value = 10;
	}
	
	public static void main(String[] args) {
		Box box = new Box();
		box.value = 100;
		
		box.changeValue(box);
		
		System.out.println(box.value);
	}
}
