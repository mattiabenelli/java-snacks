package org.lesson.java;

import java.util.Scanner;

public class Snack11 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Inserisci un numero e scopri i suoi divisori: ");
		int number = in.nextInt();
		
		for(int i= 1; i <= number; i++) {
			if(number%i == 0) {
				System.out.println(number + " è divisibile per: " + i);
			}
		}
		in.close();
	}
}
