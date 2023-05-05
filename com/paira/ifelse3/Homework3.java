package com.paira.ifelse3;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		
		 Scanner sca = new Scanner(System.in);
	        int A = sca.nextInt();
			int B = sca.nextInt();
			int C = sca.nextInt();
			
			if(A > B && A > C) {
				System.out.println(A+" is largest number");
			}
			else if(B > A && B > C) {
				System.out.println(B+" is largest number");
			}
			else {
				System.out.println(C+" is largest number");
			}
	    }
	}

	
	


