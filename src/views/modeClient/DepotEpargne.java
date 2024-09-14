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

import controller.client.DepotEpargneController;

public class DepotEpargne extends JFrame{
	private JTextField textField;
	public JTextField textFieldCompte;
	public JTextField textFieldDepot;
	public JPasswordField passwordField;
	public JLabel lblMdpIncorrect;
	public JButton btnValider;
	public JButton btnAnnuler;
	public DepotEpargne() {
		getContentPane().setBackground(Color.DARK_GRAY);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, textField, -178, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField, -125, SpringLayout.EAST, getContentPane());
		textField.setText("        DEPOT");
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setEditable(false);
		textField.setColumns(10);
		getContentPane().add(textField);
		
		textFieldCompte = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldCompte, 6, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, textFieldCompte, 159, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textFieldCompte, 216, SpringLayout.WEST, getContentPane());
		textFieldCompte.setForeground(Color.GREEN);
		textFieldCompte.setEditable(false);
		textFieldCompte.setColumns(10);
		textFieldCompte.setBackground(Color.BLACK);
		getContentPane().add(textFieldCompte);
		
		JLabel lblNewLabel = new JLabel("Depot de :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 38, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -250, SpringLayout.EAST, getContentPane());
		lblNewLabel.setForeground(Color.WHITE);
		getContentPane().add(lblNewLabel);
		
		textFieldDepot = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldDepot, -3, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, textFieldDepot, 13, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, textFieldDepot, 0, SpringLayout.EAST, textField);
		textFieldDepot.setColumns(10);
		getContentPane().add(textFieldDepot);
		
		JLabel lblAr = new JLabel("Ar");
		springLayout.putConstraint(SpringLayout.WEST, lblAr, 6, SpringLayout.EAST, textFieldDepot);
		springLayout.putConstraint(SpringLayout.SOUTH, lblAr, 0, SpringLayout.SOUTH, lblNewLabel);
		lblAr.setForeground(Color.WHITE);
		getContentPane().add(lblAr);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		springLayout.putConstraint(SpringLayout.NORTH, lblMotDePasse, 21, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblMotDePasse, 0, SpringLayout.EAST, lblNewLabel);
		lblMotDePasse.setForeground(Color.WHITE);
		getContentPane().add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.WEST, textFieldDepot);
		springLayout.putConstraint(SpringLayout.SOUTH, passwordField, 0, SpringLayout.SOUTH, lblMotDePasse);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, textField);
		getContentPane().add(passwordField);
		
		lblMdpIncorrect = new JLabel("");
		lblMdpIncorrect.setForeground(Color.RED);
		springLayout.putConstraint(SpringLayout.NORTH, lblMdpIncorrect, 4, SpringLayout.SOUTH, passwordField);
		springLayout.putConstraint(SpringLayout.WEST, lblMdpIncorrect, 0, SpringLayout.WEST, textFieldDepot);
		springLayout.putConstraint(SpringLayout.EAST, lblMdpIncorrect, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblMdpIncorrect);
		
		btnValider = new JButton("");
		btnValider.setBackground(Color.DARK_GRAY);
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\valid.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnValider.setIcon(scalVr);
		springLayout.putConstraint(SpringLayout.NORTH, btnValider, -65, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnValider, -57, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnValider, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnValider, 0, SpringLayout.EAST, lblNewLabel);
		getContentPane().add(btnValider);
		
		btnAnnuler = new JButton("");
		btnAnnuler.setBackground(Color.DARK_GRAY);
		ImageIcon icone1 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\annu_clo.png");
		Image imaIcc1 = icone1.getImage();
		Image imscall1 = imaIcc1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr1 = new ImageIcon(imscall1);
		btnAnnuler.setIcon(scalVr1);
		springLayout.putConstraint(SpringLayout.NORTH, btnAnnuler, 0, SpringLayout.NORTH, btnValider);
		springLayout.putConstraint(SpringLayout.WEST, btnAnnuler, -57, SpringLayout.EAST, lblAr);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAnnuler, 0, SpringLayout.SOUTH, btnValider);
		springLayout.putConstraint(SpringLayout.EAST, btnAnnuler, 0, SpringLayout.EAST, lblAr);
		getContentPane().add(btnAnnuler);
		this.init();
		
	}
	public void init() {
		DepotEpargneController c = new DepotEpargneController(this);
		btnValider.addActionListener(c);
		btnAnnuler.addActionListener(c);
	}
}
