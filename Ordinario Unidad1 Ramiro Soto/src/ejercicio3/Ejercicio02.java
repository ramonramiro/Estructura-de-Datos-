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
public class Ejercicio02 {

    static final String DATA_PATH="datos.txt"; 
	
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
                int datoleido1, datoleido2;
		
		while(fileReader.hasNextLine()){
			datoleido1=fileReader.nextInt();
			datoleido2=fileReader.nextInt();
                        System.out.println(contador + ":producto" + datoleido1+"serie" +datoleido2);
			contador++;
			
		
		}
}
}
