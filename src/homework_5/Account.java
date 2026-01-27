package homework_5;

public class Account {
	private String owner;
	private double balance;
	
	public Account(String owner, double balance) {
		this.owner = owner;
		if(balance >= 0) {
			this.balance = balance;
		}else {
			this.balance = balance;
			System.out.println("Зачем ты создал аккаунт если у тебя даже денег нету зря наше время тратишь");
		}
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance +=amount;
		}else {
			System.out.println("Я же тебе говорил что у тебя денег нету");
		}
	}
	
	public void withdraw(double amount) {
		if(amount < 0) {
			System.out.println("Ты хочешь воздух снять?");
		}else if(amount > balance) {
			System.out.println("У тебя и работы нет оказывается");
		}else {
			balance -= amount;
			System.out.println("Наконец-то нормальный человек");
		}
	}
}
