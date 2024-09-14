package views.modeGestionnaire;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import controller.gestionnaire.AuthentificationGestionnaireController;
import panel.AuthGestPanel;

public class AuthentificationGestionnaireViews extends JFrame{
	public JTextField textFieldEmail;
	public JPasswordField passwordField;
	public JCheckBox chckbxMdp;
	public JButton btnConnecter;
	public JButton btnRetoure;
	public JButton btnAnnuler;
	public AuthentificationGestionnaireViews() {
		AuthGestPanel authGestPanel = new AuthGestPanel();
		this.setContentPane(authGestPanel);
		SpringLayout sl_authGestPanel = new SpringLayout();
		getContentPane().setLayout(sl_authGestPanel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bienvenue");
		sl_authGestPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1_1, 28, SpringLayout.WEST, authGestPanel);
		sl_authGestPanel.putConstraint(SpringLayout.SOUTH, lblNewLabel_1_1, -130, SpringLayout.SOUTH, authGestPanel);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Monotype Corsiva", Font.ITALIC, 65));
		authGestPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("OurBank Madagascar officiel");
		sl_authGestPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 53, SpringLayout.SOUTH, lblNewLabel_1_1);
		sl_authGestPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 40, SpringLayout.WEST, authGestPanel);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.ITALIC, 12));
		authGestPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("+261 34 47 411 33");
		sl_authGestPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_2, 16, SpringLayout.SOUTH, lblNewLabel_1);
		sl_authGestPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1_2, 0, SpringLayout.WEST, lblNewLabel_1);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Sylfaen", Font.PLAIN, 12));
		authGestPanel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("OurBankmada@gmail-mg.com");
		sl_authGestPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_3, 6, SpringLayout.SOUTH, lblNewLabel_1_2);
		sl_authGestPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1_3, 0, SpringLayout.WEST, lblNewLabel_1);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Sitka Subheading", Font.ITALIC, 12));
		authGestPanel.add(lblNewLabel_1_3);
		
		JLabel lblAuthentification = new JLabel("Authentification");
		sl_authGestPanel.putConstraint(SpringLayout.EAST, lblAuthentification, -294, SpringLayout.EAST, authGestPanel);
		lblAuthentification.setFont(new Font("Poor Richard", Font.BOLD | Font.ITALIC, 20));
		authGestPanel.add(lblAuthentification);
		
		JLabel lblNewLabel_2 = new JLabel("E-mail : ");
		sl_authGestPanel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -434, SpringLayout.SOUTH, authGestPanel);
		sl_authGestPanel.putConstraint(SpringLayout.SOUTH, lblAuthentification, -46, SpringLayout.NORTH, lblNewLabel_2);
		sl_authGestPanel.putConstraint(SpringLayout.EAST, lblNewLabel_2, -341, SpringLayout.EAST, authGestPanel);
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 14));
		authGestPanel.add(lblNewLabel_2);
		
		textFieldEmail = new JTextField();
		sl_authGestPanel.putConstraint(SpringLayout.NORTH, textFieldEmail, 4, SpringLayout.SOUTH, lblNewLabel_2);
		sl_authGestPanel.putConstraint(SpringLayout.WEST, textFieldEmail, -519, SpringLayout.EAST, authGestPanel);
		sl_authGestPanel.putConstraint(SpringLayout.SOUTH, textFieldEmail, -399, SpringLayout.SOUTH, authGestPanel);
		sl_authGestPanel.putConstraint(SpringLayout.EAST, textFieldEmail, -201, SpringLayout.EAST, authGestPanel);
		textFieldEmail.setForeground(Color.WHITE);
		textFieldEmail.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBackground(new Color(5, 0, 26));
		authGestPanel.add(textFieldEmail);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mot de passe :");
		sl_authGestPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1, 28, SpringLayout.SOUTH, textFieldEmail);
		sl_authGestPanel.putConstraint(SpringLayout.EAST, lblNewLabel_2_1, -314, SpringLayout.EAST, authGestPanel);
		lblNewLabel_2_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_1.setFont(new Font("Sitka Text", Font.BOLD, 14));
		authGestPanel.add(lblNewLabel_2_1);
		
		passwordField = new JPasswordField();
		sl_authGestPanel.putConstraint(SpringLayout.NORTH, passwordField, 6, SpringLayout.SOUTH, lblNewLabel_2_1);
		sl_authGestPanel.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.WEST, textFieldEmail);
		sl_authGestPanel.putConstraint(SpringLayout.SOUTH, passwordField, 37, SpringLayout.SOUTH, lblNewLabel_2_1);
		sl_authGestPanel.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, textFieldEmail);
		passwordField.setForeground(Color.WHITE);
		passwordField.setFont(new Font("Times New Roman", Font.BOLD, 12));
		passwordField.setColumns(10);
		passwordField.setBackground(new Color(5, 0, 26));
		authGestPanel.add(passwordField);
		
		chckbxMdp = new JCheckBox("Afficher le mot de passe");
		sl_authGestPanel.putConstraint(SpringLayout.NORTH, chckbxMdp, 6, SpringLayout.SOUTH, passwordField);
		sl_authGestPanel.putConstraint(SpringLayout.WEST, chckbxMdp, 0, SpringLayout.WEST, lblAuthentification);
		chckbxMdp.setForeground(Color.WHITE);
		chckbxMdp.setFont(new Font("Sylfaen", Font.ITALIC, 10));
		chckbxMdp.setBackground(new Color(128, 0, 255));
		authGestPanel.add(chckbxMdp);
		
		btnConnecter = new JButton("Se Connecter");
		sl_authGestPanel.putConstraint(SpringLayout.WEST, btnConnecter, 160, SpringLayout.EAST, lblNewLabel_1_1);
		authGestPanel.add(btnConnecter);
		
		btnAnnuler = new JButton("Annuler");
		sl_authGestPanel.putConstraint(SpringLayout.NORTH, btnConnecter, 0, SpringLayout.NORTH, btnAnnuler);
		sl_authGestPanel.putConstraint(SpringLayout.EAST, btnConnecter, -47, SpringLayout.WEST, btnAnnuler);
		sl_authGestPanel.putConstraint(SpringLayout.NORTH, btnAnnuler, 0, SpringLayout.NORTH, lblNewLabel_1_1);
		sl_authGestPanel.putConstraint(SpringLayout.WEST, btnAnnuler, 20, SpringLayout.WEST, lblNewLabel_2_1);
		sl_authGestPanel.putConstraint(SpringLayout.EAST, btnAnnuler, 0, SpringLayout.EAST, lblAuthentification);
		ImageIcon icon = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\annuler.png");
		Image imaIc = icon.getImage();
		Image imsca = imaIc.getScaledInstance(10, 15, Image.SCALE_SMOOTH);
		ImageIcon scal = new ImageIcon(imsca);
		btnAnnuler.setIcon(scal);
		authGestPanel.add(btnAnnuler);
		
		btnRetoure = new JButton("Retour");
		sl_authGestPanel.putConstraint(SpringLayout.NORTH, btnRetoure, 0, SpringLayout.NORTH, lblNewLabel_1_1);
		sl_authGestPanel.putConstraint(SpringLayout.WEST, btnRetoure, 52, SpringLayout.EAST, btnAnnuler);
		sl_authGestPanel.putConstraint(SpringLayout.EAST, btnRetoure, -151, SpringLayout.EAST, authGestPanel);
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\revenir.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(10, 15, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnRetoure.setIcon(scalVr);
		authGestPanel.add(btnRetoure);
		this.init();
	}
	public void init() {
		AuthentificationGestionnaireController controlle = new AuthentificationGestionnaireController(this);
		btnRetoure.addActionListener(controlle);
		btnAnnuler.addActionListener(controlle);
		btnConnecter.addActionListener(controlle);
		chckbxMdp.addActionListener(controlle);
	}
}
