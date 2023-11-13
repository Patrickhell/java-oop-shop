package org.lessons.java.shop;

import java.util.Random; 


public class Main {
	
	public static void main(String[] args) {
		
final int PRODUCT_COUNT = 5; 
		
		Random rnd = new Random();
		String[] nameList = {"arance", "pomodoro", "latte", "burro", "miele"};
		String[] descrizioneList = {"Dolce", "buono", "cremoso", "molto buono", "biologico"};
		for (int x =0; x < PRODUCT_COUNT; x++) {
			
			String randomName = nameList[rnd.nextInt(nameList.length)];
			
			String randomWord = descrizioneList[rnd.nextInt(descrizioneList.length)];
			Prodotto p = new Prodotto(rnd.nextInt(10000000), randomName, randomWord, rnd.nextInt(25, 50), 10);
			
			System.out.println("Prodotto " + (x + 1) + ":\n " + p + "\n------------------------------------------\n");
		}
		
	}

}
