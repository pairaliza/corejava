package com.paira.ifelse;

import java.util.Scanner;

public class Homework9 {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int A = scanner.nextInt();
	         int B = scanner.nextInt();
	          int C = scanner.nextInt();

	if(A==B  && A == C){
	    System.out.println("equilateral");
	}
	else if ((A==B  || A == C)){
	    System.out.println("isosceles");
	}
	else if ((B==C  || B == A)){
	    System.out.println("isosceles");
	}
	else{
	    System.out.println("scalene");
	}
	        
	    }
	}
	

