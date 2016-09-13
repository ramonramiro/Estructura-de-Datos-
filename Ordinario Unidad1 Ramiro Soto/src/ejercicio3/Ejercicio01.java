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
public class Ejercicio01 {

   static final String DATA_PATH="datos.txt"; //Ruta donde se encuentra el archivo
	
	public static void main(String[] args){
		Scanner fileReader = null;
		try{
			fileReader = new Scanner(new File(DATA_PATH));
			System.out.println("Archivo Abiero "+fileReader);
			
		}catch (FileNotFoundException e){
			System.out.println("El archivo "+DATA_PATH + " No se encuentra");
			System.out.println("Programa Terminado");
			System.exit(0);
		}
		
		int contador = 1;
		int datoLeido = fileReader.nextInt();
		System.out.println("Palas Cargadoras 78345");
		while(datoLeido==78345){
			datoLeido=fileReader.nextInt();
			System.out.println(contador + ":serie: " +datoLeido);
			datoLeido=fileReader.nextInt();
			contador++;
		}
		
		System.out.println("Retroexcabadoras 33278");
		while(datoLeido==33278){
			datoLeido=fileReader.nextInt();
			System.out.println(contador + ":serie: " +datoLeido);
			datoLeido=fileReader.nextInt();
			contador++;
		}
		
		System.out.println("Dumpers 63287");
		while(datoLeido==63287){
			datoLeido=fileReader.nextInt();
			System.out.println(contador + ":serie: " +datoLeido);
			try{
				datoLeido=fileReader.nextInt();
			}catch(Exception e){
				System.out.println("se ha terminado el archivo");
			}
			contador++;
		}
	}
	
}
