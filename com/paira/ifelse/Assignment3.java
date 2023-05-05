package com.paira.ifelse;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		int E = scanner.nextInt();

		int percentage = (A + B + C + D + E) / 5;
		System.out.println(percentage);

		if (percentage >= 90) {
			System.out.println("A");
		}
		else if(percentage >= 80 && percentage < 90) {
			System.out.println("B");
		}
		else if(percentage >= 70 && percentage < 80) {
			System.out.println("C");
		}
		else if(percentage >= 60 && percentage < 70) {
			System.out.println("D");
		}
		else if(percentage >= 40 && percentage < 60) {
			System.out.println("E");
		}
		else if (percentage < 40) {
			System.out.println("F");
	
		}


	}
}

