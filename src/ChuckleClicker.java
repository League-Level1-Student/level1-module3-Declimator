import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton punchlinebutton = new JButton();
	JButton jokebutton = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
public static void main(String[] args) {
	ChuckleClicker chuck = new ChuckleClicker();
	chuck.makeButtons();
}

void makeButtons(){

	
	jokebutton.setText("joke");
	
	punchlinebutton.setText("punchline");
	frame.setVisible(true);
	panel.setVisible(true);
	frame.add(panel);
	panel.add(jokebutton);
	panel.add(punchlinebutton);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jokebutton.addActionListener(this);
	punchlinebutton.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==jokebutton) {
		JOptionPane.showMessageDialog(null, "Black within and red without,\n" + 
				"With four corners round about.\n" + 
				"What am I?");
	}
	else if (e.getSource()==punchlinebutton) {
		JOptionPane.showMessageDialog(null, "chimney");
	}
}

}
