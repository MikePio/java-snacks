// `Snack 9`
// Chiedere all'utente numeri interi e calcolarne la somma. 
// Continuare a chiedere numeri, finche' la sommatoria 
// non supera il valore `1000`
package org.snacks;

import java.util.Scanner;

public class Snack9 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int somma = 0;
    int counter = 0;

    while (somma <= 1000) {

      System.out.print("Inserisci un numero intero: ");
      int numero = sc.nextInt();

      counter++;
      somma += numero;

      if (somma <= 1000) {
        System.out.println("La somma num. " + counter + " è: " + somma);
      }

    }

    System.out.println("La somma totale è: " + somma);
  }
}
