package com.paira.whileloop1;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		
		int i = 1;
		while (N >= i) {
			System.out.println(N +"");
			N--;
		}
		
	}

}
