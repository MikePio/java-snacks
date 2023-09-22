/*
 * #### Snack 6
Dato un numero sotto forma di stringa, convertirlo in intero 
senza utilizzare funzioni già pronte.

Possibile usare solo :

- cicli
- chartAt
- if / switch

Es. “25” come stringa deve essere convertito in intero 25.
 */
package org.snacks;

public class Snack6 {
    public static void main(String[] args) {

        String str = "25";
        int res = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // 2 -- 5 

            if (ch < '0' || ch > '9') {
                System.out.print("Stringa non valida!");
                return;
            }

            int digit = ch - '0'; // 2 -- 5
            res = res * 10 + digit; // 0 * 10 + 2 = 2 -- 2 * 10 + 5 = 25
        }
        System.out.print("Stringa trasformata in intero: " + res);
    }
}

