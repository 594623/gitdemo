package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {
	
	public static void main(String[] args) {
		
		int score;
		String grade = "";
		
		final int MAX = 100;
		final int AMIN = 90;
		final int BMIN = 80;
		final int CMIN = 60;
		final int DMIN = 50;
		final int EMIN = 40;
		
		boolean isInvalidScore = false;
		
		for (int i = 0; i < 10; i++) {
			score = Integer.parseInt(showInputDialog("<html><b>State your score:</b></html>"));
			
			if (score < EMIN) {
				grade = "F";
			} else if (score < DMIN) {
				grade = "E";
			} else if (score < CMIN) {
				grade = "D";
			} else if (score < BMIN) {
				grade = "C";
			} else if (score < AMIN) {
				grade = "B";
			} else if (score <= MAX) {
				grade = "A";
			} else {
				showMessageDialog(null,
						"Invalid score.",
						"Error",
						ERROR_MESSAGE);
				isInvalidScore = true;
				i--;
			}
			
			if (!isInvalidScore) {
			System.out.println("Student " + (i + 1) + " Grade = " + grade);
			} else isInvalidScore = false;
		}
		
	}
	
}
