package org.lessons.java.shop;


public class Prodotto {
	
	//Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop.

	//Un prodotto è caratterizzato da:

	//codice (numero intero)
	//nome
	//descrizione
	//prezzo
	//iva
	//Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e 
	//setter ed eventuali altri metodi di “utilità” per fare in modo che:

	//alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
	//il codice prodotto sia accessibile solo in lettura
	//gli altri attributi siano accessibili sia in lettura che in scrittura
	//il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
	//il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice e nome nella seguente forma: codice-nome
	//nello stesso package aggiungete una classe Main con metodo main nel quale testate tutte le funzionalità della classe Prodotto
	
	
	
		
	private int codice;
	private String name;
	private String descrizione ;
	private float prezzo;
	private int iva;
	
public Prodotto(int codice, String name, String descrizione, float prezzo, int iva) {
		
		setCodice(codice);
		setName(name);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
	}

public int getCodice() {
	
	return codice;
}


private void setCodice(int codice) {
	
	this.codice = codice;
	
}

public String getName () {
	
	 return name;
}
public void setName(String name) {
	
	this.name = name;
}

public String getDescrizione() {
	
	return descrizione;
}

public void setDescrizione(String descrizione) {
	
	this.descrizione = descrizione;
}

public float getPrezzo() {
	
	return prezzo;
}

public void setPrezzo(float prezzo) {
	
	this.prezzo = prezzo;
}


public int getIva() {
	
	return iva;
}

public void setIva(int iva) {
	
	this.iva = 22;
}

public  float prezzoConIva() {
	
	return getPrezzo() + (getPrezzo() * 22/100);
					 
}
 public String nomeCodice(){
	 
	 return getName() + "-" + getCodice();
 }
 
 public String padLeftCodice() {
     String codiceString = String.valueOf(getCodice()); // Converte il codice in stringa
     
     if (codiceString.length() < 8) {
         codiceString = String.format("%08d", getCodice()); // Aggiunge zeri se la lunghezza è inferiore a 8
     }
     
     return codiceString;
 }

 @Override
	public String toString() {
	 
	 return "codice: " + padLeftCodice() + "\n"
			 + "nome: " + getName() + "\n"
			 + "descrizione: " + getDescrizione() +  "\n"
			 + "prezzo: " + String.format("%.02f", getPrezzo()) + " " +  "euro " + "\n"
			 + "iva: " + getIva() + "%" + "\n"
			 + "pezzo incluso iva: " + String.format("%.02f", prezzoConIva()) + " " + "euro" +"\n"
			 + "nome-Codice: " + nomeCodice();
     }


		

}
