import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
JFrame frame = new JFrame();
JLabel label = new JLabel();
Character currentLetter;

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
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	if(e.getKeyChar()==currentLetter) {
		System.out.println("Correct");
		label.setBackground(Color.GREEN);
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

