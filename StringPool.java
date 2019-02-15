package strings;

public class StringPool {
	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println("============");

		String str = "hai" + "jan";
		String str2 = "haijan";
		System.out.println(str == str2);
		System.out.println(str.equals(str2));// occurrence at compile time;
		String a1 = "hai";
		String a2 = "jan";
		String a3 = a1 + a2;// since it occurs at run time;
		System.out.println("============");
		System.out.println(str == a3);// false
		System.out.println("============");
		String a4 = a1.concat(a2);// concatenation always gives new object
		System.out.println(a3 == a4);// false
		System.out.println(a3.equals(a4));
	}
}
