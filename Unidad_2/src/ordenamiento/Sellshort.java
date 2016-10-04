/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO
 * TECNOLOGIAS DE LA INFORMACION Y LA COMUNICACION 
 * SISTEMAS INFORMATICOS
 * RAMON RAMIRO SOTO RINCON 
 * PERRY.9314@GMAIL.COM
 * GSI-1241
 * 1215100917
 *
 * @author RRSR
 */
public class Sellshort {
     private static int[] arreglo;

    public static int[] defineArreglo() {
        int[] numeros = {10, 80, 50, 95, 70, 5, 95, 17, 87, 65};
        arreglo = numeros;
        return numeros;
    }

    public void mostrarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
    
    public static void ordenarShell(){
        int i = 0;
        int j = 0;
        int aux = 0;
        
        int contador = 1;
        
        while(contador <= arreglo.length/3){
            contador = contador*3 +1;
        }
        
        while(contador > 0){ 
            for (j = contador; j < arreglo.length; j++) {
                aux = arreglo[j];
                i = j;
                while(i > contador - 1 && arreglo[(i-contador)] >= aux){ 
                    arreglo[i] = arreglo[(i-contador)];
                    i -= contador;
                }
                arreglo[i] = aux;
            }
            contador = (contador - 1)/3;
        }
    }
    
    public static void main(String[] args) {
        Sellshort obj = new Sellshort();
        System.out.println("Ordenamiento Shellsort");
        obj.defineArreglo();
        obj.mostrarArreglo();
        System.out.println("");
        obj.ordenarShell();
        obj.mostrarArreglo();
    }


}
