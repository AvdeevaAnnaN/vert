
public class Break_if {
	public static void main(String[] args) {
		int i;
		int a;

		i = 1;
		a = 3;
		while (i <= 5) {
			System.out.println("���� ����������� " + i + " ���");
			if (i == a)
				break;
			i++;
		}
	}

}
