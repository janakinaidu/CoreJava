package strings;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "123456";
		String str = "";

		// procedure-1;
		/*
		 * StringBuffer buffer = new StringBuffer(s1);
		 * System.out.println(buffer.reverse().toString());
		 */

		// procedure-2:
		for (int i = s1.length() - 1; i >= 0; i--) {
			str = str + s1.charAt(i);
		}
		System.out.println("reverse of a string is:" + str);
	}

}
