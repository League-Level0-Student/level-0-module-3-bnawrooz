package _10_99_bottles;

public class Bottles {
	public static void main(String[] args) {
		int beh = 100;
		int behzad = 99;
		for (int i = 0; i < 98; i++) {
			behzad = behzad - 1;
			beh = beh - 1;
			System.out.print( beh + " bottles of beer on the wall, " + beh + "bottles of beer. \n"
					
					+ "Take one down and pass it around, " + behzad + "bottles of beer on the wall.\n \n" );
		
			
		}
	
	}
}































//99 bottles of beer on the wall, 99 bottles of beer.
//Take one down and pass it around, 98 bottles of beer on the wall.