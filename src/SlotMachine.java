import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SlotMachine implements ActionListener {
JFrame frame;
JPanel panel;
JButton spin;
JLabel labelone;
JLabel labeltwo;
JLabel labelthree;
int random;
String one;
String two;
String three;
Integer score;
JLabel scoredisplay;
public static void main(String[] args) {
	SlotMachine x = new SlotMachine();
}
public SlotMachine() {
	score=0;
	frame = new JFrame();
	scoredisplay = new JLabel();
	scoredisplay.setText("SCORE " + score.toString());
	panel = new JPanel();
	spin = new JButton();
	labelone = new JLabel();
	labelone.setPreferredSize(new Dimension(200, 200));
	labeltwo = new JLabel();
	labelthree = new JLabel();
	spin.addActionListener(this);
	spin.setText("SPIN");
	frame.add(panel);
	panel.add(scoredisplay);
	panel.add(labelone);
	panel.add(labeltwo);
	panel.add(labelthree);
	panel.add(spin);
	frame.setVisible(true);
	frame.setSize(500, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	random = new Random().nextInt(3)+1;
	if(random==1) {
		try {
			labelone.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("horseshoe.png"))));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		one = "horseshoe";
		frame.pack();
	}
	else if(random==2) {
		try {
			labelone.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("seven.png"))));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		one = "seven";
		frame.pack();
	}
	else {
		try {
			labelone.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("Cherry.png"))));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		one = "Cherry";
		frame.pack();
	}
	/////////////////////////////////////////////////////////////
	random = new Random().nextInt(3)+1;
	if(random==1) {
		try {
			labeltwo.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("horseshoe.png"))));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		two = "horseshoe";
		frame.pack();
	}
	else if(random==2) {
		try {
			labeltwo.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("seven.png"))));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		two = "seven";
		frame.pack();
	}
	else {
		try {
			labeltwo.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("Cherry.png"))));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		two = "Cherry";
		frame.pack();
	}
	///////////////////////////////////////////////////////////
	random = new Random().nextInt(3)+1;
	if(random==1) {
		try {
			labelthree.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("horseshoe.png"))));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		three = "horseshoe";
		frame.pack();
	}
	else if(random==2) {
		try {
			labelthree.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("seven.png"))));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		three = "seven";
		frame.pack();
	}
	else {
		try {
			labelthree.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("Cherry.png"))));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		three = "Cherry";
		frame.pack();
	}
	if(one.equals("horseshoe") && two.equals("horseshoe") && three.equals("horseshoe")) {
		JOptionPane.showMessageDialog(null, "YOU WIN");
		score++;
		scoredisplay.setText(score.toString());
	}
	else if(one.equals("seven") && two.equals("seven") && three.equals("seven")) {
		JOptionPane.showMessageDialog(null, "YOU WIN");
		score++;
		scoredisplay.setText(score.toString());
	}
	else if(one.equals("Cherry") && two.equals("Cherry") && three.equals("Cherry")) {
		JOptionPane.showMessageDialog(null, "YOU WIN");
		score++;
		scoredisplay.setText(score.toString());
	}
}
}
