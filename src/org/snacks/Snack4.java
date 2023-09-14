/*
 * ### Snack4
Data in input una stringa verificare se è palindroma
 */
package org.snacks;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		
		String parolaRovesciata = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci la parola e verific se è palidroma: ");
		String parolaInserita = sc.nextLine();
		sc.close();
		
		for(int i=parolaInserita.length() - 1; i>=0; i--) {
			parolaRovesciata =  parolaRovesciata + parolaInserita.charAt(i);
		}
		
		String verificaParolaPalindroma = (parolaInserita.equals(parolaRovesciata)) 
								   ? parolaInserita + " è una parola palindroma"
								   : parolaInserita + " NON è una parola palindroma";
		
		System.out.println(verificaParolaPalindroma);
	}
}
