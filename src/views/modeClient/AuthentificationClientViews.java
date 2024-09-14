package views.modeClient;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import controller.client.AuthentificationClientController;
import panel.LoginPanelClient;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class AuthentificationClientViews extends JFrame{
	public JTextField textFieldEmail;
	public JPasswordField textFieldMotDePasse;
	public JTextField textFieldNumeroDeCompte;
	public JCheckBox chckbxMdp;
	public JButton btnQuitter;
	public JButton btnConnecter;
	public JButton btnNouveauCompte;
	public JButton btnAnnuler;
	public AuthentificationClientViews(){
		
		LoginPanelClient loginPanelClient = new LoginPanelClient();
		loginPanelClient.setBackground(new Color(0, 128, 128));
		this.setContentPane(loginPanelClient);
		SpringLayout sl_loginPanelClient = new SpringLayout();
		loginPanelClient.setLayout(sl_loginPanelClient);
		
		JLabel lblNewLabel = new JLabel("Authentification du Client");
		lblNewLabel.setFont(new Font("Poor Richard", Font.BOLD | Font.ITALIC, 20));
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, lblNewLabel, 60, SpringLayout.NORTH, loginPanelClient);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, lblNewLabel, -250, SpringLayout.EAST, loginPanelClient);
		loginPanelClient.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("E-mail : ");
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 57, SpringLayout.SOUTH, lblNewLabel);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, lblNewLabel_2, -335, SpringLayout.EAST, loginPanelClient);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		loginPanelClient.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mot de passe :");
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1, 84, SpringLayout.SOUTH, lblNewLabel_2);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, lblNewLabel_2_1, -318, SpringLayout.EAST, loginPanelClient);
		lblNewLabel_2_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_1.setFont(new Font("Sitka Text", Font.BOLD, 14));
		loginPanelClient.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Numero de compte :");
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1_1, 80, SpringLayout.SOUTH, lblNewLabel_2_1);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, lblNewLabel_2_1_1, -293, SpringLayout.EAST, loginPanelClient);
		lblNewLabel_2_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_1_1.setFont(new Font("Sitka Text", Font.BOLD, 14));
		loginPanelClient.add(lblNewLabel_2_1_1);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Times New Roman", Font.BOLD, 12));
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, textFieldEmail, 6, SpringLayout.SOUTH, lblNewLabel_2);
		sl_loginPanelClient.putConstraint(SpringLayout.WEST, textFieldEmail, -56, SpringLayout.WEST, lblNewLabel);
		sl_loginPanelClient.putConstraint(SpringLayout.SOUTH, textFieldEmail, 37, SpringLayout.SOUTH, lblNewLabel_2);
		textFieldEmail.setForeground(new Color(255, 255, 255));
		textFieldEmail.setBackground(new Color(5, 0, 26));
		loginPanelClient.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldMotDePasse = new JPasswordField();
		textFieldMotDePasse.setFont(new Font("Times New Roman", Font.BOLD, 12));
		sl_loginPanelClient.putConstraint(SpringLayout.WEST, textFieldMotDePasse, 465, SpringLayout.WEST, loginPanelClient);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, textFieldMotDePasse, -205, SpringLayout.EAST, loginPanelClient);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, textFieldEmail, 0, SpringLayout.EAST, textFieldMotDePasse);
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, textFieldMotDePasse, 6, SpringLayout.SOUTH, lblNewLabel_2_1);
		sl_loginPanelClient.putConstraint(SpringLayout.SOUTH, textFieldMotDePasse, 37, SpringLayout.SOUTH, lblNewLabel_2_1);
		textFieldMotDePasse.setForeground(Color.WHITE);
		textFieldMotDePasse.setColumns(10);
		textFieldMotDePasse.setBackground(new Color(5, 0, 26));
		loginPanelClient.add(textFieldMotDePasse);
		
		textFieldNumeroDeCompte = new JTextField();
		textFieldNumeroDeCompte.setFont(new Font("Times New Roman", Font.BOLD, 12));
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, textFieldNumeroDeCompte, 5, SpringLayout.SOUTH, lblNewLabel_2_1_1);
		sl_loginPanelClient.putConstraint(SpringLayout.WEST, textFieldNumeroDeCompte, 0, SpringLayout.WEST, textFieldEmail);
		sl_loginPanelClient.putConstraint(SpringLayout.SOUTH, textFieldNumeroDeCompte, 36, SpringLayout.SOUTH, lblNewLabel_2_1_1);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, textFieldNumeroDeCompte, 0, SpringLayout.EAST, textFieldEmail);
		textFieldNumeroDeCompte.setForeground(new Color(0, 255, 51));
		textFieldNumeroDeCompte.setColumns(10);
		textFieldNumeroDeCompte.setBackground(new Color(5, 0, 26));
		loginPanelClient.add(textFieldNumeroDeCompte);
		
		btnConnecter = new JButton("Se Connecter");
		loginPanelClient.add(btnConnecter);
		
		btnAnnuler = new JButton("Annuler");
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, btnConnecter, 0, SpringLayout.NORTH, btnAnnuler);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, btnConnecter, -6, SpringLayout.WEST, btnAnnuler);
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, btnAnnuler, 37, SpringLayout.SOUTH, textFieldNumeroDeCompte);
		sl_loginPanelClient.putConstraint(SpringLayout.WEST, btnAnnuler, 23, SpringLayout.WEST, lblNewLabel_2_1_1);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, btnAnnuler, 0, SpringLayout.EAST, lblNewLabel_2_1_1);
		ImageIcon icon = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\annuler.png");
		Image imaIc = icon.getImage();
		Image imsca = imaIc.getScaledInstance(10, 15, Image.SCALE_SMOOTH);
		ImageIcon scal = new ImageIcon(imsca);
		btnAnnuler.setIcon(scal);
		loginPanelClient.add(btnAnnuler);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bienvenue");
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 393, SpringLayout.NORTH, loginPanelClient);
		sl_loginPanelClient.putConstraint(SpringLayout.WEST, lblNewLabel_1_1, 32, SpringLayout.WEST, loginPanelClient);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Monotype Corsiva", Font.ITALIC, 65));
		loginPanelClient.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("OurBank Madagascar officiel");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.ITALIC, 12));
		sl_loginPanelClient.putConstraint(SpringLayout.WEST, lblNewLabel_1, 35, SpringLayout.WEST, loginPanelClient);
		sl_loginPanelClient.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -60, SpringLayout.SOUTH, loginPanelClient);
		loginPanelClient.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("+261 34 47 411 33");
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, lblNewLabel_1_2, 15, SpringLayout.SOUTH, lblNewLabel_1);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, lblNewLabel_1_2, -60, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Sylfaen", Font.PLAIN, 12));
		loginPanelClient.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("OurBankmada@gmail-mg.com");
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, lblNewLabel_1_3, 8, SpringLayout.SOUTH, lblNewLabel_1_2);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, lblNewLabel_1_3, 8, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Sitka Subheading", Font.ITALIC, 12));
		loginPanelClient.add(lblNewLabel_1_3);
		
		btnQuitter = new JButton("Retour");
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\revenir.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(10, 15, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnQuitter.setIcon(scalVr);
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, btnQuitter, 37, SpringLayout.SOUTH, textFieldNumeroDeCompte);
		sl_loginPanelClient.putConstraint(SpringLayout.WEST, btnQuitter, 6, SpringLayout.EAST, btnAnnuler);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, btnQuitter, -195, SpringLayout.EAST, loginPanelClient);
		loginPanelClient.add(btnQuitter);
		
		chckbxMdp = new JCheckBox("Afficher le mot de passe");
		chckbxMdp.setFont(new Font("Sylfaen", Font.ITALIC, 10));
		chckbxMdp.setBackground(new Color(128, 0, 255));
		chckbxMdp.setForeground(Color.WHITE);
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, chckbxMdp, 0, SpringLayout.SOUTH, textFieldMotDePasse);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, chckbxMdp, -300, SpringLayout.EAST, loginPanelClient);
		loginPanelClient.add(chckbxMdp);
		
		btnNouveauCompte = new JButton("Creer un nouveau compte");
		sl_loginPanelClient.putConstraint(SpringLayout.NORTH, btnNouveauCompte, 28, SpringLayout.SOUTH, btnConnecter);
		sl_loginPanelClient.putConstraint(SpringLayout.WEST, btnNouveauCompte, 0, SpringLayout.WEST, btnConnecter);
		sl_loginPanelClient.putConstraint(SpringLayout.EAST, btnNouveauCompte, 0, SpringLayout.EAST, btnQuitter);
		loginPanelClient.add(btnNouveauCompte);
		this.setVisible(true);
		
		this.redir();
		}
	
	public void redir() {
		AuthentificationClientController controlle = new AuthentificationClientController(this);
		btnConnecter.addActionListener(controlle);
		btnQuitter.addActionListener(controlle);
		chckbxMdp.addActionListener(controlle);
		btnNouveauCompte.addActionListener(controlle);
		btnAnnuler.addActionListener(controlle);
	}
}
