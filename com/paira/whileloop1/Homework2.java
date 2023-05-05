package com.paira.whileloop1;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
			int N = scanner.nextInt();
			int sum = 0;
			int i = 2;

			while (i <= N) {

				sum += i;
				i += 2;

			}
			System.out.println(sum);
		}
	
	}


