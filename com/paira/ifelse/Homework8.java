package com.paira.ifelse;

import java.util.Scanner;

public class Homework8 {
	 public static void main(String[] args) {
	       
	Scanner scanner = new Scanner(System.in);
			int costPrice = scanner.nextInt();
			int sellPrice = scanner.nextInt();
			if(sellPrice > costPrice) {
				System.out.println(1);
				System.out.println(sellPrice-costPrice);
			}
			else {
				System.out.println(-1);
				System.out.println(costPrice-sellPrice);
			}


	        
	    }

}
