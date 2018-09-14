import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
JFrame frame = new JFrame();
JLabel label = new JLabel();
Character currentLetter;
int counter;
int correctcounter;
public TypingTutor() {
	frame.setVisible(true);
	frame.add(label);
	label.setOpaque(true);
	currentLetter = generateRandomLetter();
	label.setText(currentLetter.toString());
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.addKeyListener(this);
	frame.pack();
	

}
private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
    Date timeAtEnd = new Date();
    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
    long gameInSeconds = (gameDuration / 1000) % 60;
    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
    int charactersPerMinute = (int) (charactersPerSecond * 60);
    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
}
Date timeAtStart = new Date();
public static void main(String[] args) {
	TypingTutor x = new TypingTutor();




}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(currentLetter.toString());
}
@Override
public void keyPressed(KeyEvent e) {
	counter++;
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	if(counter>=10) {
		showTypingSpeed(correctcounter);
		System.exit(0);
	}
	if(e.getKeyChar()==currentLetter) {
		System.out.println("Correct");
		label.setBackground(Color.GREEN);
		correctcounter++;
	}
	else {
		label.setBackground(Color.RED);
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


}

