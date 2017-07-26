package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
    	String n = JOptionPane.showInputDialog("How many nickels do you have? Put in a number.");
        // Convert their answer to an int using Integer.parseInt()
    	int ickel = Integer.parseInt(n);
    	ickel*=5;
        // Ask the user how many dimes they have, and convert their answer
    	String d = JOptionPane.showInputDialog("How many dimes do you have? Put in a number.");
    	int ime = Integer.parseInt(d);
    	ime*=10;
        // Ask the user how many quarters they have, and convert their answer
    	String q = JOptionPane.showInputDialog("How many quarters do you have? Put in a number?");
    	int uarter = Integer.parseInt(q);
    	uarter*=25;
        // Calculate how much money the user has and save it in a double variable 
    	int total = ickel + ime + uarter;
        // Tell the user how much money they have
    	JOptionPane.showMessageDialog(null, "You have " +total +" cents!");
    }
}