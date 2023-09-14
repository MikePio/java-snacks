/*
 * Snack2
Generatore di “nomi cognomi” casuali: il Grande Gatsby ha  
una lista di nomi e una lista di cognomi, e da queste vuole mostrare 
a video una falsa lista di invitati con nome e cognome.
 */
package org.snacks;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		String[] nomiFalsi = {
				"Mario",
				"Francesco",
				"Luigi"
		};
		
		String[] cognomiFalsi = {
				"Rossi",
				"Bianchi",
				"Verdi"
		};
		
		String[] invitati = new String[nomiFalsi.length];
		
		Random rnd = new Random();
		
		for(int i=0; i<nomiFalsi.length; i++) {
			invitati[i] = nomiFalsi[rnd.nextInt(nomiFalsi.length)] + " " + cognomiFalsi[rnd.nextInt(cognomiFalsi.length)];
			
			System.out.println(invitati[i]);
		}
		
	}
}
