package homework_5;

public class Temperature {
	double celsius;
	
	public Temperature(double celsius) {
		this.celsius = celsius;
	}
	
	double toFahrenheit() {
		return celsius * 9 / 5 + 32;
	}
	
	Temperature fromFahrenheit(double f) {
		double c = (f - 32) * 5 / 9;
		return new Temperature(c);
	}
}