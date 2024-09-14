package views.modeClient;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import controller.client.RetraitEpargneControlle;

public class RetraitEpargneViews extends JFrame{
	public JTextField textFieldCompte;
	public JTextField textFieldRetrait;
	public JLabel lblNewLabel_1;
	public JPasswordField passwordField;
	public JButton btnQuitter;
	public JLabel lblIncorrecte;
	public JButton btnValider;
	public RetraitEpargneViews() {
		getContentPane().setBackground(Color.DARK_GRAY);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("RETRAIT");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 160, SpringLayout.WEST, getContentPane());
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Sitka Text", Font.ITALIC, 14));
		getContentPane().add(lblNewLabel);
		
		textFieldCompte = new JTextField();
		textFieldCompte.setForeground(Color.GREEN);
		textFieldCompte.setBackground(Color.BLACK);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldCompte, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, textFieldCompte, 144, SpringLayout.WEST, getContentPane());
		getContentPane().add(textFieldCompte);
		textFieldCompte.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Retrait de :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 74, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 65, SpringLayout.WEST, getContentPane());
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel_1);
		
		textFieldRetrait = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldRetrait, 16, SpringLayout.SOUTH, textFieldCompte);
		springLayout.putConstraint(SpringLayout.WEST, textFieldRetrait, 14, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, textFieldRetrait, 135, SpringLayout.EAST, lblNewLabel_1);
		getContentPane().add(textFieldRetrait);
		textFieldRetrait.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ar");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 6, SpringLayout.EAST, textFieldRetrait);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 0, SpringLayout.SOUTH, lblNewLabel_1);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mot de passe :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 20, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 20, SpringLayout.SOUTH, textFieldRetrait);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.WEST, textFieldCompte);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, textFieldRetrait);
		getContentPane().add(passwordField);
		
		lblIncorrecte = new JLabel("");
		lblIncorrecte.setForeground(Color.RED);
		springLayout.putConstraint(SpringLayout.NORTH, lblIncorrecte, 2, SpringLayout.SOUTH, passwordField);
		springLayout.putConstraint(SpringLayout.WEST, lblIncorrecte, 0, SpringLayout.WEST, textFieldCompte);
		springLayout.putConstraint(SpringLayout.EAST, lblIncorrecte, -34, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblIncorrecte);
		
		btnValider = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnValider, 12, SpringLayout.SOUTH, lblIncorrecte);
		springLayout.putConstraint(SpringLayout.WEST, btnValider, 0, SpringLayout.WEST, textFieldCompte);
		springLayout.putConstraint(SpringLayout.SOUTH, btnValider, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnValider, 195, SpringLayout.WEST, getContentPane());
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\valid.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnValider.setIcon(scalVr);
		btnValider.setBackground(Color.DARK_GRAY);
		getContentPane().add(btnValider);
		
		btnQuitter = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnQuitter, 0, SpringLayout.NORTH, btnValider);
		springLayout.putConstraint(SpringLayout.WEST, btnQuitter, 19, SpringLayout.EAST, btnValider);
		springLayout.putConstraint(SpringLayout.SOUTH, btnQuitter, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnQuitter, -119, SpringLayout.EAST, getContentPane());
		ImageIcon icone1 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\annu_clo.png");
		Image imaIcc1 = icone1.getImage();
		Image imscall1 = imaIcc1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr1 = new ImageIcon(imscall1);
		btnQuitter.setIcon(scalVr1);
		btnQuitter.setBackground(Color.DARK_GRAY);
		getContentPane().add(btnQuitter);
		this.init();
	}
	public void init() {
		RetraitEpargneControlle c= new RetraitEpargneControlle(this);
		btnValider.addActionListener(c);
		btnQuitter.addActionListener(c);
	}
}
