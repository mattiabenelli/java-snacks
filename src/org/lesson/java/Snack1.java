package org.lesson.java;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner (System.in);
		System.out.println("Inserisci un numero: ");
		int number = in.nextInt();
		
		if(number %2 == 0) {
			System.out.println(number);
		}
		else {
			number++;
			System.out.println(number);
		}
		
		in.close();
	}
}
