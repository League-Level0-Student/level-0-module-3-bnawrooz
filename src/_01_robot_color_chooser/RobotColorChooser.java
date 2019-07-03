//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
	    Robot moon = new Robot("hi");
	    
		
		//3. Ask the user what color they would like the robot to draw
	    for (int i = 0; i < 1000; i++) {
			
		
		String star = JOptionPane.showInputDialog("what color you would like the robot to draw?");
	    
		//5. Use an if/else statement to set the pen color that the user requested
		
		if (star.equals("blue")) {
			moon.penDown();
			moon.setPenWidth(10);
			moon.setPenColor(0, 0, 100);
			moon.move(100);
			moon.turn(103);
			moon.setSpeed(200);
		}else if (star.equals("green")) {
			moon.penDown();
			moon.setPenWidth(10);
			moon.setPenColor(0, 100, 0);
			moon.move(100);
			moon.turn(103);
			moon.setSpeed(200);
		}else if (star.equals("red")) {
			moon.penDown();
			moon.setPenWidth(10);
			moon.setPenColor(100, 0, 0);
			moon.move(100);
			moon.turn(103);
			moon.setSpeed(200);
	    //6. If the user doesn’t enter anything, choose a random color
		}else if (star.equals("")) {
			moon.penDown();
			moon.setPenWidth(10);
			moon.setRandomPenColor();
			moon.move(100);
			moon.turn(103);
			moon.setSpeed(200);
		}
        

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
}