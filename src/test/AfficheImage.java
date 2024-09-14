package test;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class AfficheImage extends JFrame{
	public JLabel lblNewLabel;
	public AfficheImage() {
		getContentPane().setBackground(new Color(0, 0, 0));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,600);
		this.setLocationRelativeTo(null);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		lblNewLabel = new JLabel("New label");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 395, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 474, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblNewLabel);
		this.setVisible(true);
	}

}
