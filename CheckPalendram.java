package com.naidu.conversions;

import java.text.ParseException;

public class CheckPalendram {

	public static void main(String[] args) throws ParseException {
		String input = "radar";
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		if (input.endsWith(rev)) {
			System.out.println("input is a palandram");
		} else {
			System.out.println("not a palandram");
		}
	}

}
