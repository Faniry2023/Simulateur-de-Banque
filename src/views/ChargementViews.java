package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SpringLayout;

import panel.ChargementPanel;

public class ChargementViews extends JFrame{
	public JLabel lblchiffer;
	public JLabel lblcharger;
	public JProgressBar progressBar;
	public ChargementViews() {
		getContentPane().setBackground(Color.BLACK);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 128, 64));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 120, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 224, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 403, SpringLayout.WEST, getContentPane());
		ImageIcon icon = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\logoBank.png");
		Image img = icon.getImage();
		Image imsc = img.getScaledInstance(350, 620, Image.SCALE_SMOOTH);
		ImageIcon im = new ImageIcon(imsc);
		lblNewLabel.setIcon(im);
		getContentPane().add(lblNewLabel);
		
		progressBar = new JProgressBar();
		progressBar.setBackground(new Color(0, 0, 255));
		springLayout.putConstraint(SpringLayout.WEST, progressBar, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar, 0, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, progressBar, 584, SpringLayout.WEST, getContentPane());
		getContentPane().add(progressBar);
		
		lblcharger = new JLabel("");
		lblcharger.setFont(new Font("Sitka Text", Font.ITALIC, 12));
		lblcharger.setForeground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.WEST, lblcharger, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblcharger, -6, SpringLayout.NORTH, progressBar);
		getContentPane().add(lblcharger);
		
		lblchiffer = new JLabel("");
		springLayout.putConstraint(SpringLayout.SOUTH, lblchiffer, -6, SpringLayout.NORTH, progressBar);
		springLayout.putConstraint(SpringLayout.EAST, lblchiffer, -10, SpringLayout.EAST, getContentPane());
		lblchiffer.setForeground(Color.WHITE);
		lblchiffer.setFont(new Font("Stencil", Font.PLAIN, 14));
		getContentPane().add(lblchiffer);
	}
}
