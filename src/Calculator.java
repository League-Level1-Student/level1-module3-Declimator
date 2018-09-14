import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame;
	JPanel panel;
	JPanel panel2;
	JPanel panel3;
	JTextField box1;
	JTextField box2;
	JButton add;
	JButton subtract;
	JButton multiply;
	JButton divide;
	JButton modulo;
	JLabel answer;
public static void main(String[] args) {
	Calculator c = new Calculator();
	c.calculator();
}
public void calculator(){

	frame= new JFrame();
	panel = new JPanel();
	panel2 = new JPanel();
	panel3 = new JPanel();
	add = new JButton();
	add.setText("add");
	subtract = new JButton();
	subtract.setText("subtract");
	multiply = new JButton();
	multiply.setText("multiply");
	divide = new JButton();
	divide.setText("divide");
	modulo = new JButton();
	modulo.setText("modulo");
	answer = new JLabel();
	Font aFont = new Font("Ariel", Font.PLAIN, 40);
	answer.setFont(aFont);
	answer.setBackground(Color.CYAN);
	answer.setOpaque(true);
	box1 = new JTextField(15);
	box2 = new JTextField(15);
	frame.setVisible(true);
	frame.setSize(500, 200);
	frame.setLayout(new BorderLayout());
	frame.add(panel, BorderLayout.NORTH);
	frame.add(panel2, BorderLayout.CENTER);
	frame.add(panel3,  BorderLayout.SOUTH);
	panel.add(box1);
	panel.add(box2);
	panel2.add(add);
	add.addActionListener(this);
	panel2.add(subtract);
	subtract.addActionListener(this);
	panel2.add(multiply);
	multiply.addActionListener(this);
	panel2.add(divide);
	divide.addActionListener(this);
	panel2.add(modulo);
	modulo.addActionListener(this);
	panel3.add(answer);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonclicked = (JButton) e.getSource();
	String x = box1.getText();
	String y = box2.getText();
	int numx = Integer.parseInt(x);
	int numy = Integer.parseInt(y);
	if(buttonclicked==add) {
	Integer sum = numx+numy;

		answer.setText(sum.toString());
	}
	else if(buttonclicked==subtract) {
		
	}
	else if(buttonclicked==multiply) {
		
	}
	else if(buttonclicked==divide) {
		
	}
	else {
		
	}
}
}
