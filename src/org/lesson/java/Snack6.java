package org.lesson.java;

import java.util.Random;
import java.util.Scanner;

public class Snack6 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Inserisci il numero limite della somma di numeri estratti casualmente: ");
		int input = in.nextInt();
		int sum = 0;
		int number = 0;
		
		Random r = new Random();
		
		while(input > sum) {
			number = r.nextInt(0, 100);
			sum = sum + number;
			System.out.println("Il numero estratto è: " + number);
			System.out.println("La somma attualmente è: " + sum);
		}
		
		System.out.println(sum);
		
		in.close();
	}
}
