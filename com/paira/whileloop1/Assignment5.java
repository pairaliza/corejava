package com.paira.whileloop1;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
			int N = scanner.nextInt();
			int sum = 0;
			int i = 1;
			while (i <= N) {
				sum += i;
				i++;

			}
	           System.out.print(sum);
		}
	    
	
	}


