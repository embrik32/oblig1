package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class heiltallfakultet {

	public static void main(String[] args) {
		
		
		int tall = parseInt( showInputDialog("Skriv inn tall: " ));
		
		while (tall < 0) {
			int tall2 = parseInt( showInputDialog( "Skriv inn tall: "));
			tall = tall2;
		}
		int x = 1;
		int i = 1;
		while (i <= tall) {
			x = x * i;
			i++;
		}
		showMessageDialog(null, x + " er fakultet av " + tall );
	}

}
