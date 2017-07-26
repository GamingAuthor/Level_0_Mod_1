package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;


public class Magic8Ball {

    // 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

    // 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int r = new Random().nextInt(4);
    // 3. Print out this variable
	System.out.println(r);

    // 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("Put in a yes or no question for the magic 8 ball.");
    // 5. If the random number is 0
	if(r == 0){
		JOptionPane.showMessageDialog(null, "Yes.");
	}
		
    // -- tell the user "Yes"

    // 6. If the random number is 1
	if (r == 1){
		JOptionPane.showMessageDialog(null, "No.");
	}
    // -- tell the user "No"

    // 7. If the random number is 2
	if (r == 2){
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	}
// -- tell the user "Maybe you should ask Google?"
    // 8. If the random number is 3
	if (r == 3){
		JOptionPane.showMessageDialog(null, "You think I know? A little program on a computer? I mean, I claim I'm magic and an 8 ball, but I'm neither! I'm a poser! I don't know anything. Ask a guru or something. Ask anyone else but me! I don't the answer to your questions... I'm gonna go get some java. Bye.");
	}

    // -- write your own answer
}
}
