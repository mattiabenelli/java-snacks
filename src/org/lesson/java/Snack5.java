package org.lesson.java;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Inserisci il numero di valori da estrarre: ");
		int input = in.nextInt();
		int sum = 0;
		int EvenSum = 0;
		int OddSum = 0;
		int k = 0;
		int MinNumber = 0;
		int MaxNumber = 0;
		int[] NumeriCasuali = new int[input];
		
		
		Random r = new Random();
		
		for(int i = 0; i < input; i++) {
			NumeriCasuali[i] = r.nextInt(0, 100);
			System.out.println(NumeriCasuali[i]);
			
			sum = sum + NumeriCasuali[i];
			
			if(i == 0) {
				MinNumber = NumeriCasuali[i];
				MaxNumber = NumeriCasuali[i];
			}
			else if(NumeriCasuali[i] < NumeriCasuali[i-1]) {
				MinNumber = NumeriCasuali[i];
			}
			else if(NumeriCasuali[i] > NumeriCasuali[i-1]) {
				MaxNumber = NumeriCasuali[i];
			}
			
			
			if(NumeriCasuali[i]%2 == 0) {
				EvenSum = EvenSum + NumeriCasuali[i];
			}
			else if((NumeriCasuali[i]%2 != 0)){
				OddSum = OddSum + NumeriCasuali[i];
				k++;
			}
		}
		int media = sum / input;
		int DispMedia = OddSum / k;
		
		System.out.println("-----------------------");
		System.out.println("La somma è: " + sum);
		System.out.println("La somma dei valori pari è: " + EvenSum);
		System.out.println("La media è: " + media);
		System.out.println("La somma dei valori dispari è: " + DispMedia);
		System.out.println("Il valore minimo è: " + MinNumber);
		System.out.println("Il valore massimo è: " + MaxNumber);
		
		in.close();
	}
}
