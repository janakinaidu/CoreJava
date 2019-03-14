package com.naidu.error;

public class StackOverflowErrorExample {
	
	private static void addItSelf(int i){
		addItSelf(i+1);////calling itself with no terminating condition
	}
	public static void main(String[] args) {
		addItSelf(10);
	}
}
