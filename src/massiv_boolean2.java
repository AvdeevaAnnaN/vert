
public class massiv_boolean2 {

	public static void main(String[] args) {
		boolean[] b1 = new boolean[40];
		for (int i = 0; i < b1.length; i = i + 2) {
			b1[i] = true;

		}
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
	}

}
