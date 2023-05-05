package com.paira.ifelse;

import java.util.Scanner;

public class LessionQuestions6 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int x = scn.nextInt();
		
		if (x % 3 == 0) {
			System.out.println("fizz");
		}else if (x % 5 == 0);{
		    System.out.println("buzz");
	    }if (x % 3 == 0 && x % 5 == 0) {
	    	System.out.println("fizz-buzz");
	    }
	

}
}
