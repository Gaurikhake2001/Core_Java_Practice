package swing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub(
		
		JFrame f = new JFrame();
		JLabel l1 = new JLabel("First No:");
		JTextField t1 = new JTextField();
		JLabel l2 = new JLabel("Second No:");
		JTextField t2 = new JTextField();
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		JLabel l3 = new JLabel("Result:");
		JTextField t3 = new JTextField();
		JButton b5 = new JButton("Submit");
		JButton b6 = new JButton("Cancel");
		
		l1.setBounds(10,10,100,40);
		t1.setBounds(120,10,100,40);
		l2.setBounds(10,60,100,40);
		t2.setBounds(120,60,100,40);
		b1.setBounds(20,110,50,50);
		b2.setBounds(80,110,50,50);
		b3.setBounds(140,110,50,50); 
		b4.setBounds(200,110,50,50);
		l3.setBounds(10,160,100,40);
		t3.setBounds(130,170,100,40);
		b5.setBounds(30,220,100,40);
		b6.setBounds(140,220,100,40);
		
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(l3);
		f.add(t3);
		f.add(b5);
		f.add(b6);
		
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.getContentPane().setBackground(Color.YELLOW);

	}

}
