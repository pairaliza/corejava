package com.paira.whileloop1;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int i = 1;
			int mul = 1;

			while (i <= B) {
				mul *= A;
				i++;
			}
			System.out.println(mul);

	}
}
