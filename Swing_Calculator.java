import javax.swing.*;
import java.awt.event.*;

public class Swing_Calculator implements ActionListener 
{
	JTextField t1, t2, t3;
	JButton b1, b2, b3, b4;
	JLabel label1, label2, label3;
	
	Swing_Calculator() 
	{	
	JFrame frame = new JFrame("Calculator"); // Creates an object of the JFrame.
	
	label1 = new JLabel("Enter 1st no:");
	label1.setBounds(50, 30, 100, 10); // Sets the following: x axis, y axis, width, height
	frame.add(label1); // Adds label to the frame.
	
	t1 = new JTextField();
	t1.setBounds(50, 50, 150, 20); // Sets the following: x axis, y axis, width, height 
	frame.add(t1); // Adds text field to the frame.
	
	label2 = new JLabel("Enter 2nd no:");
	label2.setBounds(50, 75, 150, 20); // Sets the following: x axis, y axis, width, height
	frame.add(label2); // Adds label to the frame.
	
	t2 = new JTextField();
	t2.setBounds(50, 100, 150, 20); // Sets the following: x axis, y axis, width, height 
	frame.add(t2); // Adds text field to the frame.
	
	label3 = new JLabel("Answer:");
	label3.setBounds(50, 100, 150, 75); // Sets the following: x axis, y axis, width, height
	frame.add(label3); // Adds label to the frame.
	
	t3 = new JTextField();
	t3.setBounds(50, 150, 150, 20); // Sets the following: x axis, y axis, width, height 
	t3.setEditable(false);
	frame.add(t3); // Adds text field to the frame.
	
	
	b1 = new JButton("+");
	b1.setBounds(50, 200, 50, 50); // Sets the following: x axis, y axis, width, height 
	b1.addActionListener(this);
	frame.add(b1); // Adds button to the frame.
	
	b2 = new JButton("-");
	b2.setBounds(120, 200, 50, 50); // Sets the following: x axis, y axis, width, height 
	b2.addActionListener(this);
	frame.add(b2); // Adds button to the frame.
	
	b3 = new JButton("*");
	b3.setBounds(190, 200, 50, 50); // Sets the following: x axis, y axis, width, height 
	b3.addActionListener(this);
	frame.add(b3); // Adds button to the frame.
	
	b4 = new JButton("/");
	b4.setBounds(260, 200, 50, 50); // Sets the following: x axis, y axis, width, height 
	b4.addActionListener(this);
	frame.add(b4); // Adds button to the frame.
	
	 
	frame.setSize(375, 320); // Sets the width & height of the frame.
	frame.setLayout(null); // Sets the layout of the components in the frame.
	frame.setVisible(true); // Sets the frame visible
	}
	
	public void actionPerformed(ActionEvent act) 
	{
	String line1 = t1.getText();
	String line2 = t2.getText();
	
	double n1 = Double.parseDouble(line1);
	double n2 = Double.parseDouble(line2);
	double n3 = 0;
	
	if (act.getSource() == b1) { n3 = n1 + n2; }
	else if (act.getSource() == b2) { n3 = n1 - n2; }
	else if (act.getSource() == b3) { n3 = n1 * n2; }
	else if (act.getSource() == b4) { n3 = n1 / n2; }
	
	String output = String.valueOf(n3);
	t3.setText(output);
	}

	public static void main(String[] args) { new Swing_Calculator(); }

}

