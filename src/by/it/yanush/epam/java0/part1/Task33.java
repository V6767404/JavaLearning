package by.it.yanush.epam.java0.part1;

/*3. Найти сумму квадратов первых ста чисел.*/

public class Task33 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;

        while (n <= 100) {
            sum = sum + (n * n);
            n++;

        }
        System.out.println(sum);

  /*    n=100;
        System.out.println( n * (n + 1) * (2 * n + 1) / 6); // 338350 для n=100*/
    }
}

