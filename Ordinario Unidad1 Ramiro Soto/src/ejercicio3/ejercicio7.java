/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author RRSR
 */
public class ejercicio7 {
   
    static String cadena = "";
    static int i = 0;
    
    
    public static String entroCadena(int n) {
        
        String numero = String.valueOf(n);
        char simple = numero.charAt(i);
        
        switch (simple) {
            case '0':
                cadena = cadena + "cero ";
                break;
            case '1':
                cadena = cadena + "uno ";
                break;

            case '2':
                cadena = cadena + "dos ";

                break;

            case '3':
                cadena = cadena + "tres ";
                break;

            case '4':
                cadena = cadena + "cuatro ";
                break;

            case '5':
                cadena = cadena + "cinco ";
                break;

            case '6':
                cadena = cadena + "seis ";
                break;

            case '7':
                cadena = cadena + "siete ";
                break;

            case '8':
                cadena = cadena + "ocho ";
                break;

            case '9':
                cadena = cadena + "nueve ";
                break;
        }
        i++;
         if(i < numero.length()){
             ejercicio7.entroCadena(n);
        }
        
        
        return cadena.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero entre 1 y 9999: ");
        int numero = teclado.nextInt();

        //String cadena = entroCadena(numero);
        if (numero > 0 && numero < 10000) {
            ejercicio7 objeto = new ejercicio7();
            objeto.entroCadena(numero);
            System.out.println(cadena);
        } else {
            System.out.println("El numero es invalido");
        }

    }
}

