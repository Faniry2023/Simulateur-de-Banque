package views.modeGestionnaire;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

import panel.GestionnairePannel;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import controller.gestionnaire.GestionnaireController;

import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.Image;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GestionnaireViews extends JFrame{
	public JTable table;
	private JTable table_1;
	public JTextField textFieldTotalSolde;
	public JTextField textFieldCourant;
	public JTextField textFieldEpargne;
	public JTextField textFieldNbClient;
	public JLabel lblNon;
	public JButton btnPhoto;
	public JButton btnSupprimer;
	public JButton btnRetour;
	public GestionnaireViews() {
		GestionnairePannel gestionnairePannel = new GestionnairePannel();
		this.setContentPane(gestionnairePannel);
		SpringLayout sl_gestionnairePannel = new SpringLayout();
		getContentPane().setLayout(sl_gestionnairePannel);
		
		table = new JTable();
		sl_gestionnairePannel.putConstraint(SpringLayout.SOUTH, table, -197, SpringLayout.SOUTH, gestionnairePannel);
		table.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		table.setForeground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"compte", "nom", "prenom", "cin", "adresse", "contact"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		sl_gestionnairePannel.putConstraint(SpringLayout.NORTH, table, 32, SpringLayout.NORTH, gestionnairePannel);
		sl_gestionnairePannel.putConstraint(SpringLayout.EAST, table, -12, SpringLayout.EAST, gestionnairePannel);
		table.setBackground(Color.DARK_GRAY);
		gestionnairePannel.add(table);
		
		JPanel panel = new JPanel();
		sl_gestionnairePannel.putConstraint(SpringLayout.WEST, table, 6, SpringLayout.EAST, panel);
		sl_gestionnairePannel.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, gestionnairePannel);
		sl_gestionnairePannel.putConstraint(SpringLayout.EAST, panel, -675, SpringLayout.EAST, gestionnairePannel);
		panel.setBackground(Color.DARK_GRAY);
		sl_gestionnairePannel.putConstraint(SpringLayout.NORTH, panel, -302, SpringLayout.SOUTH, gestionnairePannel);
		sl_gestionnairePannel.putConstraint(SpringLayout.SOUTH, panel, -207, SpringLayout.SOUTH, gestionnairePannel);
		gestionnairePannel.add(panel);
		
		JPanel panel_1 = new JPanel();
		sl_gestionnairePannel.putConstraint(SpringLayout.NORTH, panel_1, 14, SpringLayout.SOUTH, panel);
		sl_gestionnairePannel.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, gestionnairePannel);
		sl_gestionnairePannel.putConstraint(SpringLayout.SOUTH, panel_1, -10, SpringLayout.SOUTH, gestionnairePannel);
		sl_gestionnairePannel.putConstraint(SpringLayout.EAST, panel_1, -673, SpringLayout.EAST, gestionnairePannel);
		panel_1.setBackground(Color.BLACK);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel = new JLabel("Information :");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 100, SpringLayout.WEST, panel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom :");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 21, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, panel);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tel :");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 11, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel_1);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email :");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -10, SpringLayout.SOUTH, panel);
		panel.add(lblNewLabel_3);
		
		lblNon = new JLabel("ADMIN");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNon, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblNon, 25, SpringLayout.EAST, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.EAST, lblNon, -71, SpringLayout.EAST, lblNewLabel);
		lblNon.setForeground(new Color(255, 255, 255));
		panel.add(lblNon);
		
		JLabel lblNewLabel_5 = new JLabel("034 47 411 33");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 11, SpringLayout.SOUTH, lblNon);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_5, 32, SpringLayout.EAST, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_5, 123, SpringLayout.EAST, lblNewLabel_2);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("OurBankmada@gmail-mg.com");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_6, 22, SpringLayout.EAST, lblNewLabel_3);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_6, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_6, 135, SpringLayout.EAST, lblNewLabel_5);
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_6);
		gestionnairePannel.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lblNewLabel_7 = new JLabel("Information banque");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_7, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_7, 98, SpringLayout.WEST, panel_1);
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Total Solde Banque :");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_8, 35, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_8, 10, SpringLayout.WEST, panel_1);
		panel_1.add(lblNewLabel_8);
		
		textFieldTotalSolde = new JTextField();
		textFieldTotalSolde.setEditable(false);
		sl_panel_1.putConstraint(SpringLayout.EAST, textFieldTotalSolde, 148, SpringLayout.EAST, lblNewLabel_8);
		textFieldTotalSolde.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		textFieldTotalSolde.setForeground(Color.BLACK);
		textFieldTotalSolde.setBackground(Color.LIGHT_GRAY);
		sl_panel_1.putConstraint(SpringLayout.NORTH, textFieldTotalSolde, 5, SpringLayout.SOUTH, lblNewLabel_7);
		sl_panel_1.putConstraint(SpringLayout.WEST, textFieldTotalSolde, 12, SpringLayout.EAST, lblNewLabel_8);
		panel_1.add(textFieldTotalSolde);
		textFieldTotalSolde.setColumns(10);
		
		JLabel lblNewLabel_8_1 = new JLabel("Ar");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_8_1, 0, SpringLayout.NORTH, lblNewLabel_8);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_8_1, -10, SpringLayout.EAST, panel_1);
		lblNewLabel_8_1.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("Total Solde Banque (compte Courant)  ");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_8_2, 50, SpringLayout.WEST, panel_1);
		lblNewLabel_8_2.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_8_2);
		
		textFieldCourant = new JTextField();
		textFieldCourant.setEditable(false);
		sl_panel_1.putConstraint(SpringLayout.WEST, textFieldCourant, 61, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, textFieldCourant, -74, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_8_2, -6, SpringLayout.NORTH, textFieldCourant);
		textFieldCourant.setBackground(Color.LIGHT_GRAY);
		panel_1.add(textFieldCourant);
		textFieldCourant.setColumns(10);
		
		JLabel lblNewLabel_8_2_1 = new JLabel("Total Solde Banque (compte Epargne)  ");
		sl_panel_1.putConstraint(SpringLayout.SOUTH, textFieldCourant, -6, SpringLayout.NORTH, lblNewLabel_8_2_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_8_2_1, 0, SpringLayout.WEST, lblNewLabel_8_2);
		lblNewLabel_8_2_1.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_8_2_1);
		
		textFieldEpargne = new JTextField();
		textFieldEpargne.setEditable(false);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_8_2_1, -6, SpringLayout.NORTH, textFieldEpargne);
		sl_panel_1.putConstraint(SpringLayout.WEST, textFieldEpargne, 61, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, textFieldEpargne, -74, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, textFieldEpargne, 0, SpringLayout.SOUTH, panel_1);
		textFieldEpargne.setColumns(10);
		textFieldEpargne.setBackground(Color.LIGHT_GRAY);
		panel_1.add(textFieldEpargne);
		
		JLabel lblNewLabel_8_3 = new JLabel("Total nombre du des client  :");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_8_3, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_8_3, -6, SpringLayout.NORTH, lblNewLabel_8_2);
		lblNewLabel_8_3.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_8_3);
		
		textFieldNbClient = new JTextField();
		textFieldNbClient.setEditable(false);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, textFieldNbClient, -6, SpringLayout.NORTH, lblNewLabel_8_2);
		sl_panel_1.putConstraint(SpringLayout.EAST, textFieldNbClient, 0, SpringLayout.EAST, lblNewLabel_8_1);
		textFieldNbClient.setBackground(Color.LIGHT_GRAY);
		panel_1.add(textFieldNbClient);
		textFieldNbClient.setColumns(10);
		
		table_1 = new JTable();
		sl_gestionnairePannel.putConstraint(SpringLayout.NORTH, table_1, 10, SpringLayout.NORTH, gestionnairePannel);
		sl_gestionnairePannel.putConstraint(SpringLayout.WEST, table_1, 315, SpringLayout.WEST, gestionnairePannel);
		sl_gestionnairePannel.putConstraint(SpringLayout.SOUTH, table_1, -6, SpringLayout.NORTH, table);
		sl_gestionnairePannel.putConstraint(SpringLayout.EAST, table_1, -12, SpringLayout.EAST, gestionnairePannel);
		table_1.setFillsViewportHeight(true);
		table_1.setFont(new Font("Sitka Heading", Font.ITALIC, 11));
		table_1.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		table_1.setForeground(new Color(255, 255, 255));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"N\u00B0 comppte", "Nom", "Prenom", "C.I.N", "Adresse", "Contact"},
			},
			new String[] {
				"compte", "nom", "prenom", "cin", "adresse", "contact"
			}
		));
		table_1.setBackground(Color.BLACK);
		gestionnairePannel.add(table_1);
		
		btnSupprimer = new JButton("Supprimer");
		sl_gestionnairePannel.putConstraint(SpringLayout.NORTH, btnSupprimer, 497, SpringLayout.NORTH, gestionnairePannel);
		sl_gestionnairePannel.putConstraint(SpringLayout.EAST, btnSupprimer, -193, SpringLayout.EAST, gestionnairePannel);
		ImageIcon icone2 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\supprimer.png");
		Image imaIcc2 = icone2.getImage();
		Image imscall2 = imaIcc2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr2 = new ImageIcon(imscall2);
		btnSupprimer.setIcon(scalVr2);
		btnSupprimer.setForeground(Color.WHITE);
		btnSupprimer.setFont(new Font("Stencil", Font.BOLD, 15));
		btnSupprimer.setBackground(Color.BLACK);
		gestionnairePannel.add(btnSupprimer);
		
		JLabel lblNewLabel_4 = new JLabel("Veuillez selectionner  un des clients avant d'appuyer sur le boutton supprimer et voire photo");
		sl_gestionnairePannel.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 113, SpringLayout.SOUTH, table);
		sl_gestionnairePannel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 49, SpringLayout.EAST, panel_1);
		sl_gestionnairePannel.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -6, SpringLayout.NORTH, btnSupprimer);
		sl_gestionnairePannel.putConstraint(SpringLayout.EAST, lblNewLabel_4, -40, SpringLayout.EAST, gestionnairePannel);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		gestionnairePannel.add(lblNewLabel_4);
		
		btnPhoto = new JButton("Voir photo");
		sl_gestionnairePannel.putConstraint(SpringLayout.NORTH, btnPhoto, 495, SpringLayout.NORTH, gestionnairePannel);
		sl_gestionnairePannel.putConstraint(SpringLayout.WEST, btnPhoto, 98, SpringLayout.EAST, panel_1);
		sl_gestionnairePannel.putConstraint(SpringLayout.SOUTH, btnPhoto, -26, SpringLayout.SOUTH, gestionnairePannel);
		sl_gestionnairePannel.putConstraint(SpringLayout.EAST, btnPhoto, -387, SpringLayout.EAST, gestionnairePannel);
		sl_gestionnairePannel.putConstraint(SpringLayout.WEST, btnSupprimer, 6, SpringLayout.EAST, btnPhoto);
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\photo.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnPhoto.setIcon(scalVr);
		btnPhoto.setBackground(Color.BLACK);
		btnPhoto.setForeground(new Color(255, 255, 255));
		btnPhoto.setFont(new Font("SimSun", Font.BOLD, 15));
		gestionnairePannel.add(btnPhoto);
		
		btnRetour = new JButton("");
		ImageIcon icone23 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\revenir.png");
		Image imaIcc23 = icone23.getImage();
		Image imscall23 = imaIcc23.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr23 = new ImageIcon(imscall23);
		btnRetour.setIcon(scalVr23);
		btnRetour.setBackground(Color.BLACK);
		sl_gestionnairePannel.putConstraint(SpringLayout.NORTH, btnRetour, 0, SpringLayout.NORTH, btnSupprimer);
		sl_gestionnairePannel.putConstraint(SpringLayout.WEST, btnRetour, 6, SpringLayout.EAST, btnSupprimer);
		sl_gestionnairePannel.putConstraint(SpringLayout.SOUTH, btnRetour, 0, SpringLayout.SOUTH, btnSupprimer);
		sl_gestionnairePannel.putConstraint(SpringLayout.EAST, btnRetour, 102, SpringLayout.EAST, btnSupprimer);
		gestionnairePannel.add(btnRetour);
		this.init();
	}
	public void init() {
		GestionnaireController cont = new GestionnaireController(this);
		btnSupprimer.addActionListener(cont);
		btnPhoto.addActionListener(cont);
		btnRetour.addActionListener(cont);
		
	}
}
