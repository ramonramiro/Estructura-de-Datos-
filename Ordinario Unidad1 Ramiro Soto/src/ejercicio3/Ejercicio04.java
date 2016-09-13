/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author RRSR
 */
public class Ejercicio04 {

     static int factorial(int numero){
          if ( numero <= 1 ) {
              return 1;
          } else {
              return numero*factorial(numero-1);
          }
     }
     public static void main(String args[]){
         System.out.println(factorial(5));
     }
 }



