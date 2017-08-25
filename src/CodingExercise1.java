import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {
	
    public static void main(String[] args) {
    	 Robot john = new Robot();
    	 john.setSpeed(9000);
       	 john.penDown();
   	 // 3. ask the user what color they would like the Robot to draw
String answer = JOptionPane.showInputDialog("What colour would you like john the robot to draw in? Your choices are limited, so...");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
if(answer.equals("red")) {
	john.setPenColor(255,0,0);
}else if(answer.equalsIgnoreCase("blue")) {
	john.setPenColor(0, 0, 255);
}else if(answer.equalsIgnoreCase("green")) {
	john.setPenColor(0, 255, 0);
}else if(answer.equalsIgnoreCase("purple")) {
	john.setPenColor(100, 5, 100);
}else if(answer.equalsIgnoreCase("teal")) {
	john.setPenColor(0, 255, 255);
}else if(answer.equalsIgnoreCase("orange")) {
	john.setPenColor(250, 80, 0);
}else if(answer.equalsIgnoreCase("surprise color")) {
	john.setPenColor(10, 180, 210);
}else if(answer.equalsIgnoreCase("yellow")) {
	john.setPenColor(255, 255, 0);
}else if(answer.equalsIgnoreCase("pink")) {
	john.setPenColor(255, 55, 214);
}else if(answer.equalsIgnoreCase("lime")) {
	john.setPenColor(158, 255, 54);
}else if(answer.equalsIgnoreCase("salmon")) {
	john.setPenColor(255, 165, 163);
}

   	 // 2. set the pen width to 10
    	john.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   	 for (int i = 0; i < 4; i++) {
   		 john.move(100);
   		 john.turn(90);
		
	}
    }

}
