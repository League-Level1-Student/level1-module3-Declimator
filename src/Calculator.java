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
	add.setBackground(Color.RED);
	add.setOpaque(true);
	subtract = new JButton();
	subtract.setText("subtract");
	subtract.setBackground(Color.ORANGE);
	subtract.setOpaque(true);
	multiply = new JButton();
	multiply.setText("multiply");
	multiply.setBackground(Color.YELLOW);
	multiply.setOpaque(true);
	divide = new JButton();
	divide.setText("divide");
	divide.setBackground(Color.GREEN);
	divide.setOpaque(true);
	modulo = new JButton();
	modulo.setText("modulo");
	modulo.setBackground(Color.CYAN);
	modulo.setOpaque(true);
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
	Double numx = Double.parseDouble(x);
	Double numy = Double.parseDouble(y);
	if(buttonclicked==add) {
	Double sum = numx+numy;

		answer.setText(sum.toString());
	}
	else if(buttonclicked==subtract) {
		Double difference = numx-numy;
		answer.setText(difference.toString());
	}
	else if(buttonclicked==multiply) {
		Double product = numx*numy;
		answer.setText(product.toString());
	}
	else if(buttonclicked==divide) {
		Double quotient = numx/numy;
		answer.setText(quotient.toString());
	}
	else {
		Double  modulo = numx%numy;
		answer.setText(modulo.toString());
	}
}
}
