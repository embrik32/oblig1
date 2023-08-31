package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Skattesatser {

	public static void main(String[] args) {
	
		int lonn = parseInt( showInputDialog("Årslønn brutto: ") );
		
		if (lonn >= 164101) {
			if (lonn >= 230951) {
				if (lonn >= 580651) {
					if (lonn >= 934051) {
						showMessageDialog(null, "14,52% skattesats");
					} else {
						showMessageDialog(null, "11.52% skattesats");
					}
				} else {
					showMessageDialog(null, "2,41% skattesats");
				}
			} else {
				showMessageDialog(null, "0,93% skattesats");
			}
		} else {
			showMessageDialog(null, "0% skattesats");
		}
		
	}
		

}
