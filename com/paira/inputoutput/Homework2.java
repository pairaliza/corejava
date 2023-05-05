package com.paira.inputoutput;

import java.util.Scanner;

public class Homework2 {
	 public static void main(String[] args) {
	       
	      Scanner scn = new Scanner(System.in);
	        float A = scn.nextInt();
	        float  B = scn.nextInt();
	        float C = scn.nextInt();
	        float D = scn.nextInt();
	        float E = scn.nextInt();
	        float F = A + B + C +D +E;
	        float result = F/5;
	        

	        System.out.printf("%.2f",result);

	    }

}
