package by.it.yanush.belh2017.lessons.les03;

import java.util.Scanner;

// Scanner 

public class Les3Ex2 {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение");
		if (sc.hasNextInt()) {
			a = sc.nextInt(); 	// NextDouble при вводе double с консоли нужно вводить с запятой а не с точкой
		} 						//  NextLine- строка считывается
		System.out.println("введеное значение = " + a);
	}

}

