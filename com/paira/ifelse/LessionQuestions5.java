package com.paira.ifelse;

import java.util.Scanner;

public class LessionQuestions5 {
   public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int x = scn.nextInt();
		
		if (x % 2 == 0) {
			System.out.println(x + "is even");
		}else {
			System.out.println(x + "is odd");
		}

}
}
