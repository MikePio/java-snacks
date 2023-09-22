/*
 * #### Snack 7
Scrivere un programma che dati dei secondi li converta in ore, 
minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”) 
 */
package org.snacks;

import java.util.Scanner;

public class Snack7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci un numero di secondi: ");
		int seconds = sc.nextInt();
		sc.close();
		
		// SOLUZIONE 1

		// int hour = 0;
		// int min = 0;
		// int sec = 0;
		
		// for(int i=0; i < seconds; i++) {

		// 	if (sec < 59) {

		// 		sec++;

		// 	} else if(min < 59) {

		// 		min ++;
		// 		sec = 0;

		// 	} else {

		// 		hour++;
		// 		min = 0;
		// 		sec = 0;
				
		// 	} 
		// }

		// System.out.println("\nSecondi -> " + String.format("%02d:%02d:%02d", hour, min, sec));
		
		//-----------------------------------------------------------------

		// SOLUZIONE 2  MIGLIORE

		// 60 * 60 = 3600
		// 1 ora = 3600 secondi
		int hour = seconds / 3600;  
		int secondiRimanenti = seconds % 3600; 
		// 1 minuto = 60 secondi
		int min = secondiRimanenti / 60;  
		int sec = secondiRimanenti % 60;

		System.out.println("\nSecondi -> " + String.format("%02d:%02d:%02d", hour, min, sec));

	}
}
