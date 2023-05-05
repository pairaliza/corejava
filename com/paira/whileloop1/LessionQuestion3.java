package com.paira.whileloop1;

import java.util.Scanner;

public class LessionQuestion3 {
public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		
		int i = 0;
		
		while(i <= N) {
			System.out.println(i);
			i = i + 4;
		}
}
}
