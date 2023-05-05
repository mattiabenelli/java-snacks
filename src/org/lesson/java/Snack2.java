package org.lesson.java;

import java.util.Random;

public class Snack2 {
	
	public static void main(String[] args) {
		String[] names = {
			    "nome 1",
			    "nome 2",
			    "nome 3",
			    "nome 4",
			    "nome 5",
			};
		String[] surnames = {
				"cognome 1",
			    "cognome 2",
			    "cognome 3",
			    "cognome 4",
			    "cognome 5",
			};
		
		for(int i=0; i<10; i++) {
			
			Random r = new Random();
			int random1 = r.nextInt(0, names.length - 1);
			int random2 = r.nextInt(0, surnames.length - 1);
			
			System.out.println("Invitato " + i + ": " + names[random1]+ " " + surnames[random2]);
		}
	}
}
