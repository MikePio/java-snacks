/*
 * ### Snack3
Crea un array di numeri interi e fai la somma di tutti gli elementi  
che sono in posizione dispari
 */
package org.snacks;

public class Snack3 {
 public static void main(String[] args) {
	
	 int[] nums = {
           	 1,
             2,
	         3,
	         4,
	         5
	 };
	 
	 int sommaNums = 0;
	 
	 for(int i=0; i<nums.length; i++) {
		
		 if(nums[i]%2 != 0) {
			 sommaNums += nums[i]; 
		 }
		 
	 };
	 
	 System.out.println(sommaNums);
	 
	 
 }
}
