package org.lesson.java;

import java.util.Arrays;

public class Snack13 {
	
	public static void main(String[] args) {
		
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		Integer[] NewArr1 = new Integer[arr1.length];
		Integer[] NewArr2 = new Integer[arr2.length];
		
		
		for(int i = 0; i < NewArr1.length; i++) {
			
			if(i == 0) {
				NewArr1[i] = arr2[i];
			}
			else {
				NewArr1[i] = arr1[i];
			}
		}
		
		for(int i = 0; i < NewArr2.length; i++) {
			
			if(i == 0) {
				NewArr2[i] = arr1[i];
			}
			else {
				NewArr2[i] = arr2[i];
			}
		}
		
		System.out.println("ll nuovo arr1 è: ");
		System.out.println(Arrays.asList(NewArr1));
		
		System.out.println("ll nuovo arr2 è: ");
		System.out.println(Arrays.asList(NewArr2));
	}
}
