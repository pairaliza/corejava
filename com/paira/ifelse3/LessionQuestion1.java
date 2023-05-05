package com.paira.ifelse3;

import java.util.Scanner;

public class LessionQuestion1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		
		if(A <= 50) {
			System.out.println(A*1);
			
		}
		else if(A >50 && A<= 150) {
			System.out.println(50*1 + (A-50) * 2);
		}
		else if(A >150 && A<= 250) {
			System.out.println(50*1 + 100*2 + (A-150) * 3);
		}
		else  {
			System.out.println(50*1 + 100*2 + 100*3 +(A-250) * 5);
		}
		
		
	}

}
