package org.lesson.java;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	
	public static void main(String[] args) {
		
		int number = 0;
		int p = 0;
		int d = 0;
		Integer[] NumeriPari = new Integer[10];
		Integer[] Numeridispari = new Integer [10];
		Random r = new Random();
		
		for(int i = 0; i<10; i++) {
			
			number = r.nextInt(0,100);
			System.out.println(number);
			
			if(number%2 == 0) {
				NumeriPari[p]= number;
				p++;
			}
			else { 
				Numeridispari[d]= number;
				d++;
			}
		}
		
		Integer[] NumeriPariNew = new Integer[p];
		Integer[] NumeridispariNew = new Integer [d];
		
		for(int i = 0; i<NumeriPari.length; i++) {
			if(NumeriPari[i] != null) {
				NumeriPariNew[i] = NumeriPari[i];
			}
		}
		
		for(int i = 0; i<Numeridispari.length; i++) {
			if(Numeridispari[i] != null) {
				NumeridispariNew[i] = Numeridispari[i];
			}
		}
		
		System.out.println("i numeri pari sono: ");
		System.out.println(Arrays.asList(NumeriPariNew));
		
		System.out.println("i numeri dispari sono: ");
		System.out.println(Arrays.asList(NumeridispariNew));
	}
}
