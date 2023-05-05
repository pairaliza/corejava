package com.paira.whileloop1;

import java.util.Scanner;

public class LessionQuestion2 {
public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		int num = 0;
		while(num <= N) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
			num ++;
				
			}
		}


}
