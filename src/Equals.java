
public class Equals {

	public static void main(String[] args) {
		String str1 = "Good morning";
		String str2 = "Good morning";
		String str3 = "Good evening";
		System.out.println("String '" + str1 + "' equals '" + str2 + "' " + str1.equals(str2));
		System.out.println("String '" + str1 + "' equals '" + str3 + "' " + str1.equals(str3));

		String str4 = "10";
		int str5 = 10;
		System.out.println("String '" + str4 + "' equals '" + str5 + "': " + str4.equals(str5));

	}

}
