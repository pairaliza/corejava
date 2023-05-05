package com.paira.ifelse3;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int A = scn.nextInt();
		int B = scn.nextInt();
		

        if(B == 0){
            System.out.println(0);
        }
        else if(A ==1 & B ==1){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
        
    }
		
	}


