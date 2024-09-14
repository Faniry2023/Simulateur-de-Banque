package views.modeClient;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import controller.client.ModifierController;
import panel.ModifPanel;

public class ModifierViews extends JFrame{
	public JButton btnPrendreImage;
	public JButton btnChoisirUneImage;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_2;
	private JLabel lblNewLabel_1_1_3;
	private JLabel lblNewLabel_1_1_4;
	private JLabel lblNewLabel_1_1_5;
	public JLabel lblImage;
	public JTextField textFieldNom;
	public JTextField textFieldPrenom;
	public JComboBox comboBoxJours;
	public JComboBox comboBoxAnnee;
	public JComboBox comboBoxMois;
	public JTextField textFieldLieuNaissance;
	public JTextField textFieldCIN;
	public JTextField textFieldAdresse;
	public JComboBox comboBoxSexe;
	public JTextField textFieldContact;
	public JButton btnModifier;
	public JButton btnAnnuler;
	public JTextField textFieldNumCompte;
	public JLabel lbllienImage;
	public ModifierViews() {
		ModifPanel modifPanel = new ModifPanel();
		this.setContentPane(modifPanel);
		SpringLayout sl_modifPanel = new SpringLayout();
		getContentPane().setLayout(sl_modifPanel);
		
		btnPrendreImage = new JButton("Prendre photo");
		btnPrendreImage.setForeground(new Color(255, 255, 255));
		btnPrendreImage.setBackground(new Color(0, 0, 0));
		sl_modifPanel.putConstraint(SpringLayout.NORTH, btnPrendreImage, 168, SpringLayout.NORTH, modifPanel);
		sl_modifPanel.putConstraint(SpringLayout.WEST, btnPrendreImage, 243, SpringLayout.WEST, modifPanel);
		sl_modifPanel.putConstraint(SpringLayout.EAST, btnPrendreImage, -23, SpringLayout.EAST, modifPanel);
		modifPanel.add(btnPrendreImage);
		
		btnChoisirUneImage = new JButton("Choisir photo");
		btnChoisirUneImage.setBackground(new Color(0, 0, 0));
		btnChoisirUneImage.setForeground(new Color(255, 255, 255));
		sl_modifPanel.putConstraint(SpringLayout.WEST, btnChoisirUneImage, 243, SpringLayout.WEST, modifPanel);
		sl_modifPanel.putConstraint(SpringLayout.SOUTH, btnChoisirUneImage, -21, SpringLayout.NORTH, btnPrendreImage);
		sl_modifPanel.putConstraint(SpringLayout.EAST, btnChoisirUneImage, -23, SpringLayout.EAST, modifPanel);
		modifPanel.add(btnChoisirUneImage);
		
		lblNewLabel = new JLabel("Nom : ");
		sl_modifPanel.putConstraint(SpringLayout.NORTH, lblNewLabel, 257, SpringLayout.NORTH, modifPanel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		modifPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Prenom : ");
		sl_modifPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 31, SpringLayout.SOUTH, lblNewLabel);
		sl_modifPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 82, SpringLayout.WEST, modifPanel);
		sl_modifPanel.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		modifPanel.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("Date de naissance :");
		sl_modifPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 35, SpringLayout.SOUTH, lblNewLabel_1);
		sl_modifPanel.putConstraint(SpringLayout.EAST, lblNewLabel_1_1, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		modifPanel.add(lblNewLabel_1_1);
		
		lblNewLabel_1_1_1 = new JLabel("Lieu de naissance :");
		sl_modifPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_1, 30, SpringLayout.SOUTH, lblNewLabel_1_1);
		sl_modifPanel.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_1, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		modifPanel.add(lblNewLabel_1_1_1);
		
		lblNewLabel_1_1_2 = new JLabel("Carte d'identité national :");
		sl_modifPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_2, 27, SpringLayout.SOUTH, lblNewLabel_1_1_1);
		sl_modifPanel.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_2, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		modifPanel.add(lblNewLabel_1_1_2);
		
		lblNewLabel_1_1_3 = new JLabel("Adresse et Lot :");
		sl_modifPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_3, 27, SpringLayout.SOUTH, lblNewLabel_1_1_2);
		sl_modifPanel.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_3, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		modifPanel.add(lblNewLabel_1_1_3);
		
		lblNewLabel_1_1_4 = new JLabel("Sexe :");
		sl_modifPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_4, 19, SpringLayout.SOUTH, lblNewLabel_1_1_3);
		sl_modifPanel.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_4, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_1_4.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		modifPanel.add(lblNewLabel_1_1_4);
		
		lblNewLabel_1_1_5 = new JLabel("Contact :");
		sl_modifPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_5, 21, SpringLayout.SOUTH, lblNewLabel_1_1_4);
		sl_modifPanel.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_5, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_1_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_1_5.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 12));
		modifPanel.add(lblNewLabel_1_1_5);
		
		lblImage = new JLabel("New label");
		sl_modifPanel.putConstraint(SpringLayout.NORTH, lblImage, -247, SpringLayout.NORTH, lblNewLabel);
		sl_modifPanel.putConstraint(SpringLayout.WEST, lblImage, -233, SpringLayout.WEST, btnPrendreImage);
		sl_modifPanel.putConstraint(SpringLayout.SOUTH, lblImage, -6, SpringLayout.NORTH, lblNewLabel);
		sl_modifPanel.putConstraint(SpringLayout.EAST, lblImage, -6, SpringLayout.WEST, btnPrendreImage);
		modifPanel.add(lblImage);
		
		textFieldNom = new JTextField();
		textFieldNom.setBackground(new Color(0, 0, 51));
		textFieldNom.setForeground(new Color(255, 255, 255));
		sl_modifPanel.putConstraint(SpringLayout.NORTH, textFieldNom, 0, SpringLayout.SOUTH, lblImage);
		sl_modifPanel.putConstraint(SpringLayout.WEST, textFieldNom, 18, SpringLayout.EAST, lblNewLabel);
		sl_modifPanel.putConstraint(SpringLayout.EAST, textFieldNom, 194, SpringLayout.EAST, lblNewLabel);
		modifPanel.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		textFieldPrenom = new JTextField();
		textFieldPrenom.setForeground(new Color(255, 255, 255));
		textFieldPrenom.setBackground(new Color(0, 0, 51));
		sl_modifPanel.putConstraint(SpringLayout.NORTH, textFieldPrenom, 25, SpringLayout.SOUTH, textFieldNom);
		sl_modifPanel.putConstraint(SpringLayout.WEST, textFieldPrenom, 0, SpringLayout.WEST, textFieldNom);
		sl_modifPanel.putConstraint(SpringLayout.EAST, textFieldPrenom, 0, SpringLayout.EAST, textFieldNom);
		textFieldPrenom.setColumns(10);
		modifPanel.add(textFieldPrenom);
		
		comboBoxJours = new JComboBox();
		comboBoxJours.setBackground(new Color(0, 0, 51));
		comboBoxJours.setForeground(new Color(255, 255, 255));
		for(int i = 1; i <= 31; i++) {
			comboBoxJours.addItem(String.valueOf(i));
		}
		sl_modifPanel.putConstraint(SpringLayout.WEST, comboBoxJours, 0, SpringLayout.WEST, textFieldNom);
		sl_modifPanel.putConstraint(SpringLayout.SOUTH, comboBoxJours, 0, SpringLayout.SOUTH, lblNewLabel_1_1);
		modifPanel.add(comboBoxJours);
		
		comboBoxAnnee = new JComboBox();
		for(int i = 1995; i <= 2040; i++) {
			comboBoxAnnee.addItem(String.valueOf(i));
		}
		comboBoxAnnee.setForeground(new Color(255, 255, 255));
		comboBoxAnnee.setBackground(new Color(0, 0, 51));
		sl_modifPanel.putConstraint(SpringLayout.NORTH, comboBoxAnnee, 0, SpringLayout.NORTH, comboBoxJours);
		sl_modifPanel.putConstraint(SpringLayout.EAST, comboBoxAnnee, 0, SpringLayout.EAST, textFieldNom);
		modifPanel.add(comboBoxAnnee);
		
		comboBoxMois = new JComboBox();
		sl_modifPanel.putConstraint(SpringLayout.NORTH, comboBoxMois, 0, SpringLayout.NORTH, comboBoxJours);
		sl_modifPanel.putConstraint(SpringLayout.SOUTH, comboBoxMois, 0, SpringLayout.SOUTH, lblNewLabel_1_1);
		sl_modifPanel.putConstraint(SpringLayout.EAST, comboBoxMois, 74, SpringLayout.EAST, comboBoxJours);
		comboBoxMois.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBoxMois.setForeground(new Color(255, 255, 255));
		comboBoxMois.setBackground(new Color(0, 0, 51));
		sl_modifPanel.putConstraint(SpringLayout.WEST, comboBoxMois, 6, SpringLayout.EAST, comboBoxJours);
		comboBoxMois.setModel(new DefaultComboBoxModel(new String[] {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"}));
		modifPanel.add(comboBoxMois);
		
		textFieldLieuNaissance = new JTextField();
		sl_modifPanel.putConstraint(SpringLayout.WEST, textFieldLieuNaissance, 0, SpringLayout.WEST, textFieldNom);
		sl_modifPanel.putConstraint(SpringLayout.SOUTH, textFieldLieuNaissance, 0, SpringLayout.SOUTH, lblNewLabel_1_1_1);
		sl_modifPanel.putConstraint(SpringLayout.EAST, textFieldLieuNaissance, 0, SpringLayout.EAST, textFieldNom);
		textFieldLieuNaissance.setForeground(Color.WHITE);
		textFieldLieuNaissance.setColumns(10);
		textFieldLieuNaissance.setBackground(new Color(0, 0, 51));
		modifPanel.add(textFieldLieuNaissance);
		
		textFieldCIN = new JTextField();
		sl_modifPanel.putConstraint(SpringLayout.WEST, textFieldCIN, 0, SpringLayout.WEST, textFieldNom);
		sl_modifPanel.putConstraint(SpringLayout.SOUTH, textFieldCIN, 0, SpringLayout.SOUTH, lblNewLabel_1_1_2);
		sl_modifPanel.putConstraint(SpringLayout.EAST, textFieldCIN, 0, SpringLayout.EAST, textFieldNom);
		textFieldCIN.setForeground(Color.WHITE);
		textFieldCIN.setColumns(10);
		textFieldCIN.setBackground(new Color(0, 0, 51));
		modifPanel.add(textFieldCIN);
		
		textFieldAdresse = new JTextField();
		sl_modifPanel.putConstraint(SpringLayout.WEST, textFieldAdresse, 0, SpringLayout.WEST, textFieldNom);
		sl_modifPanel.putConstraint(SpringLayout.SOUTH, textFieldAdresse, 0, SpringLayout.SOUTH, lblNewLabel_1_1_3);
		sl_modifPanel.putConstraint(SpringLayout.EAST, textFieldAdresse, 0, SpringLayout.EAST, textFieldNom);
		textFieldAdresse.setForeground(Color.WHITE);
		textFieldAdresse.setColumns(10);
		textFieldAdresse.setBackground(new Color(0, 0, 51));
		modifPanel.add(textFieldAdresse);
		
		comboBoxSexe = new JComboBox();
		comboBoxSexe.setModel(new DefaultComboBoxModel(new String[] {"Homme", "Femme", "Autre"}));
		comboBoxSexe.setBackground(new Color(0, 0, 51));
		comboBoxSexe.setForeground(new Color(255, 255, 255));
		sl_modifPanel.putConstraint(SpringLayout.NORTH, comboBoxSexe, 11, SpringLayout.SOUTH, textFieldAdresse);
		sl_modifPanel.putConstraint(SpringLayout.WEST, comboBoxSexe, 0, SpringLayout.WEST, textFieldNom);
		sl_modifPanel.putConstraint(SpringLayout.EAST, comboBoxSexe, 0, SpringLayout.EAST, textFieldNom);
		modifPanel.add(comboBoxSexe);
		
		textFieldContact = new JTextField();
		sl_modifPanel.putConstraint(SpringLayout.NORTH, textFieldContact, 17, SpringLayout.SOUTH, comboBoxSexe);
		sl_modifPanel.putConstraint(SpringLayout.WEST, textFieldContact, 0, SpringLayout.WEST, textFieldNom);
		sl_modifPanel.putConstraint(SpringLayout.EAST, textFieldContact, 0, SpringLayout.EAST, textFieldNom);
		textFieldContact.setForeground(Color.WHITE);
		textFieldContact.setColumns(10);
		textFieldContact.setBackground(new Color(0, 0, 51));
		modifPanel.add(textFieldContact);
		
		btnModifier = new JButton("Modifier");
		btnModifier.setForeground(new Color(255, 255, 255));
		btnModifier.setBackground(new Color(0, 102, 255));
		sl_modifPanel.putConstraint(SpringLayout.WEST, btnModifier, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_modifPanel.putConstraint(SpringLayout.SOUTH, btnModifier, -36, SpringLayout.SOUTH, modifPanel);
		modifPanel.add(btnModifier);
		
		btnAnnuler = new JButton("Annuler");
		sl_modifPanel.putConstraint(SpringLayout.WEST, btnAnnuler, 64, SpringLayout.EAST, btnModifier);
		sl_modifPanel.putConstraint(SpringLayout.SOUTH, btnAnnuler, 0, SpringLayout.SOUTH, btnModifier);
		btnAnnuler.setForeground(Color.WHITE);
		btnAnnuler.setBackground(new Color(0, 102, 255));
		modifPanel.add(btnAnnuler);
		
		textFieldNumCompte = new JTextField();
		sl_modifPanel.putConstraint(SpringLayout.NORTH, textFieldNumCompte, 39, SpringLayout.NORTH, modifPanel);
		sl_modifPanel.putConstraint(SpringLayout.WEST, textFieldNumCompte, 49, SpringLayout.EAST, lblImage);
		sl_modifPanel.putConstraint(SpringLayout.EAST, textFieldNumCompte, 0, SpringLayout.EAST, textFieldNom);
		textFieldNumCompte.setBackground(new Color(0, 0, 0));
		textFieldNumCompte.setForeground(new Color(0, 204, 102));
		textFieldNumCompte.setEditable(false);
		modifPanel.add(textFieldNumCompte);
		textFieldNumCompte.setColumns(10);
		
		lbllienImage = new JLabel("New label");
		sl_modifPanel.putConstraint(SpringLayout.WEST, lbllienImage, 1910, SpringLayout.WEST, lblImage);
		sl_modifPanel.putConstraint(SpringLayout.SOUTH, lbllienImage, 0, SpringLayout.SOUTH, lblNewLabel);
		modifPanel.add(lbllienImage);
		this.init();
	}
	public void init() {
		ModifierController c = new ModifierController(this);
		btnAnnuler.addActionListener(c);
		btnModifier.addActionListener(c);
		btnPrendreImage.addActionListener(c);
		btnChoisirUneImage.addActionListener(c);
	}
}
