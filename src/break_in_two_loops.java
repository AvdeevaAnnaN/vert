
public class break_in_two_loops {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("��� ������ ����! � ���������� " + i + "���");
			for (int a = 1; a <= 10; a++) {
				System.out.println("	��� ������ ����! � ���������� " + i + "���");
				if (a == 2)
					break;
			}
		}
	}

}
