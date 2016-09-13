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
public class Ejercicio06 {
	private static int movimientos = 0;

	public static int mover(int n, char a, char b, char c) {
		if (n > 0) {
			mover(n - 1, a, c, b);
			System.out.println("mover disco " + a + " a " + c);
			movimientos++;
			mover(n - 1, b, a, c);
		}
		return movimientos;
	}
	
	
	 
	    public static void main(String[]args)
	    {
	     java.util.Scanner leer = new java.util.Scanner(System.in);
	     int movimientos;
	     System.out.println("Numero de discos: ");
	     int n=leer.nextInt();
	     movimientos = Ejercicio06.mover(n, 'A', 'B', 'C');
	     System.out.println("\nMovimientos efectuados: "+movimientos);
	    }  
	    
	
} 
