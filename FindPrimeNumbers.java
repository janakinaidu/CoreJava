package com.naidu.conversions;

import java.util.Scanner;

public class FindPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter inital range value in integer format:");
		int start = sc.nextInt();
		System.out.println("Enter final range value in integer format:");
		int end = sc.nextInt();
		sc.close();
		FindPrimeNumbers p = new FindPrimeNumbers();
		p.getPrimeNumbers(start, end);
	}

	private void getPrimeNumbers(int start, int end) {
		String primnumbers = "";
		if (start == 0 || start == 1 || start == 2) {
			start = 2;
		}
		int count = 0;
		for (int i = 1; i <= end; i++) {
			count = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				primnumbers = primnumbers + i + " ";

			}
		}
		System.out.print("prime numbers between the range of " + start
				+ " and " + end + " is:\n" + primnumbers);

	}
}
