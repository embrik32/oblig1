package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class karakter {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 10; i++) {
		int poeng = parseInt( showInputDialog("skriv inn poengsum på deltaker nr " + i + " :" ));
		
		if (poeng < 0 || poeng > 100) i = i - 1;
		
		if (poeng >= 0) {
			if (poeng >= 40) {
				if (poeng >= 50) {
					if (poeng >= 60) {
						if (poeng >= 80) {
							if (poeng >= 90) {
								if (poeng > 100) {
									showMessageDialog(null, "Ugyldig poengsum, skriv inn ny poengsum");
								} else {
								showMessageDialog(null, "Karakter A");
								}
							} else {
								showMessageDialog(null, "Karakter B");
							}
						} else {
							showMessageDialog(null, "Karakter C");
						}
					} else {
						showMessageDialog(null, "Karakter D");
					}
				} else {
					showMessageDialog(null, "Karakter E");
				}
			} else {
				showMessageDialog(null, "Karakter F");
			}
		} else {
			showMessageDialog(null, "Ugyldig poengsum, skriv inn ny poengsum");
		}
		}
	}

}
