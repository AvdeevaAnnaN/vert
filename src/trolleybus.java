import java.util.Scanner;

public class trolleybus {

	public static void main(String[] args) {
		String answer;
		boolean exit;
		System.out.println("��� ��� �����: �����, �������, � ����� � ��������� ����� �������?");
		Scanner inputAnswer = new Scanner(System.in);

		exit = false;
		for (int i = 0; i <= 3; i++) {
			if (exit == true)
				break;
			answer = inputAnswer.next();
			switch (answer) {
			case ("����������"):
				System.out.println("���������!");
				exit = true;
				break;
			case ("������"):
				System.out.println("���������� �����: ����������.");
				exit = true;
				break;
			default:
				System.out.println("������� ���.");

			}
		}

	}

}
