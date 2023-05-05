package com.paira.ifelse3;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		
		if(N >= 500000 && N < 1000000) {
			System.out.println("gold");
		}else if(N >= 1000000 && N < 10000000) {
			System.out.println("platinum");
		}else if(N >= 10000000) {
			System.out.println("diamond");
		}
		else {
			System.out.println("None");
		}
		
	} 
}
	