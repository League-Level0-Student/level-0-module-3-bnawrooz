//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String behzad = JOptionPane.showInputDialog("do you like banana?");
		//2. if they say no, 
		if (behzad.contentEquals("no") || behzad.contentEquals("No")) {
			JOptionPane.showMessageDialog(null, "you are crazy.");
		}
		
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		
		if (behzad.contentEquals("yes") || behzad.contentEquals("Yes")) {
			String beh = JOptionPane.showInputDialog("what is your hobby?");
			JOptionPane.showMessageDialog(null, beh + " is much better with Bananas!");
		}else  {
			JOptionPane.showMessageDialog(null ,"You are bananas!�?");
		}
		
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}

}
 