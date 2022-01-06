import java.util.ArrayList;

public class For_each2 {

	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<>();
		myArray.add(35);
		myArray.add(12);
		myArray.add(50);

		for (int i : myArray) {
			System.out.println(i);

		}
		for (int i=0; i<myArray.size();i++) {
			System.out.println(myArray.get(i));
		}
	}

}
