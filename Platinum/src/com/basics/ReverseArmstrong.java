package com.basics;

public class ReverseArmstrong {

	public static void main(String[] args) {

		int num = 498;
		int sum = 0;
		int r;
		int n = num;

		while (n > 0) {
			r = n % 10;
			sum = r + (sum * 10);
			n = n / 10;
		}

		System.out.println(sum);
	}

}
