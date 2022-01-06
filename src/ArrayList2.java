import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> deliveryCities3 = new ArrayList<>();

		deliveryCities3.add("Chicago");
		deliveryCities3.add("New York");
		deliveryCities3.add("Toronto");
		deliveryCities3.add("Paris");

		System.out.println(deliveryCities3.size());
		deliveryCities3.add(1, "California");
		deliveryCities3.get(2);
		System.out.println(deliveryCities3.get(2));
		System.out.println(deliveryCities3.indexOf("Toronto"));
		System.out.println(deliveryCities3.contains("Paris"));
		System.out.println();

		for (String i : deliveryCities3) {
			System.out.println(i);

		}
		System.out.println();

		deliveryCities3.set(2, "Berlin");
		System.out.println(deliveryCities3.get(2));
		System.out.println();

		for (int i = 0; i < deliveryCities3.size(); i++) {
			System.out.println(deliveryCities3.get(i));
		}
		System.out.println();

		deliveryCities3.remove(3); // remove("Toronto");
		for (String i : deliveryCities3) {
			
			System.out.println(i);
		}

		deliveryCities3.clear();

		System.out.println(deliveryCities3);

	}

}
