package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave4 {
	
	public static void main(String[] args) {
		
		int income = Integer.parseInt(showInputDialog("<html><b>State your income:</b></html>"));
		double tax = 0;
		
		final int STEP0MAX = 180800;
		final int STEP1MAX = 254500;
		final int STEP2MAX = 639750;
		final int STEP3MAX = 999550;
		
		if (income <= STEP0MAX) {
			// No taxes
			tax = 0;
		} else if (income <= STEP1MAX) {
			// Trinn 1
			tax = 1.9;
		} else if (income <= STEP2MAX) {
			// Trinn 2
			tax = 4.2;
		} else if (income <= STEP3MAX) {
			// Trinn 3
			if (showConfirmDialog(null, "Are you from Troms og Finnmark?", "WARNING",
					YES_NO_OPTION) == YES_OPTION) {
				tax = 11.2;
			} else {
				tax = 13.2;
			}
		} else {
			// Trinn 4
			tax = 16.2;
		}
		
		int incomeAfterTax = (int) (income - income * (tax / 100));
		
		System.out.println("Income before tax: " + income +
				"\nIncome after tax: " + incomeAfterTax);
		
	}
	
}
