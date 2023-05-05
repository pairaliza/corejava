package com.paira.ifelse;

import java.util.Scanner;

public class LessionQuestions4 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int x = scn.nextInt();
		
		if (x % 4 == 0) {
			System.out.println(x + "is divisible by 4");
		}else {
			System.out.println(x + "is not divisible by 4");
		}
	}

}
