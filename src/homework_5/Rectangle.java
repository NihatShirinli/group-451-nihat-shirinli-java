package homework_5;

public class Rectangle {
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
		double area() {
			return width * height;
		}
	
	Rectangle scale(double factor) {
		if(factor <=0) {
			System.out.println("Уважаемый человек не пишите 0 ИЛИ МЕНЬШЕ 0, А ТО БУДЕТ ПЛОХО");
			return new Rectangle(width, height);
		}
		return new Rectangle(width * factor,factor * height);
	}
}
