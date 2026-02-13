package classwork_5;

public class BankAccount {
	String owner = "MrBeast";
	static int balance = 1000000000;
	static double amount;
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	public static void main(String[] args) {
		if(amount > balance) {
			System.out.println("Нельзя снять больше чем есть на балансе");
		}
	}
}