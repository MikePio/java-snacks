/*
 * ### Snack1
Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

 */
package org.snacks;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print ("Verifica se è un numero pari o dispari: ");
		int num = sc.nextInt();
		
		sc.close();
		
		// soluzione 1
//		if (num % 2 == 0) {
//			System.out.println("Il numero è pari");
//		} else {
//			System.out.println("Il numero è dispari");
//		}		
		
		// soluzione 2 MIGLIORE con l'operatore ternario
		String messaggio = (num % 2 == 0) ? "Il numero è pari" : "Il numero è dispari";
		System.out.println(messaggio);


	}
}
