package com.paira.ifelse;

import java.util.Scanner;

public class LessionQuestions3 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		float temp = scn.nextFloat();
		
		if(temp > 98.9) {
			System.out.println("person has fever");
			
		}else if(temp<98.2);{
			System.out.println("person has low temp");
			
		} {
			System.out.println("person doesn't have fever");
		}
		
	}

}
