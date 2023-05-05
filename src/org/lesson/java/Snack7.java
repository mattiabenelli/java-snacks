package org.lesson.java;

import java.util.Random;

public class Snack7 {
	
	public static void main(String[] args) {
		
		int number = 0;
		Random r = new Random();
		
		do {
			number = r.nextInt(0, 100);
			System.out.println(number);
		} while (number%3 != 0 && number%5 != 0);
	}
}
