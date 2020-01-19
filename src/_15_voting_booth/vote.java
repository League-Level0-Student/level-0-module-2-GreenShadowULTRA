package _15_voting_booth;

import javax.swing.JOptionPane;

public class vote {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("how old r u");
	int imOld =Integer.parseInt(input);
	
	if(imOld < 18) {
		
	JOptionPane.showMessageDialog(null, "ur too young to vote lol go folow the law");	
		
		
	}
	else {
		
	JOptionPane.showMessageDialog(null, "ok vote den");	
		
		
	}
	System.exit(0);
}
}
