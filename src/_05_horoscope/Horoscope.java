package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
	 public static void main(String[] args) {
		
		 String star = JOptionPane.showInputDialog("What is your star sign?");
		 if (star.contentEquals("Aries") || star.contentEquals("aries")) {
			 JOptionPane.showMessageDialog(null, "\n" + 
			 		"Aries Zodiac Sign\n" + 
			 		"Fire sign; ruled by Mars.\n" + 
			 		"Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action." );
		 }else if(star.contentEquals("Taurus") || star.contentEquals("taurus")) {
			 JOptionPane.showMessageDialog(null, 
				    "aurus Zodiac Sign\n" + 
			 		"Earth sign; ruled by Venus.\n" + 
			 		"Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
			 
		 }else if(star.contentEquals("Gemini") || star.contentEquals("gemini")) {
			 JOptionPane.showMessageDialog(null, 
					"Gemini Zodiac Sign\n" + 
			 		"Air sign; ruled by Mercury\n" + 
			 		"Cerebral, chatty, loves learning and education, charming, and adventurous.");
		 }else if(star.contentEquals("Cancer") || star.contentEquals("cancer")) {
			 JOptionPane.showMessageDialog(null, 
					"Cancer Zodiac Sign\n" + 
			 		"A water sign; ruled by the Moon.\n" + 
			 		"Emotional, group oriented, seeks security, family.\n" + "");
		 }else if(star.contentEquals("Leo") || star.contentEquals("leo")) {
			 JOptionPane.showMessageDialog(null, 
					"Leo Zodiac Sign\n" + 
			 		"Fire sign; ruled by the Sun.\n" + 
			 		"Generous, organized, protective, beautiful.");
		 }else if (star.contentEquals("Virgo") || star.contentEquals("virgo")) {
			 JOptionPane.showMessageDialog(null, 
					"Virgo Zodiac Sign\n" + 
			 		"Earth sign; ruled by Mercury.\n" + 
			 		"Particular, logical, practical, sense of duty, critical.");
		 }else if (star.contentEquals("Libra") || star.contentEquals("libra")) {
			 JOptionPane.showMessageDialog(null, 
					"Libra Zodiac Sign\n" + 
			 		"Air sign; ruled by Venus.\n" + 
			 		"Balanced, seeks beauty, sense of justice.");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
