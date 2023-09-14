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
		
		if (num % 2 == 0) {
			System.out.println("Il numero è pari");
		} else {
			System.out.println("Il numero è dispari");
		}		

	}
}
