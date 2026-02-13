package homework_9;

import java.util.Iterator;

public class Runner {
	public static void main(String[] args) {
		//1
		int n = 5;
		if(n % 2 == 0) {
			System.out.println("Чётное");
		}else {
			System.out.println("Нечётное");
		}
		
		//2
		int i = 6;
		
		if(i <= 1) {
			System.out.println("Положительное");
		}else if(i > 0) {
			System.out.println("Отрицательное");
		}else if(i == 0) {
			System.out.println("Ноль");
		}
		
		//3
		int m = 5;
		for(int b = 1; b <= 10; b++) {
			System.out.println(m + "x" + b + " =" + (b*m));
		}
		
		//4
		int all = 0;
		for(int j = 1; j <=100; j++) {
			all +=j;
		}
		
		//6
        int[] numbers = {12, 5, 8, 21, 40, 7, 14, 3, 10, 1};
        int evenCount = 0;
        
        for (int f = 0; f < numbers.length; f++) {
            if (numbers[f] % 2 == 0) {
                evenCount++;
            }
        }
        
        //7
        int abcd = 5;
        int blabla = 6;
        System.out.println(Math.max(abcd, blabla));
        
        //11
        
        int N = 10;
        
        int sum = 0;
        
        for(int g = 2; g <= N; g +=2) {
        	sum += g;
        }
        
        //13
        
        for(int o = 10; o > 1; o--) {
        	System.out.println(o + ",");
        }
        
        //14
        
        int sumAgain = 0;
        
        for(int s = 1; s <= 50; s += 2) {
        	sumAgain +=s;
        }
        
        //17
        
        int a = 5;
        int ab = 7;
         System.out.println(Math.min(a, ab));
         
         //18
	}
}
