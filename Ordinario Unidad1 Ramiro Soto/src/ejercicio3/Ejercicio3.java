/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author RRSR
 */
public class Ejercicio3 {
 public static void main(String[] args) {
        String[] nom=new String [10];// Declaracion de arreglo timpo String para saber el nombre de los empleados   que gana mas segun su horas trabajadas 
        String nomMay = null;// Variable que almaceara el Nombre con mayor horas trabajadas 
        String nomMenor = null;// Variable que almacena el nombre de empleados con menor horas 
        int trabajadores;// varable que almacena 
        double may=0;
        String []nompro=new String [10];
        double meo=1000222;
        double [] hora=new double[10];
        String  categoria = null;
        double [] sueldo=new double[10];
        
        double horMax=0;
        String nomHoraMax = null;
         double  horMin=5962;
        String nomHoraMin = null;
        
        double p = 0;
         java.util.Scanner leer = new java.util.Scanner(System.in);
         int i;
        for ( i = 0; i < 2; i++) {
           System.out.println("Ingrese el nombre del empleado  ");
	     nom[i]=leer.next();
             System.out.println("Ingres la categoria ");
             categoria=leer.next();
             System.out.println("Ingreselas hora del empleado ");
             hora[i]=leer.nextDouble();
             
             if(categoria.equalsIgnoreCase("A")){
                 sueldo[i]=hora[i]*150;
             }
             if(categoria.equalsIgnoreCase("B")){
                  sueldo[i]=hora[i]*250;
             }
             if(categoria.equalsIgnoreCase("C")){
                  sueldo[i]=hora[i]*500;
             }
             
             if(sueldo[i]>=may){
                 may=sueldo[i];
                 nomMay=nom[i];
             }
             if(sueldo[i]<=meo){
                 meo=sueldo[i];
                 nomMenor=nom[i];
             }
             if(hora[i]>=horMax){
                 horMax=hora[i];
                 nomHoraMax=nom[i];
             }
             if(hora[i]<=horMin){
                 horMin=hora[i];
                 nomHoraMin=nom[i];
             }
             
            p=p+sueldo[i];
            nompro=nom;
        }
        double promedio=p/i;
        String nomPromedioMayor=null,nomProMenor=null;
        
        for (int j = 0; j < 2; j++) {
            if(sueldo[j]>=promedio){
                nomPromedioMayor=nompro[j];
            }
             if(sueldo[j]<promedio){
                nomProMenor=nompro[j];
            }
            
        }
      
        System.out.println("El sueldo mayor es "+may +"Del empleado "+nomMay);
        System.out.println("El sueldo menor es "+meo+"Del empleado  "+nomMenor);
        System.out.println("El promedio del sueldo semanal es "+promedio);
        System.out.println("El nombre del empleado con mas horas trabajadas son "+nomHoraMax +" las horas son "+ horMax);
        System.out.println("El nombre del empleado con menos horas trabajadas son "+nomHoraMin+"  y las horas son  "+ horMin);
        System.out.println("Nombre del empleado que gana igual o mas que el promedio "+ nomPromedioMayor);
        System.out.println("Nombre del empleado que gana meno que el promedio "+nomProMenor);
       
    }
    
}