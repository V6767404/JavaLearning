package by.it.yanush.belh2017.lessons.les08_1;

public class Main {
	// ������ �� ���� ������ � ����� ������
	// static {} ����������� ����
	// this. ��������� �� ������ ������� ������ ����� !!
	// ���������� - ������. ������ ������ ��������� �������� ���-�� ���-��� � ������
	// ����� ��� � ������ ��-��� ����������
	//
	// ������������
	// ����������� � ���������
	// ���� ����� ����������� ������ �� ������ ������

	public static void main(String[] args) {

		/*Cars car = new Cars();
		car.show();*/

		Citroen citr = new Citroen (45, "hello", "white");
		citr.show(); //?? white �� ��������

		C4 c = new C4 (5,"qq","qqq",123);
		c.show();

	}
}
