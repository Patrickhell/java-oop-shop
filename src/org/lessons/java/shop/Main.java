package org.lessons.java.shop;

import java.util.Random; 


public class Main {
	
	public static void main(String[] args) {
		
final int PRODUCT_COUNT = 6; 
		
		Random rnd = new Random();
		String[] nameList = {"Cioccolato", "Pomodoro", "Latte", "Burro", "Miele", "Cafe"};
		String[] descrizioneList = {"Dolce", "Buono", "Cremoso", "molto buono", "Naturale", "Delizioso"};
		for (int x =0; x < PRODUCT_COUNT; x++) {
			
			String randomName = nameList[rnd.nextInt(nameList.length)];
			
			String randomWord = descrizioneList[rnd.nextInt(descrizioneList.length)];
			Prodotto p = new Prodotto(rnd.nextInt(10000000), randomName, randomWord, rnd.nextInt(25, 50), 10);
			
			System.out.println("Prodotto " + (x + 1) + ":\n " + p + "\n------------------------------------------\n");
		}
		
	}

}
