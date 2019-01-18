package com.naidu.conversions;

import java.util.Scanner;

public class CheckPrimeNumberOrNot {

	public static void main(String[] args) {
		System.out.println("please enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		checkPrimeNumber(number);

	}

	private static void checkPrimeNumber(int number) {
		int count = 0;
		if (number == 0 || number == 1) {
			System.out.println(number + " is not a prime number ");
		} else {
			for (int i = 2; i < number / 2; i++) {
				if (number % i == 0) {
					count = 1;
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println(number + " is a prime Number");
		} else {
			System.out.println(number + " is not a prime Number");
		}
	}

}
