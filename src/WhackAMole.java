import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	int r;
	int t;
	int l;
	Date timeAtStart;
public static void main(String[] args) {
	WhackAMole w = new WhackAMole();

}
public WhackAMole(){
	frame = new JFrame();
	panel = new JPanel();


panel.setPreferredSize(new Dimension(300,300));

drawButtons(new Random().nextInt(24)+1);
}
public void drawButtons(int random) {
	panel.setPreferredSize(new Dimension(300,300));

	frame.setVisible(true);
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	for(int i=1;i<25;i++) {
		JButton button = new JButton();
		panel.add(button);
		if(i==random) {
			button.setText("mole");
		}
		button.addActionListener(this);
	}
	frame.pack();
	timeAtStart = new Date();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
JButton b = (JButton)e.getSource();
if(b.getText().equals("mole")) {
	t++;
playSound("molesound.wav");
}
else {
	speak("You Missed");
	l++;
}
if(t==10) {
	endGame(timeAtStart,t);
}
else if(l==5) {
	JOptionPane.showMessageDialog(null, "You Lost");
	endGame(timeAtStart, t);
}
frame.dispose();
panel.removeAll();
drawButtons(new Random().nextInt(24)+1);
}
void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e1) {
         e1.printStackTrace();
    }
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
    
}
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 100.00 / molesWhacked)
         + " moles per second.");
}

}
