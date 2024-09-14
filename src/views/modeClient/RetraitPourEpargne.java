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

import controller.client.RetraitPourEpaController;

public class RetraitPourEpargne extends JFrame{
	private JTextField txtCetteRetraitSera;
	public JTextField textFieldCompte;
	public JTextField textFieldRetrait;
	private JLabel lblMotDePasse;
	public JPasswordField passwordField;
	public JButton btnValider;
	public JButton btnAnnuler;
	public JLabel lblIncorrecte;
	public RetraitPourEpargne() {
		getContentPane().setBackground(Color.DARK_GRAY);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		txtCetteRetraitSera = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtCetteRetraitSera, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtCetteRetraitSera, 27, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtCetteRetraitSera, -10, SpringLayout.EAST, getContentPane());
		txtCetteRetraitSera.setText("Cette retrait sera deposer dans votre compte Epargne");
		txtCetteRetraitSera.setForeground(Color.WHITE);
		txtCetteRetraitSera.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCetteRetraitSera.setEditable(false);
		txtCetteRetraitSera.setColumns(10);
		txtCetteRetraitSera.setBackground(Color.DARK_GRAY);
		getContentPane().add(txtCetteRetraitSera);
		
		textFieldCompte = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldCompte, 6, SpringLayout.SOUTH, txtCetteRetraitSera);
		springLayout.putConstraint(SpringLayout.EAST, textFieldCompte, -141, SpringLayout.EAST, getContentPane());
		textFieldCompte.setForeground(Color.GREEN);
		textFieldCompte.setEditable(false);
		textFieldCompte.setColumns(10);
		textFieldCompte.setBackground(Color.BLACK);
		getContentPane().add(textFieldCompte);
		
		JLabel lblRetraitDe = new JLabel("Retrait de :");
		lblRetraitDe.setForeground(Color.WHITE);
		getContentPane().add(lblRetraitDe);
		
		textFieldRetrait = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textFieldRetrait, 161, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textFieldRetrait, -78, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblRetraitDe, 3, SpringLayout.NORTH, textFieldRetrait);
		springLayout.putConstraint(SpringLayout.EAST, lblRetraitDe, -23, SpringLayout.WEST, textFieldRetrait);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldRetrait, 21, SpringLayout.SOUTH, textFieldCompte);
		getContentPane().add(textFieldRetrait);
		textFieldRetrait.setColumns(10);
		
		lblMotDePasse = new JLabel("Mot de passe :");
		springLayout.putConstraint(SpringLayout.NORTH, lblMotDePasse, 23, SpringLayout.SOUTH, lblRetraitDe);
		springLayout.putConstraint(SpringLayout.EAST, lblMotDePasse, 0, SpringLayout.EAST, lblRetraitDe);
		lblMotDePasse.setForeground(Color.WHITE);
		getContentPane().add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 14, SpringLayout.SOUTH, textFieldRetrait);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, -145, SpringLayout.EAST, textFieldRetrait);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, textFieldRetrait);
		getContentPane().add(passwordField);
		
		btnValider = new JButton("");
		btnValider.setBackground(Color.DARK_GRAY);
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\valid.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnValider.setIcon(scalVr);
		springLayout.putConstraint(SpringLayout.WEST, btnValider, 132, SpringLayout.WEST, getContentPane());
		getContentPane().add(btnValider);
		
		btnAnnuler = new JButton("");
		btnAnnuler.setBackground(Color.DARK_GRAY);
		ImageIcon icone1 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\annu_clo.png");
		Image imaIcc1 = icone1.getImage();
		Image imscall1 = imaIcc1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr1 = new ImageIcon(imscall1);
		btnAnnuler.setIcon(scalVr1);
		springLayout.putConstraint(SpringLayout.NORTH, btnValider, 0, SpringLayout.NORTH, btnAnnuler);
		springLayout.putConstraint(SpringLayout.SOUTH, btnValider, 0, SpringLayout.SOUTH, btnAnnuler);
		springLayout.putConstraint(SpringLayout.EAST, btnValider, -30, SpringLayout.WEST, btnAnnuler);
		springLayout.putConstraint(SpringLayout.NORTH, btnAnnuler, 26, SpringLayout.SOUTH, passwordField);
		springLayout.putConstraint(SpringLayout.WEST, btnAnnuler, 217, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnAnnuler, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnAnnuler, -107, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnAnnuler);
		
		lblIncorrecte = new JLabel("");
		lblIncorrecte.setForeground(Color.RED);
		springLayout.putConstraint(SpringLayout.NORTH, lblIncorrecte, 6, SpringLayout.SOUTH, passwordField);
		springLayout.putConstraint(SpringLayout.WEST, lblIncorrecte, 0, SpringLayout.WEST, textFieldRetrait);
		springLayout.putConstraint(SpringLayout.EAST, lblIncorrecte, 0, SpringLayout.EAST, txtCetteRetraitSera);
		getContentPane().add(lblIncorrecte);
		this.init();
	}
	public void init() {
		RetraitPourEpaController c = new RetraitPourEpaController(this);
		btnAnnuler.addActionListener(c);
		btnValider.addActionListener(c);
	}

}
