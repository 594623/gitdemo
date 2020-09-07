package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import java.math.BigInteger;

public class Oppgave6 {

	public static void main(String[] args) {
		//factorial of base
		String regex = "\\d+";
		String base;
		
		do {
			base = showInputDialog("Enter the base number.");
		} while (!base.matches(regex));
		
		BigInteger x = BigInteger.valueOf(Integer.parseInt(base));
		
		BigInteger result = factorial(x);
		
		System.out.println("Length: " + result.toString().length());
		System.out.println(result);
	}
	
	public static BigInteger factorial(BigInteger n) {
		BigInteger result = BigInteger.valueOf(1);
		
		for (long i = 2; i <= n.longValue(); i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		return result;
	}

}