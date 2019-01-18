package com.naidu.conversions;

import java.util.Scanner;

public class LanguageTransfer implements DataTransfer {

	@Override
	public String toDefaultLanguage(String input) {
		String output = "";
		char c[] = input.toCharArray();
		for(int i = 0;i<c.length;i++){
			int k = (int)c[i];
			k = k-3;
			char ch = (char)k;
			output = output+ch;
		}
		
		return output;
	}

	@Override
	public String toSpecialLanguage(String input) {
		String output = "";
		char c[] = input.toCharArray();
		for(int i = 0;i<c.length;i++){
			int k = (int)c[i];
			k = k+3;
			char ch = (char)k;
			output = output+ch;
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter inout string");
		String input = sc.nextLine();
		LanguageTransfer lt = new LanguageTransfer();
		System.out.println(lt.toDefaultLanguage(input));
		System.out.println(lt.toSpecialLanguage(input));
	}

}
