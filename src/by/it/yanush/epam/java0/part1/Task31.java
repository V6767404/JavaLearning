package by.it.yanush.epam.java0.part1;

/*1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
        все числа от 1 до введенного пользователем числа.*/

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        int x;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Веедите любое целое положительное число:");
        x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            sum = sum + i;
        }
        System.out.println("сумма всех чисел от 1 до " + x + " :");
        System.out.println(sum);
    }

}

