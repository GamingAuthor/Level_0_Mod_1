package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
		String ry = "flying";
		String nic = "having ideas";
		String joe = "traveling through time";
		String dave = "putting love in people's hearts";
        // 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("Whose superpower do you want to know?");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
		if(name.equals("Ryland")){
			JOptionPane.showMessageDialog(null, "Ryland's superpower is " +ry);
		}
		if(name.equals("Nicholas")){
			JOptionPane.showMessageDialog(null, "Nicholas's superpower is " +nic);
		}
		if(name.equals("Joseph")){
			JOptionPane.showMessageDialog(null, "Joseph's superpower is " +joe);
		}
		if(name.equals("Dave")){
			JOptionPane.showMessageDialog(null, "Dave's superpower is " +dave);
		}
    }
}