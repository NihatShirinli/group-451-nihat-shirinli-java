package classwork_2;

import java.util.Arrays;

public class Classwork_2 {
public static void main(String[] args) {
//	### 1. Заполни и покажи
//	Создай массив из 5 чисел.  
//	Заполни его числами 10, 20, 30, 40, 50.  
//	Выведи все числа через пробел.
//
//	Пример вывода:
//
//	10 20 30 40 50
	int[] arry = new int[5];
	arry[0] = 10;
	arry[1] = 20;
	arry[2] = 30;
	arry[3] = 40;
	arry[4] = 50;
	System.out.println(Arrays.toString(arry));
	
//	### 2. Только чётные
//	Создай массив из 8 любых чисел (можно просто написать их вручную).  
//	Выведи только те числа, которые чётные.
//
//	Пример:
//	java
//	int[] numbers = {3, 8, 15, 22, 7, 10, 4, 9};
//
//
//	Возможный вывод:
//
//	8 22 10 4
	int[] numbers = {3, 8, 15, 22, 7, 10, 4, 9};
	for(int i = 0;i<numbers.length;i++) {
		if(numbers[i]%2==0) {
			System.out.println(numbers[i]);
		}else {
			System.out.println("Не делится на 2 без остаткааааааа");
		}
	}
//	### 3. Сумма первых трёх
//	Создай массив из 6 чисел.  
//	Посчитай сумму только первых трёх элементов и выведи её.
//
//	Пример:
//	java
//	Массив: 5 12 8 3 9 1
//	Сумма первых трёх: 25
	int[] firstArray = {5, 12, 8, 3, 9, 1};
	int[] coppiedPerriod = Arrays.copyOfRange(firstArray, 0, 3);
	int summa = 0;
	for(int n = 0;n<coppiedPerriod.length;n++) {
		summa+=coppiedPerriod[n];
	}
	System.out.println(summa);
}
}
