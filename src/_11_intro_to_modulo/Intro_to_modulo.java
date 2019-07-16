package _11_intro_to_modulo;

import java.util.Random;

public class Intro_to_modulo {
	public static void main(String[] args) {
		
		
		
		int Random = new Random().nextInt(100);
		
	    if (Random % 2 == 0) {
	        System.out.println("number is even");
	    }
	    else {
	        System.out.println("number is odd");
	    }
		
	    for (int i=1; i<=1000; i++) {
	        // do some code
	        if (i % 20 == 0){
	            System.out.println("20 more repeats completed");
	        }
	    }
		
	}
}
