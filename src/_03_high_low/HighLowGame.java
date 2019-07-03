//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int Random = new Random().nextInt(100);
		//JOptionPane.showMessageDialog(null, Random);
		
		
		// 2. Print out the random variable above
		System.out.println(Random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		String  Number = JOptionPane.showInputDialog("pick a number between 1 and 100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int Number1 = Integer.parseInt(Number);
			// 5. if the guess is correct
			if (Number1 == Random) {
				JOptionPane.showMessageDialog(null, "win");
			}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			else if (Number1 >= Random) {
				JOptionPane.showMessageDialog(null, "guss is too high");
				JOptionPane.showMessageDialog(null, "you lost");
			}
				// 8. Tell them it's too high
			else if (Number1 <= Random) {
				JOptionPane.showMessageDialog(null, "guss is too low");
				JOptionPane.showMessageDialog(null, "you lost");
			}
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


