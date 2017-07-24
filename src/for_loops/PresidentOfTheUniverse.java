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
			if(mun == "Dwayne Johnson"){
				dj++;
				System.out.println(dj);
			}
			if(mun == "Bill Nye"){
				bn++;
				System.out.println(bn);
			}
		}
		if(bn > dj){
			System.out.println("Bill Nye wins!");
		}
		if(dj > bn){
			System.out.println("Dwanye Johnson wins!");
		}
	}
}
