package by.it.yanush.belh2017.hw.part1;//Вывести все делители введенного числа

public class Page50Ex4 {
	public static void main(String[] args) {

		int n = 10;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			} else {
				continue;
			}
		}
	}

}