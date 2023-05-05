package org.lesson.java;

import java.util.Arrays;

public class Snack12 {
	
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		int ArrLength = arr1.length + arr2.length;
		
		int k1 = 0;
		int k2 = 0;
		
		Integer[] ArrConc = new Integer[ArrLength];
		
		for(int i = 0; i < ArrLength; i++) {
			
			if(k1 < arr1.length) {
				ArrConc[i] = arr1[k1];
				k1++;
			}
			else if(k2 < arr2.length) {
				ArrConc[i] = arr2[k2];
				k2++;
			}
		}
		
		System.out.println("la concatenazione dei due array è: ");
		System.out.println(Arrays.asList(ArrConc));

	}
}
