// `Snack 10`
// Creare un array di 10 elementi randomici compresi 
// tra 100 e 1000 e stampare:
// - tutti gli elementi pari
// - tutti gli elementi dispari
// - tutti gli elementi in indice pari
// - tutti gli elementi in indice dispari
package org.snacks;

import java.util.Random;

public class Snack10 {
  public static void main(String[] args) {

    int[] randomInt = new int[10];

    Random rnd = new Random();
    int min = 100;
    int max = 1000;

    System.out.println("\nTutti i numeri:");
    for (int i = 0; i < randomInt.length; i++) {

      // randomInt[i] = rnd.nextInt(1001 - 100) + 100;
      // oppure
      randomInt[i] = rnd.nextInt(max - min + 1) + min;
      System.out.println(i + ") " + randomInt[i]);
    }

    System.out.println("\nNumeri pari:");
    for (int i = 0; i < randomInt.length; i++) {

      if (randomInt[i] % 2 == 0) {
        System.out.println(i + ") " + randomInt[i]);
      }
    }

    System.out.println("\nNumeri dispari:");
    for (int i = 0; i < randomInt.length; i++) {

      if (randomInt[i] % 2 != 0) {
        System.out.println(i + ") " + randomInt[i]);
      }
    }

    System.out.println("\nNumeri con indice pari:");
    for (int i = 0; i < randomInt.length; i++) {

      if (i % 2 == 0) {
        System.out.println(i + ") " +  randomInt[i]);
      }
    }

    System.out.println("\nNumeri con indice dispari:");
    for (int i = 0; i < randomInt.length; i++) {

      if (i % 2 != 0) {
        System.out.println(i + ") " +  randomInt[i]);
      }
    }

  }
}
