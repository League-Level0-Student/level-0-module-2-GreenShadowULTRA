package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rolercoasterthing {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog ("how tall are u (in inches)");
	int hai =Integer.parseInt(input);
	
	if (hai < 48) {
		
	JOptionPane.showMessageDialog(null, "your too small (F)");	
		
	}
	else {
		
	JOptionPane.showMessageDialog(null, "go on the ride ");
		
	}
	System.exit(0);
}
}
