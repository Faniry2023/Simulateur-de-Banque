package views.modeClient;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import controller.client.NouveauCompteController;
import panel.NouveauComptePanelClient;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class NouveauCompteViews extends JFrame{
	public JLabel lblImage;
	public JTextField textFieldNom;
	public JTextField textFieldPrenom;
	public JComboBox comboBoxJours;
	public JComboBox comboBoxMois;
	public JComboBox comboBoxAnnee;
	public JButton btnPrendreImage;
	private JLabel lblNewLabel_1_1_2;
	public JTextField textFieldLieuNaissance;
	private JLabel lblNewLabel_1_1_3;
	public JTextField textFieldCIN;
	private JLabel lblNewLabel_1_1_4;
	public JTextField textFieldAdresse;
	private JLabel lblNewLabel_1_1_5;
	public JComboBox comboBoxSexe;
	private JLabel lblNewLabel_1_1_6;
	public JTextField textFieldContact;
	private JLabel lblNewLabel_1_1_7;
	public JTextField textFieldEmail;
	private JLabel lblNewLabel_1_1_8;
	public JPasswordField passwordFieldNV;
	private JLabel lblNewLabel_1_1_9;
	public JPasswordField passwordFieldConfirmer;
	public JButton btnEnregistrer;
	private JLabel lblNewLabel_3;
	public JTextField textFieldNumCompte;
	public JButton btnAnnuler;
	public JButton btnChoisirUneImage;
	public JCheckBox chckbxAffiMdpNv;
	public JLabel lienImage;
	public JTextArea textAreahis;
	public NouveauCompteViews() {
		
		NouveauComptePanelClient panel = new NouveauComptePanelClient();
		this.setContentPane(panel);
		
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Remplisser les formulaire suivant :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 23, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 199, SpringLayout.WEST, panel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		btnPrendreImage = new JButton("Prendre Photo");
		springLayout.putConstraint(SpringLayout.NORTH, btnPrendreImage, 183, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnPrendreImage, 317, SpringLayout.WEST, panel);
		panel.add(btnPrendreImage);
		
		lblImage = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblImage, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblImage, 181, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblImage, -6, SpringLayout.NORTH, btnPrendreImage);
		springLayout.putConstraint(SpringLayout.EAST, lblImage, -170, SpringLayout.EAST, panel);
		panel.add(lblImage);
		
		JLabel lblNewLabel_1 = new JLabel("Nom : ");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblImage);
		lblNewLabel_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_1);
		
		textFieldNom = new JTextField();
		textFieldNom.setBackground(new Color(0, 0, 0));
		textFieldNom.setForeground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.WEST, textFieldNom, 24, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, textFieldNom, -170, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 5, SpringLayout.NORTH, textFieldNom);
		panel.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Prenom : ");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 24, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		panel.add(lblNewLabel_1_1);
		
		textFieldPrenom = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldPrenom, 17, SpringLayout.SOUTH, textFieldNom);
		springLayout.putConstraint(SpringLayout.WEST, textFieldPrenom, 0, SpringLayout.WEST, textFieldNom);
		springLayout.putConstraint(SpringLayout.EAST, textFieldPrenom, 0, SpringLayout.EAST, lblImage);
		textFieldPrenom.setForeground(Color.WHITE);
		textFieldPrenom.setColumns(10);
		textFieldPrenom.setBackground(new Color(0, 0, 0));
		panel.add(textFieldPrenom);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Date de naissance :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_1, 21, SpringLayout.SOUTH, lblNewLabel_1_1);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_1, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		panel.add(lblNewLabel_1_1_1);
		
		comboBoxJours = new JComboBox();
		for(int i = 1; i <= 31; i++) {
			comboBoxJours.addItem(String.valueOf(i));
		}
		comboBoxJours.setBackground(new Color(0, 0, 0));
		comboBoxJours.setForeground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.WEST, comboBoxJours, 0, SpringLayout.WEST, textFieldNom);
		springLayout.putConstraint(SpringLayout.SOUTH, comboBoxJours, 0, SpringLayout.SOUTH, lblNewLabel_1_1_1);
		panel.add(comboBoxJours);
		
		comboBoxMois = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, comboBoxMois, -10, SpringLayout.NORTH, lblNewLabel_1_1_1);
		springLayout.putConstraint(SpringLayout.WEST, comboBoxMois, 6, SpringLayout.EAST, comboBoxJours);
		comboBoxMois.setModel(new DefaultComboBoxModel(new String[] {"Janvier", "Fevrier", "Mars", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"}));
		comboBoxMois.setBackground(new Color(0, 0, 0));
		comboBoxMois.setForeground(new Color(255, 255, 255));
		panel.add(comboBoxMois);
		
		comboBoxAnnee = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, comboBoxAnnee,11, SpringLayout.SOUTH, textFieldPrenom);
		springLayout.putConstraint(SpringLayout.WEST, comboBoxAnnee, 6, SpringLayout.EAST, comboBoxMois);
		for(int i = 1960; i <= 2023; i++) {
			comboBoxAnnee.addItem(String.valueOf(i));
		}
		comboBoxAnnee.setBackground(new Color(0, 0, 0));
		comboBoxAnnee.setForeground(new Color(255, 255, 255));
		panel.add(comboBoxAnnee);
		
		lblNewLabel_1_1_2 = new JLabel("Lieu de naissance :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_2, 22, SpringLayout.SOUTH, lblNewLabel_1_1_1);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_2, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		panel.add(lblNewLabel_1_1_2);
		
		textFieldLieuNaissance = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textFieldLieuNaissance, 0, SpringLayout.WEST, textFieldNom);
		springLayout.putConstraint(SpringLayout.SOUTH, textFieldLieuNaissance, 0, SpringLayout.SOUTH, lblNewLabel_1_1_2);
		springLayout.putConstraint(SpringLayout.EAST, textFieldLieuNaissance, 0, SpringLayout.EAST, lblImage);
		textFieldLieuNaissance.setForeground(Color.WHITE);
		textFieldLieuNaissance.setColumns(10);
		textFieldLieuNaissance.setBackground(new Color(0, 0, 0));
		panel.add(textFieldLieuNaissance);
		
		lblNewLabel_1_1_3 = new JLabel("Carte d'identité national :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_3, 18, SpringLayout.SOUTH, lblNewLabel_1_1_2);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_3, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		panel.add(lblNewLabel_1_1_3);
		
		textFieldCIN = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textFieldCIN, 0, SpringLayout.WEST, textFieldNom);
		springLayout.putConstraint(SpringLayout.SOUTH, textFieldCIN, 0, SpringLayout.SOUTH, lblNewLabel_1_1_3);
		springLayout.putConstraint(SpringLayout.EAST, textFieldCIN, 0, SpringLayout.EAST, lblImage);
		textFieldCIN.setForeground(Color.WHITE);
		textFieldCIN.setColumns(10);
		textFieldCIN.setBackground(new Color(0, 0, 0));
		panel.add(textFieldCIN);
		
		lblNewLabel_1_1_4 = new JLabel("Adresse et Lot :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_4, 21, SpringLayout.SOUTH, lblNewLabel_1_1_3);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_4, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_1_4.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		panel.add(lblNewLabel_1_1_4);
		
		textFieldAdresse = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldAdresse, 15, SpringLayout.SOUTH, textFieldCIN);
		springLayout.putConstraint(SpringLayout.WEST, textFieldAdresse, 0, SpringLayout.WEST, textFieldNom);
		springLayout.putConstraint(SpringLayout.EAST, textFieldAdresse, 0, SpringLayout.EAST, lblImage);
		textFieldAdresse.setForeground(Color.WHITE);
		textFieldAdresse.setColumns(10);
		textFieldAdresse.setBackground(new Color(0, 0, 0));
		panel.add(textFieldAdresse);
		
		lblNewLabel_1_1_5 = new JLabel("Sexe :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_5, 21, SpringLayout.SOUTH, lblNewLabel_1_1_4);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_5, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_1_5.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		panel.add(lblNewLabel_1_1_5);
		
		comboBoxSexe = new JComboBox();
		comboBoxSexe.setModel(new DefaultComboBoxModel(new String[] {"Homme", "Femme", "Autre"}));
		
		springLayout.putConstraint(SpringLayout.NORTH, comboBoxSexe, 13, SpringLayout.SOUTH, textFieldAdresse);
		springLayout.putConstraint(SpringLayout.WEST, comboBoxSexe, 24, SpringLayout.EAST, lblNewLabel_1_1_5);
		springLayout.putConstraint(SpringLayout.SOUTH, comboBoxSexe, 0, SpringLayout.SOUTH, lblNewLabel_1_1_5);
		springLayout.putConstraint(SpringLayout.EAST, comboBoxSexe, 0, SpringLayout.EAST, lblImage);
		comboBoxSexe.setForeground(Color.WHITE);
		comboBoxSexe.setBackground(new Color(0, 0, 0));
		panel.add(comboBoxSexe);
		
		lblNewLabel_1_1_6 = new JLabel("Contact :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_6, 22, SpringLayout.SOUTH, lblNewLabel_1_1_5);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_6, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1_6.setForeground(Color.WHITE);
		lblNewLabel_1_1_6.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		panel.add(lblNewLabel_1_1_6);
		
		textFieldContact = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldContact, 16, SpringLayout.SOUTH, comboBoxSexe);
		springLayout.putConstraint(SpringLayout.WEST, textFieldContact, 0, SpringLayout.WEST, textFieldNom);
		springLayout.putConstraint(SpringLayout.EAST, textFieldContact, 0, SpringLayout.EAST, lblImage);
		textFieldContact.setForeground(Color.WHITE);
		textFieldContact.setColumns(10);
		textFieldContact.setBackground(Color.BLACK);
		panel.add(textFieldContact);
		
		lblNewLabel_1_1_7 = new JLabel("Email : ");
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_7, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1_7.setForeground(Color.WHITE);
		lblNewLabel_1_1_7.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		panel.add(lblNewLabel_1_1_7);
		
		textFieldEmail = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_7, 5, SpringLayout.NORTH, textFieldEmail);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldEmail, 12, SpringLayout.SOUTH, textFieldContact);
		springLayout.putConstraint(SpringLayout.WEST, textFieldEmail, 0, SpringLayout.WEST, textFieldNom);
		springLayout.putConstraint(SpringLayout.EAST, textFieldEmail, 0, SpringLayout.EAST, lblImage);
		textFieldEmail.setForeground(Color.WHITE);
		textFieldEmail.setColumns(10);
		textFieldEmail.setBackground(Color.BLACK);
		panel.add(textFieldEmail);
		
		lblNewLabel_1_1_8 = new JLabel("Mot de passe :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_8, 20, SpringLayout.SOUTH, lblNewLabel_1_1_7);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_8, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1_8.setForeground(Color.WHITE);
		lblNewLabel_1_1_8.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		panel.add(lblNewLabel_1_1_8);
		
		passwordFieldNV = new JPasswordField();
		passwordFieldNV.setForeground(new Color(255, 255, 255));
		passwordFieldNV.setBackground(new Color(0, 0, 0));
		springLayout.putConstraint(SpringLayout.NORTH, passwordFieldNV, 13, SpringLayout.SOUTH, textFieldEmail);
		springLayout.putConstraint(SpringLayout.WEST, passwordFieldNV, 0, SpringLayout.WEST, textFieldNom);
		springLayout.putConstraint(SpringLayout.EAST, passwordFieldNV, 0, SpringLayout.EAST, lblImage);
		panel.add(passwordFieldNV);
		
		lblNewLabel_1_1_9 = new JLabel("Confirmer votre mot de passe :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_9, 21, SpringLayout.SOUTH, lblNewLabel_1_1_8);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_9, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1_9.setForeground(Color.WHITE);
		lblNewLabel_1_1_9.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		panel.add(lblNewLabel_1_1_9);
		
		passwordFieldConfirmer = new JPasswordField();
		springLayout.putConstraint(SpringLayout.WEST, passwordFieldConfirmer, 0, SpringLayout.WEST, textFieldNom);
		springLayout.putConstraint(SpringLayout.SOUTH, passwordFieldConfirmer, 0, SpringLayout.SOUTH, lblNewLabel_1_1_9);
		springLayout.putConstraint(SpringLayout.EAST, passwordFieldConfirmer, 0, SpringLayout.EAST, lblImage);
		passwordFieldConfirmer.setForeground(Color.WHITE);
		passwordFieldConfirmer.setBackground(Color.BLACK);
		panel.add(passwordFieldConfirmer);
		
		btnEnregistrer = new JButton("Enregistrer");
		springLayout.putConstraint(SpringLayout.NORTH, btnEnregistrer, 18, SpringLayout.SOUTH, lblNewLabel_1_1_9);
		panel.add(btnEnregistrer);
		
		lblNewLabel_3 = new JLabel("Votre numéro de compte est :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 42, SpringLayout.SOUTH, lblImage);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldNom, 17, SpringLayout.SOUTH, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 91, SpringLayout.WEST, panel);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 12));
		panel.add(lblNewLabel_3);
		
		textFieldNumCompte = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textFieldNumCompte, 40, SpringLayout.EAST, lblNewLabel_3);
		textFieldNumCompte.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldNumCompte.setEditable(false);
		springLayout.putConstraint(SpringLayout.SOUTH, textFieldNumCompte, 0, SpringLayout.SOUTH, lblNewLabel_3);
		textFieldNumCompte.setForeground(new Color(0, 153, 0));
		textFieldNumCompte.setColumns(10);
		textFieldNumCompte.setBackground(Color.BLACK);
		panel.add(textFieldNumCompte);
		
		btnAnnuler = new JButton("Annuler");
		springLayout.putConstraint(SpringLayout.WEST, btnAnnuler, 289, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.EAST, btnAnnuler, -159, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.EAST, btnEnregistrer, -19, SpringLayout.WEST, btnAnnuler);
		springLayout.putConstraint(SpringLayout.NORTH, btnAnnuler, 0, SpringLayout.NORTH, btnEnregistrer);
		panel.add(btnAnnuler);
		
		btnChoisirUneImage = new JButton("Choisir une image");
		springLayout.putConstraint(SpringLayout.WEST, btnChoisirUneImage, 0, SpringLayout.WEST, lblNewLabel_1_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnChoisirUneImage, 0, SpringLayout.SOUTH, btnPrendreImage);
		panel.add(btnChoisirUneImage);
		
		lienImage = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, lienImage, 0, SpringLayout.WEST, lblNewLabel_1_1_9);
		springLayout.putConstraint(SpringLayout.SOUTH, lienImage, -2256, SpringLayout.NORTH, lblNewLabel_3);
		panel.add(lienImage);
		
		chckbxAffiMdpNv = new JCheckBox("");
		springLayout.putConstraint(SpringLayout.EAST, comboBoxAnnee, -22, SpringLayout.EAST, chckbxAffiMdpNv);
		springLayout.putConstraint(SpringLayout.EAST, chckbxAffiMdpNv, 47, SpringLayout.EAST, passwordFieldConfirmer);
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\oeilClo.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		chckbxAffiMdpNv.setIcon(scalVr);
		springLayout.putConstraint(SpringLayout.WEST, chckbxAffiMdpNv, 11, SpringLayout.EAST, passwordFieldConfirmer);
		springLayout.putConstraint(SpringLayout.SOUTH, chckbxAffiMdpNv, 0, SpringLayout.SOUTH, lblNewLabel_1_1_9);
		panel.add(chckbxAffiMdpNv);
		
		String histoire = "Bienvenu ! \\n Vous n'avez pas encore fait des action\\n alors votre compte est de 0.0Ar";
		
		textAreahis = new JTextArea();
		textAreahis.setText(histoire);
		springLayout.putConstraint(SpringLayout.NORTH, textAreahis, 99, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, textAreahis, 11167, SpringLayout.WEST, panel);
		panel.add(textAreahis);
		
		this.init();
	}
	public void init() {
		NouveauCompteController controlle = new NouveauCompteController(this);
		btnPrendreImage.addActionListener(controlle);
		btnChoisirUneImage.addActionListener(controlle);
		btnEnregistrer.addActionListener(controlle);
		btnAnnuler.addActionListener(controlle);
		chckbxAffiMdpNv.addActionListener(controlle);
	}
}
