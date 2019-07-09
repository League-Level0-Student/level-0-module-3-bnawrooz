package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {
	public static void main(String[] args) {
		
		
		
		String Help = "";
		
		String Happy = JOptionPane.showInputDialog("are you happy?");
		
		if (Happy.contentEquals("yes") || Happy.contentEquals("yeah")) {
			
			JOptionPane.showMessageDialog(null, "keep doing whatever you're doing.");
			
		} else if (Happy.contentEquals("no") || Happy.contentEquals("nah")) {
			
			Help = JOptionPane.showInputDialog("DO you want to be Happy?");
			
		} 
		
		if (Help.contentEquals("yes") || Help.contentEquals("yeah")) {
			
		 	JOptionPane.showMessageDialog(null, "change Something");
			
		} else if (Help.contentEquals("no") || Help.contains("nah")) {
			
			JOptionPane.showMessageDialog(null, "keep doing whatever you're doing.");
			
		}	
	}
}