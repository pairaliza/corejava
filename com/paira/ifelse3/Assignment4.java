package com.paira.ifelse3;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		

		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		
		if (x < y && x < z){
             System.out.println("a");

			}

			else if ( y < x && y < z){

			   System.out.println("b");

			}

			else{

			   System.out.println("c");

			}
	}

}
