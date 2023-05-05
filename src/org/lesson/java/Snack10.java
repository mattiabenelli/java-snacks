package org.lesson.java;

import java.util.Scanner;

public class Snack10 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Inserisci il raggio del cerchio: ");
		int raggio = in.nextInt();
		
		double area = raggio * raggio * 3.14;
		double perimetro = 2 * raggio * 3.14;
		
		System.out.println("l'area del cerchio è: " + String.format("%.0f" , area));
		System.out.println("Il perimetro del cerchio è: " + String.format("%.2f" , perimetro));
		
		in.close();	
	}
}
