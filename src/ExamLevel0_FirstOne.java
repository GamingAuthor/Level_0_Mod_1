import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class ExamLevel0_FirstOne {

	public static void main(String[] args){
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw in?");
		Robot rob = new Robot();
		rob.penDown();
		rob.setPenWidth(10);
		rob.setSpeed(1000);
		if(color.equals("Yellow")){
			rob.setPenColor(255, 0, 0);
		}else if(color.equals("Blue")){
			rob.setPenColor(0, 0, 255);
		}
		for(int i = 0; i < 4; i++){
			rob.move(500);
			rob.turn(90);
		}
	}
}
