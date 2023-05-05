package com.paira.whileloop1;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		
		int i = 1;
		while (i <= N) {
			System.out.println(i +"");
			i++;
		}
	}

}
