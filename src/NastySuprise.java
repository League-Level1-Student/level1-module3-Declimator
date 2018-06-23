import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton buttontwo = new JButton();

	public static void main(String[] args) {
		new NastySuprise().buttons();
	}

	public void buttons() {

		frame.add(panel);
		panel.add(button);
		panel.add(buttontwo);
		frame.setSize(200, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		button.setText("Trick");
		buttontwo.setText("Treat");
		button.addActionListener(this);
		buttontwo.addActionListener(this);

	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			showPictureFromTheInternet("https://media.tenor.com/images/9853f032993b10d0f960051e44156e8b/tenor.gif");
		} else {
			showPictureFromTheInternet("https://i.imgur.com/qlxYwBZ.gif?noredirect");
		}
	}

}
