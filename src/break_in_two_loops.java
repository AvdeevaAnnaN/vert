
public class break_in_two_loops {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("Ёто первый цикл! я выполн€юсь " + i + "раз");
			for (int a = 1; a <= 10; a++) {
				System.out.println("	Ёто второй цикл! я выполн€юсь " + i + "раз");
				if (a == 2)
					break;
			}
		}
	}

}
