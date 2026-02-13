package classwork_5;

public class Car {
	String brand = "BMW";
	int speed = 280;
	static int fuel = 50;
	
	public void drive() {
		fuel--;
	}
	
	public void refuel() {
		fuel++;
	}
	
	public void showInfo() {
		System.out.println("Brand: " + brand + "Speed: " + speed + "Fuel: " + fuel);
	}
	
	public static void main(String[] args) {
		if(fuel == 0) {
			System.out.println("You can't drive car anymore");
		}
	}
}
