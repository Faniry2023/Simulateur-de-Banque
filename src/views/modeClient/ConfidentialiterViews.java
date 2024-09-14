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

import controller.client.ConfidentialiterController;

public class ConfidentialiterViews extends JFrame{
	public JTextField textFieldEmail;
	public JPasswordField passwordFieldAncient;
	public JPasswordField passwordFieldNv;
	public JPasswordField passwordFieldConfirme;
	public JButton btnValider;
	public JButton btnAnnuler;
	public JTextField textFieldCompte;
	public JLabel lblIncorrect;
	public ConfidentialiterViews() {
		getContentPane().setBackground(new Color(0, 0, 0));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Confidentialité et sécurité");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 125, SpringLayout.WEST, getContentPane());
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mot de passe actuel :");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 182, SpringLayout.WEST, getContentPane());
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nouveau mot de passe :");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1_1, 169, SpringLayout.WEST, getContentPane());
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Confirmer nouveau mot de passe :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_1, 298, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1_1_1, 142, SpringLayout.WEST, getContentPane());
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("nouveau compte e_mail :");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1_1_1_1, 0, SpringLayout.WEST, lblNewLabel_1_1);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		textFieldEmail = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1_1_1_1, -6, SpringLayout.NORTH, textFieldEmail);
		textFieldEmail.setForeground(Color.WHITE);
		textFieldEmail.setBackground(Color.DARK_GRAY);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldEmail, 139, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textFieldEmail, -299, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 17, SpringLayout.SOUTH, textFieldEmail);
		springLayout.putConstraint(SpringLayout.WEST, textFieldEmail, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, textFieldEmail, 0, SpringLayout.EAST, lblNewLabel);
		getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		passwordFieldAncient = new JPasswordField();
		passwordFieldAncient.setForeground(Color.WHITE);
		passwordFieldAncient.setBackground(Color.DARK_GRAY);
		springLayout.putConstraint(SpringLayout.NORTH, passwordFieldAncient, 2, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, passwordFieldAncient, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, passwordFieldAncient, 25, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, passwordFieldAncient, 0, SpringLayout.EAST, lblNewLabel);
		getContentPane().add(passwordFieldAncient);
		
		passwordFieldNv = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordFieldNv, 269, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, passwordFieldNv, -6, SpringLayout.NORTH, lblNewLabel_1_1_1);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1_1, -6, SpringLayout.NORTH, passwordFieldNv);
		springLayout.putConstraint(SpringLayout.WEST, passwordFieldNv, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, passwordFieldNv, 0, SpringLayout.EAST, lblNewLabel);
		passwordFieldNv.setForeground(Color.WHITE);
		passwordFieldNv.setBackground(Color.DARK_GRAY);
		getContentPane().add(passwordFieldNv);
		
		passwordFieldConfirme = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordFieldConfirme, 6, SpringLayout.SOUTH, lblNewLabel_1_1_1);
		springLayout.putConstraint(SpringLayout.WEST, passwordFieldConfirme, -218, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, passwordFieldConfirme, 29, SpringLayout.SOUTH, lblNewLabel_1_1_1);
		springLayout.putConstraint(SpringLayout.EAST, passwordFieldConfirme, 0, SpringLayout.EAST, lblNewLabel);
		passwordFieldConfirme.setForeground(Color.WHITE);
		passwordFieldConfirme.setBackground(Color.DARK_GRAY);
		getContentPane().add(passwordFieldConfirme);
		
		btnValider = new JButton("");
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\valid.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnValider.setIcon(scalVr);
		btnValider.setBackground(Color.BLACK);
		springLayout.putConstraint(SpringLayout.NORTH, btnValider, -70, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnValider, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnValider, -21, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnValider, 187, SpringLayout.WEST, getContentPane());
		getContentPane().add(btnValider);
		
		btnAnnuler = new JButton("");
		ImageIcon icone1 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\annu_clo.png");
		Image imaIcc1 = icone1.getImage();
		Image imscall1 = imaIcc1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr1 = new ImageIcon(imscall1);
		btnAnnuler.setIcon(scalVr1);
		btnAnnuler.setBackground(Color.BLACK);
		springLayout.putConstraint(SpringLayout.NORTH, btnAnnuler, 0, SpringLayout.NORTH, btnValider);
		springLayout.putConstraint(SpringLayout.WEST, btnAnnuler, -62, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAnnuler, 0, SpringLayout.SOUTH, btnValider);
		springLayout.putConstraint(SpringLayout.EAST, btnAnnuler, 0, SpringLayout.EAST, lblNewLabel);
		getContentPane().add(btnAnnuler);
		
		textFieldCompte = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, textFieldCompte, -17, SpringLayout.NORTH, lblNewLabel_1_1_1_1);
		textFieldCompte.setEditable(false);
		textFieldCompte.setForeground(Color.GREEN);
		textFieldCompte.setBackground(Color.LIGHT_GRAY);
		springLayout.putConstraint(SpringLayout.WEST, textFieldCompte, 0, SpringLayout.WEST, lblNewLabel_1);
		getContentPane().add(textFieldCompte);
		textFieldCompte.setColumns(10);
		
		lblIncorrect = new JLabel("");
		lblIncorrect.setForeground(Color.RED);
		springLayout.putConstraint(SpringLayout.NORTH, lblIncorrect, 6, SpringLayout.SOUTH, passwordFieldAncient);
		springLayout.putConstraint(SpringLayout.WEST, lblIncorrect, 125, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblIncorrect, 20, SpringLayout.SOUTH, passwordFieldAncient);
		springLayout.putConstraint(SpringLayout.EAST, lblIncorrect, 0, SpringLayout.EAST, lblNewLabel);
		getContentPane().add(lblIncorrect);
		this.init();
	}
	public void init() {
		ConfidentialiterController c = new ConfidentialiterController(this);
		btnValider.addActionListener(c);
		btnAnnuler.addActionListener(c);
	}
}
