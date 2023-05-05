package org.lesson.java;

import java.util.Scanner;

public class Snack9 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Inserisci la base del rettangolo: ");
		int base = in.nextInt();
		
		System.out.println("Inserisci l'altezza del rettangolo: ");
		int altezza = in.nextInt();
		
		int area = base * altezza;
		int perimetro = (base * 2) + (altezza * 2);
		
		System.out.println("l'area del rettangolo è: " + area);
		System.out.println("Il perimetro del rettangolo è: " + perimetro);
		
		in.close();	
	}
}
