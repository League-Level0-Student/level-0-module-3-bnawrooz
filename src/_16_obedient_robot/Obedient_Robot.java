package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			
		String color1 = JOptionPane.showInputDialog("which color do you want?");
		
		String behzad = JOptionPane.showInputDialog("which shape do you want me to draw?");
	
		
		
		if (color1.contentEquals("blue") || color1.contentEquals("Blue")){
			robot.setPenColor(0, 0, 100);
		}else if (color1.contentEquals("red") || color1.contentEquals("Red")) {
			robot.setPenColor(100, 0, 0);
		}else if (color1.contentEquals("green") || color1.contentEquals("Green")) {
			robot.setPenColor(0, 100, 0);
		}else {
			JOptionPane.showMessageDialog(null, "Sorry I don't have that color :( ");
		}
		
		
		
		

		
		if (behzad.contentEquals("Square") || behzad.contentEquals("square")) {
			drawSquare();	
		}else if(behzad.contentEquals("Triangle") || behzad.contentEquals("triangle")) {
			drawTriangle();
		}else if(behzad.contentEquals("Circle") || behzad.contentEquals("circle")) {
			drawCircle();
		}else {
			JOptionPane.showMessageDialog(null, "sorry I can't draw that shape :( !!!");
		}
		
		
		
		
		
		
		
		}
	
		
		
		
		
		
		
		
	}
	
	
      static void drawSquare() {
	  
	  robot.setX(100);
	  
	  for (int i = 0; i < 4; i++) {
	  
	  robot.setSpeed(100);
	  robot.penDown();
	  robot.move(100);
	  robot.turn(90);
	  
	  }
	  robot.setY(50);
	  }
	  
	  static void drawTriangle() {
		  
		  robot.setX(250);
		  for (int i = 0; i < 2; i++) {
				
			  
			  robot.setSpeed(100);
			  robot.penDown();
			  robot.move(50);
			  robot.turn(90);
			  robot.move(100);
			  robot.turn(90);
	  }
		  robot.setY(50);
		  }
	  	  static void drawCircle() {
	  		robot.setY(0);
	  		robot.setX(400);
	  		for (int i = 0; i < 33; i++) {
				robot.setSpeed(100);
				robot.penDown();
	  			robot.move(10);
	  			robot.turn(12);
	  			
			}
	  		  robot.setY(50);
	  	  }
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}

