/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import sun.applet.Main;

/**
 *
 * @author RRSR
 */
public class ejercicio8 {
   static int [] datos={8,25,7,9,6};
    int i=0;
     static int mayor =datos[0];
   
   public void datomayor(int arreglo[]){
      
       //for (int i = 0; i < arreglo.length; i++) {
         
          if(i<datos.length){
       if(arreglo[i]>mayor){
               mayor=arreglo[i];
           }
       i++;
              datomayor(arreglo);
       
          }
       //}
   }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ejercicio8 obj= new ejercicio8();
     obj.datomayor(datos);
        System.out.println("El mayor es "+ mayor);
    }
    
}
