package views.modeGestionnaire;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

import controller.gestionnaire.ImController;

public class ImageViews extends JFrame{
	public JButton btnFermer;
	public JLabel lblImage;
	public ImageViews() {
		getContentPane().setBackground(Color.BLACK);
		setBackground(Color.BLACK);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		btnFermer = new JButton("Fermer");
		springLayout.putConstraint(SpringLayout.WEST, btnFermer, 136, SpringLayout.WEST, getContentPane());
		getContentPane().add(btnFermer);
		
		lblImage = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblImage, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblImage, -39, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnFermer, 6, SpringLayout.SOUTH, lblImage);
		springLayout.putConstraint(SpringLayout.WEST, lblImage, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblImage, 474, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblImage);
		this.init();
	}
	public void init() {
		ImController c = new ImController(this);
		btnFermer.addActionListener(c);
	}
}
