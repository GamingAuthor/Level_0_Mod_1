package variables_and_conditionals;

import javax.swing.JOptionPane;

public class TestScorer {
    public static void main(String[] args) {
    	String f = JOptionPane.showInputDialog("What percent between 0 and 100 did you get on a recent test?");
    	int fail = Integer.parseInt(f);
    	if(fail > 96 && fail < 101){
    		JOptionPane.showMessageDialog(null, "Congratulations! You got an A+!");
    	}
    	if(fail > 92 && fail < 97){
    		JOptionPane.showMessageDialog(null, "Congrats! You got an A!");
    	}
    	if(fail > 89 && fail < 93){
    		JOptionPane.showMessageDialog(null, "Awesome! You got an A-!");
    	}
    	if(fail > 86 && fail < 90){
    		JOptionPane.showMessageDialog(null, "Nice! You got a B+!");
    	}
    	if(fail > 82 && fail < 87){
    		JOptionPane.showMessageDialog(null, "Alright! You got a B!");
    	}
    	if(fail > 79 && fail < 83){
    		JOptionPane.showMessageDialog(null, "Ok! You got a B-!");
    	}
    	if(fail > 76 && fail < 80){
    		JOptionPane.showMessageDialog(null, "You got a C+.");
    	}
    	if(fail > 72 && fail < 77){
    		JOptionPane.showMessageDialog(null, "You got a C.");
    	}
    	if(fail > 69 && fail < 73){
    		JOptionPane.showMessageDialog(null, "You got a C-.");
    	}
    	if(fail > 66 && fail < 70){
    		JOptionPane.showMessageDialog(null, "Oh, you got a D+.");
    	}
    	if(fail > 62 && fail < 67){
    		JOptionPane.showMessageDialog(null, "Uh, you got a D.");
    	}
    	if(fail > 59 && fail < 63){
    		JOptionPane.showMessageDialog(null, "Um, you got a D-.");
    	}
    	if(fail <= 59){
    		JOptionPane.showMessageDialog(null, "Uh oh, you got an F.");
    	}
    }
}
