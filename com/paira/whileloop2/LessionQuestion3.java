package com.paira.whileloop2;

import java.util.Scanner;

public class LessionQuestion3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		while(n > 0) {
			int d = n % 10;
			System.out.println(d);
			n = n/10;
		}
	}

}
