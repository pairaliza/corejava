package com.paira.ifelse;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int angleSum = A + B + C;
		
		if (angleSum == 180) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
	}

}
