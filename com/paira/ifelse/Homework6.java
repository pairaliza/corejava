package com.paira.ifelse;

import java.util.Scanner;

public class Homework6 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		int type = scn.nextInt();
		int x = scn.nextInt();
		
		if(x > N) {
			System.out.println( "Insufficient Funds");
		}
		else if (type == 1) {
			System.out.println(x + N);
		}
		else if (type == 2) {
			System.out.println(N - x);
		}
		
	}
	

}
