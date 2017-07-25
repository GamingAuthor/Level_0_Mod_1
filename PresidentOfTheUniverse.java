package for_loops;

import javax.swing.JOptionPane;

public class PresidentOfTheUniverse {
	public static void main(String[] args) {
		int dj = 0;
		int bn = 0;
		String num = JOptionPane.showInputDialog("Dwanye Johnson and Bill Nye are running for president of the universe. How many people will be voting to determine who wins? Put in a number.");
		int n = Integer.parseInt(num);
		for(int i = n; i > 0; i--){
			String mun = JOptionPane.showInputDialog("Dwanye Johnson or Bill Nye?");
			if(mun.equals("Dwayne Johnson")){
				dj++;
			}
			if(mun.equals("Bill Nye")){
				bn++;
			}
		}
		
		if(bn > dj){
			JOptionPane.showMessageDialog(null, "Bill Nye wins!");
		}
		if(dj > bn){
			JOptionPane.showMessageDialog(null, "Dwayne Johnson wins!");
		}
		if (dj == bn){
			JOptionPane.showMessageDialog(null, "They tied!");
		}
	}
}
