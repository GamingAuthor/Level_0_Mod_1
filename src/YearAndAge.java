import javax.swing.JOptionPane;
public class YearAndAge {
	public static void main(String[] args){
	String age = JOptionPane.showInputDialog("How old are you?");
	int a = Integer.parseInt(age);
	int y = 2017 - a;
	if(a < 31){
		JOptionPane.showMessageDialog(null, "You were born in " +y);
	}else if(a >= 30){
		JOptionPane.showMessageDialog(null, "You were born in " +y +". Looks like you are too old to play this.");
	}
	}
}
