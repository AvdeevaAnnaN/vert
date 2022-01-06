
public class massive_add {

	public static void main(String[] args) {

		
		String[] deliveryCities = { "Chicago", "New York", "Toronto", "Paris" };
		String[] deliveryCities2 = new String[deliveryCities.length + 1];
		for (int i = 0; i < deliveryCities.length; i++) {
			deliveryCities2[i] = deliveryCities[i];
		}
		deliveryCities2[deliveryCities.length] = "London";
		for(String i: deliveryCities2) {
			System.out.println(i);
		}
		
		
		

		
	}

}
