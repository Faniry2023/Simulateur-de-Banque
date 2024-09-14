package views.modeClient;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import controller.client.ClientController;
import panel.ClientPanel;
import javax.swing.JTextField;

public class ClientViews extends JFrame{
	public JButton btnSecuriter;
	public JLabel lblImage;
	public JButton btnActualiseEpargne;
	public JButton btnActualiseCourant;
	public JLabel lblSexe;
	public JLabel lblContact;
	public JLabel lblDateNaissance;
	public JLabel lblAdresse;
	public JLabel lblCin;
	public JLabel lblLieuNaissance;
	public JLabel lblPrenom;
	public JLabel lblNom;
	public JButton btnModifier;
	public JButton btnAide;
	public JButton btnSortirDuCompte;
	public JLabel textFieldEp1;
	public JLabel textFieldCou2;
	public JLabel textFieldCou1;
	public JButton btnDepot;
	public JLabel lblNumeroCompte;
	public JLabel textFieldEp2;
	public JButton btnRetrait;
	public JButton btnRetraitPourEpargne;
	public JButton btnConsultationSolde;
	public JButton btnDepotVenantEpargne;
	public JButton btnTransaction;
	public JButton btnDepotCEpargne;
	public JButton btnRetraitE;
	public JButton btnCompteEpargne;
	public JLabel lblNoImage;
	public ClientViews() {
		ClientPanel clientPanel = new ClientPanel();
		this.setContentPane(clientPanel);
		SpringLayout sl_clientPanel = new SpringLayout();
		getContentPane().setLayout(sl_clientPanel);
		
		JLabel lblNewLabel = new JLabel("AGENCE");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblNewLabel, 298, SpringLayout.NORTH, clientPanel);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNewLabel, 95, SpringLayout.WEST, clientPanel);
		lblNewLabel.setFont(new Font("Modern No. 20", Font.ITALIC, 27));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		clientPanel.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		sl_clientPanel.putConstraint(SpringLayout.NORTH, tabbedPane, 42, SpringLayout.SOUTH, lblNewLabel);
		sl_clientPanel.putConstraint(SpringLayout.WEST, tabbedPane, 10, SpringLayout.WEST, clientPanel);
		sl_clientPanel.putConstraint(SpringLayout.SOUTH, tabbedPane, -62, SpringLayout.SOUTH, clientPanel);
		sl_clientPanel.putConstraint(SpringLayout.EAST, tabbedPane, 299, SpringLayout.WEST, clientPanel);
		clientPanel.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("Antananarivo", null, panel, null);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tanjombato : +261 34 15 555 00");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_4, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1_4, 0, SpringLayout.WEST, panel);
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("+261 33 00 000 50");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_5, 6, SpringLayout.SOUTH, lblNewLabel_1_4);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_5, 0, SpringLayout.EAST, lblNewLabel_1_4);
		lblNewLabel_1_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_1_5.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel.add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel_1_1_5_1 = new JLabel("+261 32 00 000 50");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_5_1, 4, SpringLayout.SOUTH, lblNewLabel_1_1_5);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_5_1, 0, SpringLayout.EAST, lblNewLabel_1_4);
		lblNewLabel_1_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_5_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel.add(lblNewLabel_1_1_5_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Ambohipo : +261 34 15 555 11");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_4_1, 6, SpringLayout.SOUTH, lblNewLabel_1_1_5_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1_4_1, 10, SpringLayout.WEST, panel);
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_1_5_1_1 = new JLabel("+261 32 01 000 50");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_5_1_1, 3, SpringLayout.SOUTH, lblNewLabel_1_4_1);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_5_1_1, 0, SpringLayout.EAST, lblNewLabel_1_4);
		lblNewLabel_1_1_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_5_1_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel.add(lblNewLabel_1_1_5_1_1);
		
		JLabel lblNewLabel_1_1_5_1_2 = new JLabel("+261 33 00 000 01");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_5_1_2, 6, SpringLayout.SOUTH, lblNewLabel_1_1_5_1_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1_1_5_1_2, 0, SpringLayout.WEST, lblNewLabel_1_1_5);
		lblNewLabel_1_1_5_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_5_1_2.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel.add(lblNewLabel_1_1_5_1_2);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("67 Ha:              +261 34 15 155 11");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_4_1_1, 6, SpringLayout.SOUTH, lblNewLabel_1_1_5_1_2);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1_4_1_1, 0, SpringLayout.WEST, lblNewLabel_1_4_1);
		lblNewLabel_1_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel.add(lblNewLabel_1_4_1_1);
		
		JLabel lblNewLabel_1_1_5_1_2_1 = new JLabel("+261 33 32 000 01");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_5_1_2_1, 0, SpringLayout.SOUTH, lblNewLabel_1_4_1_1);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_5_1_2_1, 0, SpringLayout.EAST, lblNewLabel_1_4);
		lblNewLabel_1_1_5_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_5_1_2_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel.add(lblNewLabel_1_1_5_1_2_1);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Analakely : +261 34 00 959 11");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_4_1_2, 6, SpringLayout.SOUTH, lblNewLabel_1_1_5_1_2_1);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1_4_1_2, 0, SpringLayout.EAST, lblNewLabel_1_4);
		lblNewLabel_1_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_2.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel.add(lblNewLabel_1_4_1_2);
		
		JLabel lblNewLabel_1_4_1_3 = new JLabel("Ambohitrimanjaka : +261 34 11 111 11");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_4_1_3, 6, SpringLayout.SOUTH, lblNewLabel_1_4_1_2);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1_4_1_3, 0, SpringLayout.WEST, panel);
		lblNewLabel_1_4_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_3.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel.add(lblNewLabel_1_4_1_3);
		
		JLabel lblNewLabel_1_4_1_3_1 = new JLabel("Ankadivato : +261 33 12 111 11");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_4_1_3_1, 6, SpringLayout.SOUTH, lblNewLabel_1_4_1_3);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1_4_1_3_1, 0, SpringLayout.EAST, lblNewLabel_1_4);
		lblNewLabel_1_4_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_3_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel.add(lblNewLabel_1_4_1_3_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("  Antsirabe  ", null, panel_1, null);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Ambohimena : +261 34 58 952 55");
		lblNewLabel_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 26, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, panel_1);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("+261 33 58 000 50");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_1_1, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Antsenakely : +261 34 10 000 00");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1_2, 10, SpringLayout.SOUTH, lblNewLabel_1_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_1_2, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("+261 32 58 000 50");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_1, 6, SpringLayout.SOUTH, lblNewLabel_1_2);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_1, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("+261 33 58 990 50");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_2, 6, SpringLayout.SOUTH, lblNewLabel_1_1_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1_1_2, 0, SpringLayout.WEST, lblNewLabel_1_1);
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Vatofotsy :    +261 34 90 000 02");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1_2_1, 6, SpringLayout.SOUTH, lblNewLabel_1_1_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1_2_1, 10, SpringLayout.WEST, panel_1);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("+261 33 00 990 50");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_2_1, 6, SpringLayout.SOUTH, lblNewLabel_1_2_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_2_1, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Mandaniresaka :   +261 34 10 000 11");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1_2_2, 10, SpringLayout.WEST, panel_1);
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("+261 33 58 000 50");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_3, 208, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_1_2_2, -6, SpringLayout.NORTH, lblNewLabel_1_1_3);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_3, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_1_1_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("Fianarantsoa", null, panel_2, null);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Alakamisy : +261 34 58 887 85");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1_3, 10, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_1_3, 10, SpringLayout.WEST, panel_2);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel(" +261 33 58 666 50");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_4, 6, SpringLayout.SOUTH, lblNewLabel_1_3);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_4, 0, SpringLayout.EAST, lblNewLabel_1_3);
		lblNewLabel_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_1_4.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_2.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Anjoma :      +261 34 58 887 88");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1_3_1, 6, SpringLayout.SOUTH, lblNewLabel_1_1_4);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_1_3_1, 10, SpringLayout.WEST, panel_2);
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_2.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_4_1 = new JLabel(" +261 33 58 666 51");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_4_1, 6, SpringLayout.SOUTH, lblNewLabel_1_3_1);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_4_1, 0, SpringLayout.EAST, lblNewLabel_1_3);
		lblNewLabel_1_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_4_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_2.add(lblNewLabel_1_1_4_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Talatamaty :+261 34 58 999 99");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1_3_1_1, 21, SpringLayout.SOUTH, lblNewLabel_1_1_4_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_1_3_1_1, 0, SpringLayout.WEST, lblNewLabel_1_3);
		lblNewLabel_1_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_2.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_1_4_1_1 = new JLabel(" +261 33 08 006 51");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_4_1_1, 6, SpringLayout.SOUTH, lblNewLabel_1_3_1_1);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_4_1_1, 0, SpringLayout.EAST, lblNewLabel_1_3);
		lblNewLabel_1_1_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_4_1_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_2.add(lblNewLabel_1_1_4_1_1);
		
		JLabel lblNewLabel_1_1_4_1_2 = new JLabel(" +261 34 58 069 59");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_4_1_2, 6, SpringLayout.SOUTH, lblNewLabel_1_1_4_1_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_1_1_4_1_2, 0, SpringLayout.WEST, lblNewLabel_1_1_4_1);
		lblNewLabel_1_1_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_4_1_2.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_2.add(lblNewLabel_1_1_4_1_2);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Ambalakisoa :+261 34 58 999 99");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1_3_1_1_1, 6, SpringLayout.SOUTH, lblNewLabel_1_1_4_1_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_1_3_1_1_1, 0, SpringLayout.EAST, lblNewLabel_1_3_1_1);
		lblNewLabel_1_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_2.add(lblNewLabel_1_3_1_1_1);
		
		JLabel lblNewLabel_1_1_4_1_2_1 = new JLabel("  +261 34 58 001 29");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_4_1_2_1, 6, SpringLayout.SOUTH, lblNewLabel_1_3_1_1_1);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_1_1_4_1_2_1, 0, SpringLayout.EAST, lblNewLabel_1_3);
		lblNewLabel_1_1_4_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_4_1_2_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		panel_2.add(lblNewLabel_1_1_4_1_2_1);
		
		btnSortirDuCompte = new JButton("Sortir de mon Compte");
		btnSortirDuCompte.setBackground(Color.RED);
		btnSortirDuCompte.setForeground(Color.WHITE);
		sl_clientPanel.putConstraint(SpringLayout.NORTH, btnSortirDuCompte, 12, SpringLayout.SOUTH, tabbedPane);
		sl_clientPanel.putConstraint(SpringLayout.WEST, btnSortirDuCompte, 0, SpringLayout.WEST, tabbedPane);
		clientPanel.add(btnSortirDuCompte);
		
		btnAide = new JButton();
		sl_clientPanel.putConstraint(SpringLayout.WEST, btnAide, -101, SpringLayout.EAST, tabbedPane);
		ImageIcon iconeA1 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\aide.png");
		Image imaIccA1 = iconeA1.getImage();
		Image imscallA1 = imaIccA1.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		ImageIcon scalVrA1 = new ImageIcon(imscallA1);
		btnAide.setIcon(scalVrA1);
		btnAide.setText("Aide");
		btnAide.setBackground(Color.GRAY);
		sl_clientPanel.putConstraint(SpringLayout.NORTH, btnAide, 0, SpringLayout.NORTH, btnSortirDuCompte);
		sl_clientPanel.putConstraint(SpringLayout.EAST, btnAide, 0, SpringLayout.EAST, tabbedPane);
		btnAide.setForeground(Color.WHITE);
		clientPanel.add(btnAide);
		
		lblNumeroCompte = new JLabel("558-G12");
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNumeroCompte, 246, SpringLayout.EAST, lblNewLabel);
		sl_clientPanel.putConstraint(SpringLayout.EAST, lblNumeroCompte, 307, SpringLayout.EAST, lblNewLabel);
		lblNumeroCompte.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNumeroCompte.setForeground(new Color(0, 255, 64));
		clientPanel.add(lblNumeroCompte);
		
		JLabel lblNewLabel_2 = new JLabel("Nom :");
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 339, SpringLayout.WEST, clientPanel);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		clientPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Prenom :");
		sl_clientPanel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -22, SpringLayout.NORTH, lblNewLabel_2_1);
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1, 0, SpringLayout.NORTH, tabbedPane);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2_1, 0, SpringLayout.WEST, lblNewLabel_2);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		clientPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Date de naissance :");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1_1, 25, SpringLayout.SOUTH, lblNewLabel_2_1);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2_1_1, 0, SpringLayout.WEST, lblNewLabel_2);
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		clientPanel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Lieu de naissance :");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1_2, 20, SpringLayout.SOUTH, lblNewLabel_2_1_1);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2_1_2, 0, SpringLayout.WEST, lblNewLabel_2);
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		clientPanel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("CIN :");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1_3, 20, SpringLayout.SOUTH, lblNewLabel_2_1_2);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2_1_3, 0, SpringLayout.WEST, lblNewLabel_2);
		lblNewLabel_2_1_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_3.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		clientPanel.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Adresse et Lot :");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1_4, 22, SpringLayout.SOUTH, lblNewLabel_2_1_3);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2_1_4, 0, SpringLayout.WEST, lblNewLabel_2);
		lblNewLabel_2_1_4.setForeground(Color.WHITE);
		lblNewLabel_2_1_4.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		clientPanel.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Sexe :");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1_5, 24, SpringLayout.SOUTH, lblNewLabel_2_1_4);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2_1_5, 0, SpringLayout.WEST, lblNewLabel_2);
		lblNewLabel_2_1_5.setForeground(Color.WHITE);
		lblNewLabel_2_1_5.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		clientPanel.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("Contact :");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1_6, 20, SpringLayout.SOUTH, lblNewLabel_2_1_5);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2_1_6, 0, SpringLayout.WEST, lblNewLabel_2);
		lblNewLabel_2_1_6.setForeground(Color.WHITE);
		lblNewLabel_2_1_6.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		clientPanel.add(lblNewLabel_2_1_6);
		
		JLabel lblNewLabel_2_1_7 = new JLabel("Numero de compte");
		sl_clientPanel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2_1_7, -426, SpringLayout.SOUTH, clientPanel);
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblNumeroCompte, 6, SpringLayout.SOUTH, lblNewLabel_2_1_7);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2_1_7, 420, SpringLayout.WEST, clientPanel);
		lblNewLabel_2_1_7.setForeground(Color.WHITE);
		lblNewLabel_2_1_7.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		clientPanel.add(lblNewLabel_2_1_7);
		
		btnModifier = new JButton("Modifier");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, btnModifier, 13, SpringLayout.SOUTH, lblNewLabel_2_1_6);
		sl_clientPanel.putConstraint(SpringLayout.WEST, btnModifier, 40, SpringLayout.EAST, tabbedPane);
		sl_clientPanel.putConstraint(SpringLayout.EAST, btnModifier, 334, SpringLayout.EAST, tabbedPane);
		clientPanel.add(btnModifier);
		
		lblNom = new JLabel("RAFANOMEZANTSOA");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblNom, 0, SpringLayout.NORTH, lblNewLabel_2);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNom, 94, SpringLayout.EAST, lblNewLabel_2);
		lblNom.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblNom.setForeground(Color.WHITE);
		clientPanel.add(lblNom);
		
		lblPrenom = new JLabel("Mahazo Tina Faniry");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblPrenom, 0, SpringLayout.NORTH, lblNewLabel_2_1);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblPrenom, 0, SpringLayout.WEST, lblNom);
		lblPrenom.setForeground(Color.WHITE);
		lblPrenom.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		clientPanel.add(lblPrenom);
		
		lblDateNaissance = new JLabel("2001-02-08");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblDateNaissance, 0, SpringLayout.NORTH, lblNewLabel_2_1_1);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblDateNaissance, 0, SpringLayout.WEST, lblNom);
		lblDateNaissance.setForeground(Color.WHITE);
		lblDateNaissance.setFont(new Font("Gill Sans MT", Font.PLAIN, 12));
		clientPanel.add(lblDateNaissance);
		
		lblLieuNaissance = new JLabel("Fianarantsoa");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblLieuNaissance, 0, SpringLayout.NORTH, lblNewLabel_2_1_2);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblLieuNaissance, 0, SpringLayout.WEST, lblNom);
		lblLieuNaissance.setForeground(Color.WHITE);
		lblLieuNaissance.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		clientPanel.add(lblLieuNaissance);
		
		lblCin = new JLabel("108458789524");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblCin, -2, SpringLayout.NORTH, lblNewLabel_2_1_3);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblCin, 0, SpringLayout.WEST, lblNom);
		lblCin.setForeground(Color.WHITE);
		lblCin.setFont(new Font("Gill Sans MT", Font.PLAIN, 12));
		clientPanel.add(lblCin);
		
		lblAdresse = new JLabel("Fianarantsoa 5896");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblAdresse, -2, SpringLayout.NORTH, lblNewLabel_2_1_4);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblAdresse, 0, SpringLayout.WEST, lblNom);
		lblAdresse.setForeground(Color.WHITE);
		lblAdresse.setFont(new Font("Gill Sans MT", Font.PLAIN, 12));
		clientPanel.add(lblAdresse);
		
		lblSexe = new JLabel("Homme");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblSexe, 0, SpringLayout.NORTH, lblNewLabel_2_1_5);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblSexe, 0, SpringLayout.WEST, lblNom);
		lblSexe.setForeground(Color.WHITE);
		lblSexe.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		clientPanel.add(lblSexe);
		
		lblContact = new JLabel("+261326698547");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblContact, -2, SpringLayout.NORTH, lblNewLabel_2_1_6);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblContact, 0, SpringLayout.WEST, lblNom);
		lblContact.setForeground(Color.WHITE);
		lblContact.setFont(new Font("Gill Sans MT", Font.PLAIN, 12));
		clientPanel.add(lblContact);
		
		btnSecuriter = new JButton("Confidentialité et Sécuriter");
		btnSecuriter.setBackground(new Color(0, 204, 255));
		sl_clientPanel.putConstraint(SpringLayout.WEST, btnSecuriter, 0, SpringLayout.WEST, lblNewLabel_2);
		sl_clientPanel.putConstraint(SpringLayout.SOUTH, btnSecuriter, -10, SpringLayout.SOUTH, clientPanel);
		sl_clientPanel.putConstraint(SpringLayout.EAST, btnSecuriter, 0, SpringLayout.EAST, btnModifier);
		clientPanel.add(btnSecuriter);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		sl_clientPanel.putConstraint(SpringLayout.NORTH, tabbedPane_1, 0, SpringLayout.NORTH, clientPanel);
		sl_clientPanel.putConstraint(SpringLayout.WEST, tabbedPane_1, -515, SpringLayout.EAST, clientPanel);
		sl_clientPanel.putConstraint(SpringLayout.SOUTH, tabbedPane_1, 0, SpringLayout.SOUTH, btnSortirDuCompte);
		sl_clientPanel.putConstraint(SpringLayout.EAST, tabbedPane_1, -10, SpringLayout.EAST, clientPanel);
		clientPanel.add(tabbedPane_1);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		tabbedPane_1.addTab("                           Compte Courant                       ", null, panel_3, null);
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);
		
		JPanel panel_5 = new JPanel();
		sl_panel_3.putConstraint(SpringLayout.WEST, panel_5, 196, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, panel_5, 46, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, panel_5, -195, SpringLayout.EAST, panel_3);
		panel_3.add(panel_5);
		SpringLayout sl_panel_5 = new SpringLayout();
		panel_5.setLayout(sl_panel_5);
		
		JLabel lblNewLabel_3 = new JLabel("   HISTORIQUE");
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 1, SpringLayout.NORTH, panel_5);
		sl_panel_5.putConstraint(SpringLayout.WEST, lblNewLabel_3, 10, SpringLayout.WEST, panel_5);
		sl_panel_5.putConstraint(SpringLayout.EAST, lblNewLabel_3, -10, SpringLayout.EAST, panel_5);
		panel_5.add(lblNewLabel_3);
		
		btnActualiseCourant = new JButton("Actualiser Compte Courant");
		sl_panel_3.putConstraint(SpringLayout.NORTH, panel_5, 6, SpringLayout.SOUTH, btnActualiseCourant);
		sl_panel_3.putConstraint(SpringLayout.NORTH, btnActualiseCourant, 0, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, btnActualiseCourant, 0, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, btnActualiseCourant, 0, SpringLayout.EAST, panel_3);
		btnActualiseCourant.setForeground(new Color(255, 255, 255));
		btnActualiseCourant.setBackground(new Color(0, 0, 0));
		panel_3.add(btnActualiseCourant);
		
		JPanel panel_6 = new JPanel();
		sl_panel_3.putConstraint(SpringLayout.NORTH, panel_6, 6, SpringLayout.SOUTH, panel_5);
		sl_panel_3.putConstraint(SpringLayout.WEST, panel_6, 0, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, panel_6, -517, SpringLayout.SOUTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, panel_6, 500, SpringLayout.WEST, panel_3);
		panel_6.setBackground(Color.GRAY);
		panel_3.add(panel_6);
		SpringLayout sl_panel_6 = new SpringLayout();
		panel_6.setLayout(sl_panel_6);
		
		String a = "Vous avez fait un depot de (80000000000ar) le (12-05-2021)\n Votre solde est maintenant de (998855)";
		
		JPanel panel_8 = new JPanel();
		sl_panel_3.putConstraint(SpringLayout.NORTH, panel_8, 29, SpringLayout.SOUTH, panel_6);
		sl_panel_3.putConstraint(SpringLayout.WEST, panel_8, 0, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, panel_8, 0, SpringLayout.EAST, btnActualiseCourant);
		panel_8.setBackground(Color.GRAY);
		panel_3.add(panel_8);
		SpringLayout sl_panel_8 = new SpringLayout();
		panel_8.setLayout(sl_panel_8);
		
		JLabel lblNewLabel_7_1 = new JLabel("ensuite entrer votre montant suivit de votre mot de passe");
		sl_panel_8.putConstraint(SpringLayout.WEST, lblNewLabel_7_1, 98, SpringLayout.WEST, panel_8);
		sl_panel_8.putConstraint(SpringLayout.SOUTH, lblNewLabel_7_1, -10, SpringLayout.SOUTH, panel_8);
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_8.add(lblNewLabel_7_1);
		
		btnDepot = new JButton("DEPOT");
		sl_panel_8.putConstraint(SpringLayout.NORTH, btnDepot, 0, SpringLayout.NORTH, panel_8);
		sl_panel_8.putConstraint(SpringLayout.SOUTH, btnDepot, -49, SpringLayout.SOUTH, panel_8);
		btnDepot.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		btnDepot.setForeground(Color.BLACK);
		sl_panel_8.putConstraint(SpringLayout.WEST, btnDepot, 0, SpringLayout.WEST, panel_8);
		sl_panel_8.putConstraint(SpringLayout.EAST, btnDepot, 0, SpringLayout.EAST, panel_8);
		btnDepot.setBackground(Color.LIGHT_GRAY);
		panel_8.add(btnDepot);
		
		btnConsultationSolde = new JButton("Mon Compte");
		sl_panel_6.putConstraint(SpringLayout.SOUTH, btnConsultationSolde, 0, SpringLayout.SOUTH, panel_6);
		sl_panel_6.putConstraint(SpringLayout.EAST, btnConsultationSolde, -198, SpringLayout.EAST, panel_6);
		sl_panel_8.putConstraint(SpringLayout.WEST, btnConsultationSolde, 72, SpringLayout.WEST, panel_6);
		sl_panel_8.putConstraint(SpringLayout.SOUTH, btnConsultationSolde, 0, SpringLayout.SOUTH, panel_6);
		panel_6.add(btnConsultationSolde);
		btnConsultationSolde.setForeground(Color.WHITE);
		btnConsultationSolde.setBackground(Color.BLACK);
		
		textFieldCou1 = new JLabel("");
		textFieldCou1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sl_panel_6.putConstraint(SpringLayout.NORTH, textFieldCou1, 0, SpringLayout.NORTH, panel_6);
		sl_panel_6.putConstraint(SpringLayout.WEST, textFieldCou1, 0, SpringLayout.WEST, panel_6);
		sl_panel_6.putConstraint(SpringLayout.SOUTH, textFieldCou1, -40, SpringLayout.NORTH, btnConsultationSolde);
		sl_panel_6.putConstraint(SpringLayout.EAST, textFieldCou1, 0, SpringLayout.EAST, panel_6);
		textFieldCou1.setForeground(Color.WHITE);
		panel_6.add(textFieldCou1);
		
		textFieldCou2 = new JLabel("");
		textFieldCou2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sl_panel_6.putConstraint(SpringLayout.NORTH, textFieldCou2, 6, SpringLayout.SOUTH, textFieldCou1);
		sl_panel_6.putConstraint(SpringLayout.WEST, textFieldCou2, 0, SpringLayout.WEST, panel_6);
		sl_panel_6.putConstraint(SpringLayout.SOUTH, textFieldCou2, -6, SpringLayout.NORTH, btnConsultationSolde);
		sl_panel_6.putConstraint(SpringLayout.EAST, textFieldCou2, 0, SpringLayout.EAST, textFieldCou1);
		textFieldCou2.setForeground(Color.WHITE);
		panel_6.add(textFieldCou2);
		
		JPanel panel_10 = new JPanel();
		sl_panel_3.putConstraint(SpringLayout.SOUTH, panel_8, -29, SpringLayout.NORTH, panel_10);
		
		JLabel lblNewLabel_7 = new JLabel("Pour faire un depot, veuillez appuyer sur le bouton ci-dessous");
		sl_panel_8.putConstraint(SpringLayout.WEST, lblNewLabel_7, 84, SpringLayout.WEST, panel_8);
		sl_panel_8.putConstraint(SpringLayout.SOUTH, lblNewLabel_7, -6, SpringLayout.NORTH, lblNewLabel_7_1);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_8.add(lblNewLabel_7);
		sl_panel_3.putConstraint(SpringLayout.NORTH, panel_10, 269, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, panel_10, 0, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, panel_10, 500, SpringLayout.WEST, panel_3);
		panel_10.setBackground(Color.GRAY);
		panel_3.add(panel_10);
		SpringLayout sl_panel_10 = new SpringLayout();
		panel_10.setLayout(sl_panel_10);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("ensuite entrer votre montant suivit de votre mot de passe");
		sl_panel_10.putConstraint(SpringLayout.SOUTH, lblNewLabel_7_1_2, 0, SpringLayout.SOUTH, panel_10);
		sl_panel_10.putConstraint(SpringLayout.EAST, lblNewLabel_7_1_2, -95, SpringLayout.EAST, panel_10);
		lblNewLabel_7_1_2.setForeground(Color.WHITE);
		lblNewLabel_7_1_2.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_10.add(lblNewLabel_7_1_2);
		
		btnRetrait = new JButton("RETRAIT");
		sl_panel_10.putConstraint(SpringLayout.NORTH, btnRetrait, 0, SpringLayout.NORTH, panel_10);
		sl_panel_10.putConstraint(SpringLayout.WEST, btnRetrait, 0, SpringLayout.WEST, panel_10);
		sl_panel_10.putConstraint(SpringLayout.SOUTH, btnRetrait, -48, SpringLayout.SOUTH, panel_10);
		sl_panel_10.putConstraint(SpringLayout.EAST, btnRetrait, 0, SpringLayout.EAST, panel_10);
		btnRetrait.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		btnRetrait.setForeground(Color.BLACK);
		btnRetrait.setBackground(Color.LIGHT_GRAY);
		panel_10.add(btnRetrait);
		
		JPanel panel_12 = new JPanel();
		sl_panel_3.putConstraint(SpringLayout.NORTH, panel_12, 362, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, panel_10, -23, SpringLayout.NORTH, panel_12);
		
		JLabel lblNewLabel_7_2 = new JLabel("Pour faire un retrait, veuillez appuyer sur le bouton ci-dessous");
		sl_panel_10.putConstraint(SpringLayout.SOUTH, lblNewLabel_7_2, -6, SpringLayout.NORTH, lblNewLabel_7_1_2);
		sl_panel_10.putConstraint(SpringLayout.EAST, lblNewLabel_7_2, -86, SpringLayout.EAST, panel_10);
		lblNewLabel_7_2.setForeground(Color.WHITE);
		lblNewLabel_7_2.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_10.add(lblNewLabel_7_2);
		sl_panel_3.putConstraint(SpringLayout.WEST, panel_12, 0, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, panel_12, 500, SpringLayout.WEST, panel_3);
		panel_12.setBackground(Color.GRAY);
		panel_3.add(panel_12);
		SpringLayout sl_panel_12 = new SpringLayout();
		panel_12.setLayout(sl_panel_12);
		
		JLabel lblNewLabel_7_2_1_1 = new JLabel("veuillez appuyer sur le boutton ci-dessous\r\n");
		sl_panel_12.putConstraint(SpringLayout.SOUTH, lblNewLabel_7_2_1_1, -10, SpringLayout.SOUTH, panel_12);
		sl_panel_12.putConstraint(SpringLayout.EAST, lblNewLabel_7_2_1_1, -126, SpringLayout.EAST, panel_12);
		lblNewLabel_7_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_7_2_1_1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_12.add(lblNewLabel_7_2_1_1);
		
		btnDepotVenantEpargne = new JButton("DEPOT VENANT DE MON COMPTE EPARGNE");
		sl_panel_12.putConstraint(SpringLayout.NORTH, btnDepotVenantEpargne, 0, SpringLayout.NORTH, panel_12);
		sl_panel_12.putConstraint(SpringLayout.WEST, btnDepotVenantEpargne, 0, SpringLayout.WEST, panel_12);
		sl_panel_12.putConstraint(SpringLayout.SOUTH, btnDepotVenantEpargne, -60, SpringLayout.SOUTH, panel_12);
		sl_panel_12.putConstraint(SpringLayout.EAST, btnDepotVenantEpargne, 0, SpringLayout.EAST, panel_12);
		btnDepotVenantEpargne.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		btnDepotVenantEpargne.setForeground(Color.BLACK);
		btnDepotVenantEpargne.setBackground(Color.LIGHT_GRAY);
		panel_12.add(btnDepotVenantEpargne);
		
		JPanel panel_14 = new JPanel();
		sl_panel_3.putConstraint(SpringLayout.NORTH, panel_14, 476, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, panel_12, -31, SpringLayout.NORTH, panel_14);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("Pour cette action, votre depot sera retiré de votre compte Epargne\r\n");
		sl_panel_12.putConstraint(SpringLayout.SOUTH, lblNewLabel_7_2_1, -6, SpringLayout.NORTH, lblNewLabel_7_2_1_1);
		sl_panel_12.putConstraint(SpringLayout.EAST, lblNewLabel_7_2_1, -63, SpringLayout.EAST, panel_12);
		lblNewLabel_7_2_1.setForeground(Color.WHITE);
		lblNewLabel_7_2_1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_12.add(lblNewLabel_7_2_1);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, panel_14, -97, SpringLayout.SOUTH, panel_3);
		panel_14.setBackground(Color.GRAY);
		sl_panel_3.putConstraint(SpringLayout.WEST, panel_14, 0, SpringLayout.WEST, btnActualiseCourant);
		sl_panel_3.putConstraint(SpringLayout.EAST, panel_14, 0, SpringLayout.EAST, btnActualiseCourant);
		panel_3.add(panel_14);
		SpringLayout sl_panel_14 = new SpringLayout();
		panel_14.setLayout(sl_panel_14);
		
		JPanel panel_15 = new JPanel();
		sl_panel_3.putConstraint(SpringLayout.NORTH, panel_15, 565, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, panel_15, 207, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, panel_15, 23, SpringLayout.SOUTH, panel_14);
		sl_panel_3.putConstraint(SpringLayout.EAST, panel_15, -184, SpringLayout.EAST, panel_3);
		
		JLabel lblNewLabel_7_2_1_1_1 = new JLabel("veuillez appuyer sur le boutton ci-dessus\r\n");
		sl_panel_14.putConstraint(SpringLayout.SOUTH, lblNewLabel_7_2_1_1_1, -10, SpringLayout.SOUTH, panel_14);
		sl_panel_14.putConstraint(SpringLayout.EAST, lblNewLabel_7_2_1_1_1, -127, SpringLayout.EAST, panel_14);
		lblNewLabel_7_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_7_2_1_1_1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_14.add(lblNewLabel_7_2_1_1_1);
		
		btnRetraitPourEpargne = new JButton("RETRAIT POUR UN DEPOT  SUR MON COMPTE EPARGNE");
		sl_panel_14.putConstraint(SpringLayout.NORTH, btnRetraitPourEpargne, 0, SpringLayout.NORTH, panel_14);
		sl_panel_14.putConstraint(SpringLayout.WEST, btnRetraitPourEpargne, 0, SpringLayout.WEST, panel_14);
		sl_panel_14.putConstraint(SpringLayout.SOUTH, btnRetraitPourEpargne, -56, SpringLayout.SOUTH, panel_14);
		sl_panel_14.putConstraint(SpringLayout.EAST, btnRetraitPourEpargne, 0, SpringLayout.EAST, panel_14);
		btnRetraitPourEpargne.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		btnRetraitPourEpargne.setForeground(Color.BLACK);
		btnRetraitPourEpargne.setBackground(Color.LIGHT_GRAY);
		panel_14.add(btnRetraitPourEpargne);
		
		JLabel lblNewLabel_7_2_1_2 = new JLabel("Pour cetter action, votre retrait sera ajouter dens votre compte epargne");
		sl_panel_14.putConstraint(SpringLayout.SOUTH, lblNewLabel_7_2_1_2, -6, SpringLayout.NORTH, lblNewLabel_7_2_1_1_1);
		sl_panel_14.putConstraint(SpringLayout.EAST, lblNewLabel_7_2_1_2, -50, SpringLayout.EAST, panel_14);
		lblNewLabel_7_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_7_2_1_2.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_14.add(lblNewLabel_7_2_1_2);
		panel_3.add(panel_15);
		SpringLayout sl_panel_15 = new SpringLayout();
		panel_15.setLayout(sl_panel_15);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("TRANSACTION");
		sl_panel_15.putConstraint(SpringLayout.NORTH, lblNewLabel_3_2_1, 0, SpringLayout.NORTH, panel_15);
		sl_panel_15.putConstraint(SpringLayout.WEST, lblNewLabel_3_2_1, 10, SpringLayout.WEST, panel_15);
		sl_panel_15.putConstraint(SpringLayout.EAST, lblNewLabel_3_2_1, 103, SpringLayout.WEST, panel_15);
		panel_15.add(lblNewLabel_3_2_1);
		
		JPanel panel_16 = new JPanel();
		sl_panel_3.putConstraint(SpringLayout.NORTH, panel_16, 4, SpringLayout.SOUTH, panel_15);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, panel_16, 0, SpringLayout.SOUTH, panel_3);
		panel_16.setBackground(Color.GRAY);
		sl_panel_3.putConstraint(SpringLayout.WEST, panel_16, 0, SpringLayout.WEST, btnActualiseCourant);
		sl_panel_3.putConstraint(SpringLayout.EAST, panel_16, 0, SpringLayout.EAST, btnActualiseCourant);
		panel_3.add(panel_16);
		SpringLayout sl_panel_16 = new SpringLayout();
		panel_16.setLayout(sl_panel_16);
		
		JLabel lblNewLabel_7_2_1_2_1 = new JLabel("Pour cette action, vous pouvez éfféctuer un tranfert d'argent");
		sl_panel_16.putConstraint(SpringLayout.NORTH, lblNewLabel_7_2_1_2_1, 0, SpringLayout.NORTH, panel_16);
		sl_panel_16.putConstraint(SpringLayout.EAST, lblNewLabel_7_2_1_2_1, -74, SpringLayout.EAST, panel_16);
		lblNewLabel_7_2_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_7_2_1_2_1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_16.add(lblNewLabel_7_2_1_2_1);
		
		btnTransaction = new JButton("");
		sl_panel_16.putConstraint(SpringLayout.NORTH, btnTransaction, 6, SpringLayout.SOUTH, lblNewLabel_7_2_1_2_1);
		sl_panel_16.putConstraint(SpringLayout.WEST, btnTransaction, 216, SpringLayout.WEST, panel_16);
		sl_panel_16.putConstraint(SpringLayout.SOUTH, btnTransaction, 0, SpringLayout.SOUTH, panel_16);
		ImageIcon icone221 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\transfert.png");
		Image imaIcc221 = icone221.getImage();
		Image imscall221 = imaIcc221.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon scalVr221 = new ImageIcon(imscall221);
		btnTransaction.setIcon(scalVr221);
		btnTransaction.setBackground(Color.GRAY);
		panel_16.add(btnTransaction);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.DARK_GRAY);
		tabbedPane_1.addTab("                      Compte Epargne                 ", null, panel_4, null);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);
		
		btnActualiseEpargne = new JButton("Actualiser Compte Epargne");
		sl_panel_4.putConstraint(SpringLayout.NORTH, btnActualiseEpargne, 0, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, btnActualiseEpargne, 0, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, btnActualiseEpargne, 0, SpringLayout.EAST, panel_4);
		btnActualiseEpargne.setForeground(Color.WHITE);
		btnActualiseEpargne.setBackground(Color.BLACK);
		panel_4.add(btnActualiseEpargne);
		
		JPanel panel_17 = new JPanel();
		sl_panel_4.putConstraint(SpringLayout.NORTH, panel_17, 3, SpringLayout.SOUTH, btnActualiseEpargne);
		sl_panel_4.putConstraint(SpringLayout.WEST, panel_17, 186, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, panel_17, 17, SpringLayout.SOUTH, btnActualiseEpargne);
		sl_panel_4.putConstraint(SpringLayout.EAST, panel_17, -199, SpringLayout.EAST, panel_4);
		panel_4.add(panel_17);
		SpringLayout sl_panel_17 = new SpringLayout();
		panel_17.setLayout(sl_panel_17);
		
		JLabel lblNewLabel_5 = new JLabel("");
		sl_panel_17.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 0, SpringLayout.NORTH, panel_17);
		sl_panel_17.putConstraint(SpringLayout.WEST, lblNewLabel_5, 10, SpringLayout.WEST, panel_17);
		sl_panel_17.putConstraint(SpringLayout.EAST, lblNewLabel_5, 112, SpringLayout.WEST, panel_17);
		panel_17.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_3 = new JLabel("   HISTORIQUE");
		sl_panel_17.putConstraint(SpringLayout.NORTH, lblNewLabel_3_3, 0, SpringLayout.NORTH, lblNewLabel_5);
		sl_panel_17.putConstraint(SpringLayout.WEST, lblNewLabel_3_3, 10, SpringLayout.WEST, lblNewLabel_5);
		panel_17.add(lblNewLabel_3_3);
		
		JPanel panel_18 = new JPanel();
		sl_panel_4.putConstraint(SpringLayout.NORTH, panel_18, 10, SpringLayout.SOUTH, panel_17);
		sl_panel_4.putConstraint(SpringLayout.WEST, panel_18, 0, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, panel_18, -499, SpringLayout.SOUTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, panel_18, 0, SpringLayout.EAST, btnActualiseEpargne);
		panel_18.setBackground(Color.GRAY);
		panel_4.add(panel_18);
		SpringLayout sl_panel_18 = new SpringLayout();
		panel_18.setLayout(sl_panel_18);
		
		btnCompteEpargne = new JButton("Mon compte");
		sl_panel_18.putConstraint(SpringLayout.WEST, btnCompteEpargne, 170, SpringLayout.WEST, panel_18);
		sl_panel_18.putConstraint(SpringLayout.SOUTH, btnCompteEpargne, 0, SpringLayout.SOUTH, panel_18);
		sl_panel_18.putConstraint(SpringLayout.EAST, btnCompteEpargne, 306, SpringLayout.WEST, panel_18);
		btnCompteEpargne.setBackground(Color.BLACK);
		btnCompteEpargne.setForeground(Color.WHITE);
		panel_18.add(btnCompteEpargne);
		
		textFieldEp1 = new JLabel("");
		sl_panel_18.putConstraint(SpringLayout.NORTH, textFieldEp1, 26, SpringLayout.NORTH, panel_18);
		sl_panel_18.putConstraint(SpringLayout.EAST, textFieldEp1, -10, SpringLayout.EAST, panel_18);
		textFieldEp1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldEp1.setForeground(Color.WHITE);
		panel_18.add(textFieldEp1);
		
		textFieldEp2 = new JLabel("");
		sl_panel_18.putConstraint(SpringLayout.NORTH, textFieldEp2, 55, SpringLayout.NORTH, panel_18);
		sl_panel_18.putConstraint(SpringLayout.WEST, textFieldEp2, 0, SpringLayout.WEST, panel_18);
		sl_panel_18.putConstraint(SpringLayout.SOUTH, textFieldEp2, -6, SpringLayout.NORTH, btnCompteEpargne);
		sl_panel_18.putConstraint(SpringLayout.EAST, textFieldEp2, 0, SpringLayout.EAST, panel_18);
		sl_panel_18.putConstraint(SpringLayout.WEST, textFieldEp1, 0, SpringLayout.WEST, textFieldEp2);
		sl_panel_18.putConstraint(SpringLayout.SOUTH, textFieldEp1, -6, SpringLayout.NORTH, textFieldEp2);
		textFieldEp2.setForeground(Color.WHITE);
		panel_18.add(textFieldEp2);
		
		JPanel panel_20 = new JPanel();
		sl_panel_4.putConstraint(SpringLayout.NORTH, panel_20, 127, SpringLayout.SOUTH, panel_18);
		sl_panel_4.putConstraint(SpringLayout.WEST, panel_20, 0, SpringLayout.WEST, btnActualiseEpargne);
		sl_panel_4.putConstraint(SpringLayout.EAST, panel_20, 0, SpringLayout.EAST, btnActualiseEpargne);
		panel_20.setBackground(Color.GRAY);
		panel_4.add(panel_20);
		SpringLayout sl_panel_20 = new SpringLayout();
		panel_20.setLayout(sl_panel_20);
		
		JPanel panel_22 = new JPanel();
		sl_panel_4.putConstraint(SpringLayout.NORTH, panel_22, 499, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, panel_22, -50, SpringLayout.SOUTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, panel_20, -99, SpringLayout.NORTH, panel_22);
		sl_panel_4.putConstraint(SpringLayout.WEST, panel_22, 0, SpringLayout.WEST, btnActualiseEpargne);
		sl_panel_4.putConstraint(SpringLayout.EAST, panel_22, 0, SpringLayout.EAST, btnActualiseEpargne);
		panel_22.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_7_1_3 = new JLabel("ensuite entrer votre montant suivit de votre mot de passe");
		lblNewLabel_7_1_3.setForeground(Color.WHITE);
		lblNewLabel_7_1_3.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_20.add(lblNewLabel_7_1_3);
		
		JLabel lblNewLabel_7_1_1_2 = new JLabel("premier boutton : valider , deuxieme boutton : effacer, troisieme boutton : annuler");
		sl_panel_20.putConstraint(SpringLayout.WEST, lblNewLabel_7_1_1_2, 27, SpringLayout.WEST, panel_20);
		sl_panel_20.putConstraint(SpringLayout.SOUTH, lblNewLabel_7_1_1_2, -10, SpringLayout.SOUTH, panel_20);
		lblNewLabel_7_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_7_1_1_2.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_20.add(lblNewLabel_7_1_1_2);
		
		btnDepotCEpargne = new JButton("DEPOT");
		sl_panel_20.putConstraint(SpringLayout.EAST, btnDepotCEpargne, 500, SpringLayout.WEST, panel_20);
		sl_panel_20.putConstraint(SpringLayout.NORTH, btnDepotCEpargne, 0, SpringLayout.NORTH, panel_20);
		sl_panel_20.putConstraint(SpringLayout.WEST, btnDepotCEpargne, 0, SpringLayout.WEST, panel_20);
		btnDepotCEpargne.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		btnDepotCEpargne.setBackground(Color.LIGHT_GRAY);
		panel_20.add(btnDepotCEpargne);
		
		JLabel lblNewLabel_7_3 = new JLabel("Pour faire un depot, veuillez appuyer sur le bouton ci-dessous");
		sl_panel_20.putConstraint(SpringLayout.SOUTH, btnDepotCEpargne, -19, SpringLayout.NORTH, lblNewLabel_7_3);
		sl_panel_20.putConstraint(SpringLayout.SOUTH, lblNewLabel_7_3, -65, SpringLayout.SOUTH, panel_20);
		sl_panel_20.putConstraint(SpringLayout.NORTH, lblNewLabel_7_1_3, 6, SpringLayout.SOUTH, lblNewLabel_7_3);
		sl_panel_20.putConstraint(SpringLayout.EAST, lblNewLabel_7_1_3, -10, SpringLayout.EAST, lblNewLabel_7_3);
		sl_panel_20.putConstraint(SpringLayout.WEST, lblNewLabel_7_3, 84, SpringLayout.WEST, panel_20);
		lblNewLabel_7_3.setForeground(Color.WHITE);
		lblNewLabel_7_3.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_20.add(lblNewLabel_7_3);
		panel_4.add(panel_22);
		SpringLayout sl_panel_22 = new SpringLayout();
		panel_22.setLayout(sl_panel_22);
		
		JLabel lblNewLabel_7_2_2 = new JLabel("Pour faire un retrait, veuillez appuyer sur le bouton ci-dessous");
		sl_panel_22.putConstraint(SpringLayout.EAST, lblNewLabel_7_2_2, -81, SpringLayout.EAST, panel_22);
		lblNewLabel_7_2_2.setForeground(Color.WHITE);
		lblNewLabel_7_2_2.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_22.add(lblNewLabel_7_2_2);
		
		JLabel lblNewLabel_7_1_2_1 = new JLabel("ensuite entrer votre montant suivit de votre mot de passe");
		sl_panel_22.putConstraint(SpringLayout.SOUTH, lblNewLabel_7_2_2, -6, SpringLayout.NORTH, lblNewLabel_7_1_2_1);
		sl_panel_22.putConstraint(SpringLayout.WEST, lblNewLabel_7_1_2_1, 99, SpringLayout.WEST, panel_22);
		lblNewLabel_7_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_7_1_2_1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_22.add(lblNewLabel_7_1_2_1);
		
		JLabel lblNewLabel_7_1_1_2_1 = new JLabel("premier boutton : valider , deuxieme boutton : effacer, troisieme boutton : annuler");
		sl_panel_22.putConstraint(SpringLayout.SOUTH, lblNewLabel_7_1_1_2_1, -22, SpringLayout.SOUTH, panel_22);
		sl_panel_22.putConstraint(SpringLayout.SOUTH, lblNewLabel_7_1_2_1, -6, SpringLayout.NORTH, lblNewLabel_7_1_1_2_1);
		sl_panel_22.putConstraint(SpringLayout.WEST, lblNewLabel_7_1_1_2_1, 28, SpringLayout.WEST, panel_22);
		lblNewLabel_7_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_7_1_1_2_1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		panel_22.add(lblNewLabel_7_1_1_2_1);
		
		btnRetraitE = new JButton("RETRAIT");
		sl_panel_22.putConstraint(SpringLayout.NORTH, btnRetraitE, 0, SpringLayout.NORTH, panel_22);
		sl_panel_22.putConstraint(SpringLayout.WEST, btnRetraitE, 0, SpringLayout.WEST, panel_22);
		sl_panel_22.putConstraint(SpringLayout.SOUTH, btnRetraitE, -91, SpringLayout.SOUTH, panel_22);
		sl_panel_22.putConstraint(SpringLayout.EAST, btnRetraitE, 490, SpringLayout.WEST, panel_22);
		btnRetraitE.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		btnRetraitE.setBackground(Color.LIGHT_GRAY);
		btnRetraitE.setForeground(Color.BLACK);
		panel_22.add(btnRetraitE);
		ImageIcon icone2EC = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\deporetr.png");
		Image imaIcc2EC = icone2EC.getImage();
		Image imscall2EC = imaIcc2EC.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon scalVr2EC = new ImageIcon(imscall2EC);
		ImageIcon icone22RE = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\deporetr.png");
		Image imaIcc22RE = icone22RE.getImage();
		Image imscall22RE = imaIcc22RE.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon scalVr22RE = new ImageIcon(imscall22RE);
		
		JLabel lblNewLabel_6 = new JLabel("OurBankmada@gmail-mg.com");
		sl_clientPanel.putConstraint(SpringLayout.SOUTH, lblNewLabel_6, 0, SpringLayout.SOUTH, btnSecuriter);
		sl_clientPanel.putConstraint(SpringLayout.EAST, lblNewLabel_6, -342, SpringLayout.EAST, clientPanel);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_6.setForeground(Color.WHITE);
		clientPanel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("OurBank Madagascar officiel");
		sl_clientPanel.putConstraint(SpringLayout.SOUTH, lblNewLabel_6_1, 0, SpringLayout.SOUTH, btnSecuriter);
		sl_clientPanel.putConstraint(SpringLayout.EAST, lblNewLabel_6_1, -40, SpringLayout.EAST, clientPanel);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_6_1.setForeground(Color.WHITE);
		clientPanel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("+261 34 47 411 33");
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNewLabel_6_2, 45, SpringLayout.EAST, lblNewLabel_6);
		sl_clientPanel.putConstraint(SpringLayout.SOUTH, lblNewLabel_6_2, 0, SpringLayout.SOUTH, btnSecuriter);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_6_2.setForeground(Color.WHITE);
		clientPanel.add(lblNewLabel_6_2);
		
		lblImage = new JLabel("");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblImage, -240, SpringLayout.NORTH, lblNewLabel_2_1_7);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblImage, 350, SpringLayout.WEST, clientPanel);
		sl_clientPanel.putConstraint(SpringLayout.SOUTH, lblImage, -11, SpringLayout.NORTH, lblNewLabel_2_1_7);
		sl_clientPanel.putConstraint(SpringLayout.EAST, lblImage, -58, SpringLayout.WEST, tabbedPane_1);
		clientPanel.add(lblImage);
		
		lblNoImage = new JLabel("");
		sl_clientPanel.putConstraint(SpringLayout.NORTH, lblNoImage, 0, SpringLayout.NORTH, clientPanel);
		sl_clientPanel.putConstraint(SpringLayout.WEST, lblNoImage, -42, SpringLayout.WEST, btnAide);
		sl_clientPanel.putConstraint(SpringLayout.SOUTH, lblNoImage, -6, SpringLayout.NORTH, lblImage);
		sl_clientPanel.putConstraint(SpringLayout.EAST, lblNoImage, -6, SpringLayout.WEST, tabbedPane_1);
		lblNoImage.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNoImage.setForeground(Color.RED);
		clientPanel.add(lblNoImage);
		
		this.redirection();
	}
	public void redirection() {
		ClientController controlle = new ClientController(this);
		btnSortirDuCompte.addActionListener(controlle);
		btnAide.addActionListener(controlle);
		btnModifier.addActionListener(controlle);
		btnSecuriter.addActionListener(controlle);
		btnActualiseCourant.addActionListener(controlle);
		btnConsultationSolde.addActionListener(controlle);
		btnDepot.addActionListener(controlle);
		btnRetrait.addActionListener(controlle);
		btnDepotVenantEpargne.addActionListener(controlle);
		btnRetraitPourEpargne.addActionListener(controlle);
		btnTransaction.addActionListener(controlle);
		btnCompteEpargne.addActionListener(controlle);
		btnActualiseEpargne.addActionListener(controlle);
		btnDepotCEpargne.addActionListener(controlle);
		btnRetraitE.addActionListener(controlle);
	}
}
