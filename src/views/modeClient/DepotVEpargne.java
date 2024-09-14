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

import controller.client.DepotVEpargneController;

public class DepotVEpargne extends JFrame{
	private JTextField txtCetteDepotSera;
	public JTextField textFieldCompte;
	public JTextField textFieldDepot;
	private JLabel lblMotDePasse;
	public JPasswordField passwordField;
	public JButton btnAnnuler;
	public JButton btnValider;
	public JLabel lblIncorrecte;
	public DepotVEpargne() {
		getContentPane().setBackground(Color.DARK_GRAY);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		txtCetteDepotSera = new JTextField();
		txtCetteDepotSera.setBackground(Color.DARK_GRAY);
		springLayout.putConstraint(SpringLayout.NORTH, txtCetteDepotSera, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtCetteDepotSera, 36, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtCetteDepotSera, -34, SpringLayout.EAST, getContentPane());
		txtCetteDepotSera.setText("Cette depot sera retirer de votre compte Epargne");
		txtCetteDepotSera.setForeground(Color.WHITE);
		txtCetteDepotSera.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCetteDepotSera.setEditable(false);
		txtCetteDepotSera.setColumns(10);
		getContentPane().add(txtCetteDepotSera);
		
		textFieldCompte = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldCompte, 6, SpringLayout.SOUTH, txtCetteDepotSera);
		springLayout.putConstraint(SpringLayout.WEST, textFieldCompte, 143, SpringLayout.WEST, getContentPane());
		textFieldCompte.setForeground(Color.GREEN);
		textFieldCompte.setEditable(false);
		textFieldCompte.setColumns(10);
		textFieldCompte.setBackground(Color.BLACK);
		getContentPane().add(textFieldCompte);
		
		JLabel lblNewLabel = new JLabel("Depot de :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 50, SpringLayout.SOUTH, txtCetteDepotSera);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 75, SpringLayout.WEST, getContentPane());
		lblNewLabel.setForeground(Color.WHITE);
		getContentPane().add(lblNewLabel);
		
		textFieldDepot = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldDepot, 18, SpringLayout.SOUTH, textFieldCompte);
		springLayout.putConstraint(SpringLayout.WEST, textFieldDepot, 17, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, textFieldDepot, 146, SpringLayout.EAST, lblNewLabel);
		getContentPane().add(textFieldDepot);
		textFieldDepot.setColumns(10);
		
		lblMotDePasse = new JLabel("Mot de passe :");
		springLayout.putConstraint(SpringLayout.NORTH, lblMotDePasse, 23, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblMotDePasse, 0, SpringLayout.EAST, lblNewLabel);
		lblMotDePasse.setForeground(Color.WHITE);
		getContentPane().add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 17, SpringLayout.SOUTH, textFieldDepot);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.WEST, textFieldCompte);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, textFieldDepot);
		getContentPane().add(passwordField);
		
		btnValider = new JButton("");
		btnValider.setBackground(Color.DARK_GRAY);
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\valid.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnValider.setIcon(scalVr);
		springLayout.putConstraint(SpringLayout.NORTH, btnValider, 36, SpringLayout.SOUTH, lblMotDePasse);
		springLayout.putConstraint(SpringLayout.WEST, btnValider, 106, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnValider, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnValider, 31, SpringLayout.EAST, lblMotDePasse);
		getContentPane().add(btnValider);
		
		btnAnnuler = new JButton("");
		btnAnnuler.setBackground(Color.DARK_GRAY);
		ImageIcon icone1 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\annu_clo.png");
		Image imaIcc1 = icone1.getImage();
		Image imscall1 = imaIcc1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr1 = new ImageIcon(imscall1);
		btnAnnuler.setIcon(scalVr1);
		springLayout.putConstraint(SpringLayout.NORTH, btnAnnuler, 0, SpringLayout.NORTH, btnValider);
		springLayout.putConstraint(SpringLayout.WEST, btnAnnuler, 80, SpringLayout.EAST, btnValider);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAnnuler, 0, SpringLayout.SOUTH, btnValider);
		springLayout.putConstraint(SpringLayout.EAST, btnAnnuler, 131, SpringLayout.EAST, btnValider);
		getContentPane().add(btnAnnuler);
		
		lblIncorrecte = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblIncorrecte, 6, SpringLayout.SOUTH, passwordField);
		springLayout.putConstraint(SpringLayout.WEST, lblIncorrecte, 40, SpringLayout.WEST, btnValider);
		springLayout.putConstraint(SpringLayout.EAST, lblIncorrecte, 0, SpringLayout.EAST, txtCetteDepotSera);
		lblIncorrecte.setForeground(Color.RED);
		getContentPane().add(lblIncorrecte);
		this.init();
	}
public void init() {
	DepotVEpargneController c = new DepotVEpargneController(this);
	btnValider.addActionListener(c);
	btnAnnuler.addActionListener(c);
}
}
