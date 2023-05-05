package com.paira.whileloop1;

import java.util.Scanner;

public class Homework7 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		int i = 0;

		while(i < 4){

		if(i % 2 == 0){

		System.out.println("YES ");

		}else{

		System.out.println("NO ");

		}

		i += 2;

		}
	}

}
