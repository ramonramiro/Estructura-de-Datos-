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
 * @author RRSR
 */
public class Quick {
 
    public static void ordenaQuick (int vect[], int izq, int der){
        int i=0,j=0;
        int x=0,aux=0;
        
        i=izq;
        j=der;
        x=vect[(izq+der)/2];
        do {            
                while((vect[i]<x)&& (j<=der)){
                    i++;}
                while((x<vect[j]) && (j>izq)){
                    j--;}
                if(i<=j){
                    aux=vect[i];
                    vect[i]=vect[j];
                    vect[j]=aux;
                    i++;  j--;
                }
        }while (i<=j);
        if(izq<j){
            ordenaQuick(vect, izq, j);//recursividad
            if(i<der)
                ordenaQuick(vect, i, der);
                }
    }
    
    public static void main(String[] args) {
        int arreglo[]={10,80,50,95,70,5,95,17,87,65};
        ordenaQuick(arreglo, 0, arreglo.length-1);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+",");
        }
      
    }
    
}
