import java.util.Scanner;

public class PalindromeExample {
	public static void main(String[] args) {
		// Direct logic in main method using scanner Class;
		/*Scanner sc = new Scanner(System.in);
		System.out.println("please enter input string");
		String input = sc.nextLine();
		System.out.println("length of the input string is=" + input.length());
		String output = "";
		for (int k = input.length() - 1; k >= 0; k--) {
			output = output + input.charAt(k);
		}
		
		System.out.println("output=" + output);
		if (input.equals(output)) {
			System.out.println("Given string is a Palindrome");
		} else {
			System.out.println("Given string is not a Palindrome");
		}*/
		
		System.out.println("===========");
		System.out.println(palindromCheckForNumbers());
	}

	public static boolean palindromeChecker(String str) {
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		String rev = builder.toString();
		if (str.equals(rev)) {
			return true;
		}
		return false;
	}

	public static boolean palindromeCheckWithLoops(String str) {
		String y = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			y = y + str.charAt(i);
		}
		System.out.println("x=" + str + "  " + "Y=" + y);
		if (str.equals(y)) {
			System.out.println("The given String is a Palindrome");
			return true;
		}
		return false;
	}
	
	public static boolean palindromCheckForNumbers(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your input number");
		int n = sc.nextInt();
		int temp,sum = 0 ,reminder = 0;
		temp = n;
		while (n>0) {
			reminder = n%10;//getting reminder
			System.out.println("reminder="+reminder);
			sum  = (sum*10)+reminder;
			n = n/10;
			System.out.println("sum="+sum);
			System.out.println("n="+n);
		}
		if(temp==sum){
			System.out.println("The given number is a Palindrome");
			return true;
		}
		return false;
		
	}

}
