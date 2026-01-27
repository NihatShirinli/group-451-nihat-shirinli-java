package homework_5;

public class Employee {
	double salary;
	
	double calculateBonus() {
		return salary * 1.50;
	}
	
	class Manager extends Employee{
		@Override
		double calculateBonus() {
			return super.calculateBonus() * 20;
		}
	}
}
