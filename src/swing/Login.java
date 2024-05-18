package swing;

import java.awt.*;
import javax.swing.*;

class Login1 extends JFrame
{
	JLabel l1,l2;
	JTextField t1, t2;
	JButton b1, b2;
	
	Login1()
	{
		l1 = new JLabel("User Id");
		t1 = new JTextField();
		l2 = new JLabel("Password");
		t2 = new JTextField();
		b1 = new JButton("Submit");
		b2 = new JButton("Reset");
		
		l1.setBounds(10,10,100,40);
		t1.setBounds(120,10,100,40);
		l2.setBounds(10,60,100,40);
		t2.setBounds(120,10,100,40);
		b1.setBounds(30,150,100,40);
		b2.setBounds(160,150,100,40);
//		
		
	   l1.add(l1); l2.add(l2);
	   t1.add(t1); t2.add(t2);
	   b1.add(b1); b2.add(b2);
	   
	   setSize(300,300);
	   setVisible(true);
	   setLayout(null);

	
	}
}

public class Login {

	public static void main(String[] args) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		Login1 l = new Login1();

	}

}
