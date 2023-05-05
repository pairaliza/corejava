package com.paira.whileloop2;

import java.util.Scanner;

public class LessionQuestion4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int sum = 0;
		while(n > 0) {
			int d = n%10;
			sum = sum + d;
			n = n/10;
		}
		System.out.println(sum);
	}

}
