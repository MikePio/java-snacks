// `Snack 8`
// Creare un array di 10 interi randomici compresi tra 100 e 150. 
// Stampare tutti i valori contenuti nell'array (dopo averli inseriti). 
// Stampare inoltre il valore minimo, massimo e la media
package org.snacks;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Snack8 {
  public static void main(String[] args) {

    int[] array = new int[10];
    Random rnd = new Random();

    for (int i = 0; i < array.length; i++) {

      array[i] = ThreadLocalRandom.current().nextInt(100, 151); //151 (escluso)
    }

    System.out.println("Numeri interi random: \n");

    for (int i = 0; i < array.length; i++) {

      System.out.println((i+1) + ") " + array[i]);
    }

    // Trovare il valore minimo e massimo
    int min = array[0];
    int max = array[0];
    int sum = 0;

    for (int i = 0; i < array.length; i++) {

      if (array[i] < min) {
        min = array[i];
      }
      if (array[i] > max) {
        max = array[i];
      }

      sum += array[i];

    }

    System.out.println("\nIl numero minore è: " + min);
    System.out.println("\nIl numero maggiore è: " + max);

    double media = (double) sum / array.length;
    System.out.println("\nLa media dei numeri random è: " + media + "\n");
    
  }

}
