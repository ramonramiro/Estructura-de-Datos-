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
public class Ejercicio05 {
	static int mcd(int m, int n) {
		if (n <= m && m % n == 0)
			return n;
		else if (m < n)
			return mcd(n, m);
		else
			return mcd(n, m % n);
	}

	public static void main(String[] args) {
		System.out.println(mcd(124,6));
	}
}
