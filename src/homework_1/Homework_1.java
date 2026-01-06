package homework_1;

public class Homework_1 {
	public static void main(String[] args) {
		
		//1
		int count = 10;
		System.out.println(count++);
		System.out.println(++count);
		System.out.println(count--);
		System.out.println(--count);
		
		//2
		int num = 9;
		System.out.println(num > 0? "Положительное" : "Отрицательное или Ноль");
		
		//3
		int n = 12;
		if(n==1||n==12||n==2) {
			System.out.println("Зима");
		}
		if(n==3||n==4||n==5) {
			System.out.println("Весна");
		}
		if(n==6||n==7||n==8) {
			System.out.println("Лето");
		}
		if(n==9||n==10||n==11) {
			System.out.println("Осень");
		}
		int a = 123;
		int b = 122;
		
		//4
		if(a > 0 && b != 0 && a / b > 5) {
			System.out.println("Условие выполнено");
			
		}else {
			System.out.println("Условие не выполнено");
		}
		
		//5 
		
		for(int i = 1;i==50;i++) {
			System.out.println(i);
		}
		
		//6
		
		for(int m = 1;m==50;m++) {
			if(m%3==0) {
				continue;
			}
			System.out.println(m); 
		}
		  }   
}