package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LoteryScam {
public static void main(String[] args) {
	Random scam= new Random();
	
	
	int num =scam.nextInt(6);
	System.out.println(num);
	

}
}
