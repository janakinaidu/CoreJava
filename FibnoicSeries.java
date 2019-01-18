package com.naidu.conversions;

public class FibnoicSeries {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int k = 1;
		for (int x = 0; x < 10; x++) {
			i = j;
			j=k;
			k = i+j;
			System.out.print(i+" ");
		}
	}
}
//output:
//	0,1,1,2,3,5,8....