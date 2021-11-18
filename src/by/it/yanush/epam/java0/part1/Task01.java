package by.it.yanush.epam.java0.part1;

/*Вычислить значения функции на отрезке [а,b] c шагом h:*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите границы отрезка и значение шага h");
        double a, b, h, result;
        a = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();

        while (a <= b) {
            if (a > 2) {
                result = a;
            } else {
                result = -a;
            }

            System.out.printf("%3f = %3f\n", a, result);
            a += h;
        }
    }
}

