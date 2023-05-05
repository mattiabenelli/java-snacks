package org.lesson.java;

import java.util.Scanner;

public class Snack4 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Inserisci una parola per controllare se è palindroma: ");
		String word = in.nextLine();
		
		char[] caratteri = new char[word.length()];
		
		 for (int i = 0; i < word.length(); i++) {
	            caratteri[i] = word.charAt(i);
	            
	        }
		 for(int i = 0; i < caratteri.length; i++) {
			 if(caratteri[i] != caratteri[caratteri.length - i - 1]) {
	            	
	            	System.out.println("non è una parola palindroma");
					return;
	            }
		 }
		 System.out.println("è una parola palindroma");
		
		in.close();
	}
}
