

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("What is your age?");
	int answer = Integer.parseInt(a);
	int bornin = 2017-answer;
	JOptionPane.showMessageDialog(null, "You were born in "+ bornin + ". I think.");
	if(answer>30) {
		JOptionPane.showMessageDialog(null, "Also, you are way too old to play this game.");
	}
}
}



