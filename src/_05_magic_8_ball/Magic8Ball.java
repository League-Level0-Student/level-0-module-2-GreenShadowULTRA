//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random fun=new Random();
int num =fun.nextInt(4);
	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("What is ur question");
	// 5. If the random number is 0
if (num == 0) {
	System.out.println("Y E S");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
else if (num == 1) {
	
	System.out.println("N O");
}
	// -- tell the user "No"

	// 7. If the random number is 2

else if (num == 2) {
	
	System.out.println("IDK GOOGLE IT");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
else if (num == 3) {
	System.out.println("WHAT DO U THINK");
}
System.exit(0);
	// -- write your own answer
}
}
