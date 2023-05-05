package com.paira.ifelse;

import java.util.Scanner;

public class LessionQuestions2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		if(x<y) {
	      System.out.println (x + "is smaller than" + y);
		}else if (y<x) {
			 System.out.println (y + "is smaller than" + x);
		}else {
			 System.out.println ("Both are equel");
		}
	}

}
