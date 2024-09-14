package views;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SpringLayout;

import controller.BienvenueController;
import panel.ChargementPanel;
import pointEntrer.FenetreViews;

public class BienvenueViews extends JFrame{
	public JButton btnClient;
	public JButton btnGestionnaire;
	public JButton btnQuitter;
	public Thread temps;
	public Thread temps_2;
	public BienvenueViews() {
		
		ChargementPanel pan = new ChargementPanel();
		this.setContentPane(pan);
		getContentPane().setBackground(new Color(0, 0, 64));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 20, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 421, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -170, SpringLayout.EAST, getContentPane());
		lblNewLabel.setIcon(new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\logoBank.png"));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenue");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 25, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 310, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 89, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -326, SpringLayout.EAST, getContentPane());
		lblNewLabel_1.setFont(new Font("MingLiU-ExtB", Font.ITALIC, 30));
		lblNewLabel_1.setForeground(Color.WHITE);
		getContentPane().add(lblNewLabel_1);
		
		btnClient = new JButton("Mode Client");
		btnClient.setBackground(Color.DARK_GRAY);
		btnClient.setForeground(Color.WHITE);
		btnClient.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		springLayout.putConstraint(SpringLayout.NORTH, btnClient, 36, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, btnClient, 25, SpringLayout.WEST, lblNewLabel_1);
		getContentPane().add(btnClient);
		
		btnGestionnaire = new JButton("Mode Gestionnaire");
		btnGestionnaire.setBackground(Color.DARK_GRAY);
		btnGestionnaire.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 13));
		btnGestionnaire.setForeground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, btnGestionnaire, 26, SpringLayout.SOUTH, btnClient);
		springLayout.putConstraint(SpringLayout.EAST, btnGestionnaire, 22, SpringLayout.EAST, btnClient);
		getContentPane().add(btnGestionnaire);
		
		btnQuitter = new JButton("Quitter");
		springLayout.putConstraint(SpringLayout.WEST, btnQuitter, 357, SpringLayout.WEST, pan);
		springLayout.putConstraint(SpringLayout.SOUTH, btnQuitter, -10, SpringLayout.SOUTH, pan);
		btnQuitter.setBackground(Color.RED);
		btnQuitter.setForeground(new Color(255, 255, 255));
		pan.add(btnQuitter);
		
		this.redirection();
	}
	
	public void redirection() {
		BienvenueController controlle = new BienvenueController(this);
		btnClient.addActionListener(controlle);
		btnGestionnaire.addActionListener(controlle);
		btnQuitter.addActionListener(controlle);
	}
}
