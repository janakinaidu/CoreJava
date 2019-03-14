package com.naidu.error;

public class OutOfMemoryErrorExample {

	public static void main(String[] args) {
		for (int i = 1; i > 0; i++) {
			System.out.println("object created");
			new Object();
		}

	}

}
