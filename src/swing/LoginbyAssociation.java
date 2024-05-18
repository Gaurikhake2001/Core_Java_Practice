package swing;

import java.awt.Color; 	

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginbyAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		JLabel l1 = new JLabel("User Id");
		JTextField t1 = new JTextField();
		JLabel l2 = new JLabel("Password");
		JLabel l3 = new JLabel();
		JTextField t2 = new JTextField();
		JButton b1 = new JButton("Submit");
		JButton b2 = new JButton("Reset");
		
		l1.setBounds(10,10,100,40);
		t1.setBounds(120,10,100,40);
		l2.setBounds(10,60,100,40);
		t2.setBounds(120,60,100,40);
		b1.setBounds(30,150,100,40);
		b2.setBounds(160,150,100,40);
		
		f.add(l1); f.add(l2);
		   f.add(t1); f.add(t2);
		   f.add(b1); f.add(b2);
		   f.add(l3);
		   
		   f.setSize(300,300);
		   f.setLayout(null);
		   f.setVisible(true);
		   f.getContentPane().setBackground(Color.YELLOW);

	}

}
