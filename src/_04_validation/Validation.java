//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
	

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 1) {
	System.out.println("hoi");
		}
		else if (randomNumber ==2) {
			System.out.println("Im Temmie");
			
		}
		else if (randomNumber ==3) {
			System.out.println("and dis is my friend temmie");
			
		}else if (randomNumber ==4) {
			System.out.println("And Temmie and Temmie");
			
			
		}else {
			System.out.println("and my bissniues parter bob");
			
		}
		// 2. Rpeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
