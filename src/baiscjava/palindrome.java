package baiscjava;

public class palindrome {

	public static void main(String[] args) {

		String s = "madam";
		String st = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			st = st + s.charAt(i);
		}
		if (s.equals(st))
			System.out.println(true);
		else
			System.out.println(false);

	}
}
