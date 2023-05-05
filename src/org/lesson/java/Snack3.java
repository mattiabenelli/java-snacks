package org.lesson.java;

import java.util.Scanner;

public class Snack3 {
	
		public static void main(String[] args) {
		
		int[] ElencoNumeri = new int[5];
		int sum = 0;
		int k=1;
		Scanner in = new Scanner (System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Inserisci un numero: ");
			int number = in.nextInt();
			ElencoNumeri[i] = number;
			
			if(k%2 !=0) {
				sum = sum + number;
			}
			k++;
		}
		System.out.println(sum);
		in.close();
	}
}
