package com.paira.ifelse3;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		
		 Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();  
	        int opr = scn.nextInt(); 
	        int amt = scn.nextInt(); 
	        
	        if(opr == 1) {
	           //credit
	            n = n + amt;
	            System.out.println(n);
	        }
	        else {
	            //debit
	            if(amt > n) {
	                System.out.println("Insufficient Funds");
	            }
	            else {
	                n = n - amt;
	                System.out.println(n);
	            }
	        }}
	        
	}


