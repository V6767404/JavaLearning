package by.it.yanush.belh2017.hw.part2;
//Создайте массив из всех чётных чисел от 2 до 20 и выведите
//элементы массива на экран сначала в строку, отделяя один элемент от
//другого пробелом, а затем в столбик (отделяя один элемент от другого
//началом новой строки). Перед созданием массива подумайте, какого он будет
//размера. 

public class Page61Ex1 {

	public static void main(String[] args) {

		// создание массива из четных чисел от 2 до 20
		
		int[] mas = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

		/*int[] mas = new int[10]; 
		int m = 2;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = m; //
			m = m + 2;
		}*/

		// вывод всех значений массива в строку и столбец
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}

	}
}
