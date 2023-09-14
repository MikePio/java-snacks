/*
 * ### Snack5
Data una stringa in input mostrare a video quanti caratteri 
alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.

Continuare a chiedere una nuova stringa finchè non si inserisce 0.
 */
package org.snacks;

import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String parola = null;
		
		do {
			System.out.print("Inserisci una parola: ");
			parola = sc.nextLine(); 
			
			int numLettere = 0;
			int numNumeri = 0;
			int numSimboli = 0;
			int counter = 0;
	        
			while(counter<parola.length()) {		
				
			    // verifica se il carattere è una lettera alfabetica
			    if (Character.isLetter(parola.charAt(counter))) {
			        numLettere++;
			    }
			    // verifica se il carattere è un numero
			    else if (Character.isDigit(parola.charAt(counter))) {
			        numNumeri++;
			    }
			    // verifica se il carattere è un simbolo non alfanumerico
			    else {
			        numSimboli++;
			    }
					
				counter++;
				
			}
			
			//		System.out.println(counter);
			System.out.println("Numero lettere: " + numLettere);
			System.out.println("Numero numeri: " + numNumeri);
			System.out.println("Numero simboli: " + numSimboli);
			
		}while(!parola.equals("0"));{
						
			sc.close();
			
		}
	}
	


}
