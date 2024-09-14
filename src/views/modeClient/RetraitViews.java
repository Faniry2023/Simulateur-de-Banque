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

import controller.client.RetraitController;

public class RetraitViews extends JFrame{
	public JLabel lblmdpIncorrect;
	public JTextField textFieldRetrait;
	public JPasswordField passwordFieldRetrait;
	public JTextField textFieldCompte;
	public JButton btnValider;
	public JButton btnAnnuler;
	private JLabel lblNewLabel_2;
	public RetraitViews() {
		getContentPane().setBackground(Color.DARK_GRAY);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("RETRAIT");
		lblNewLabel.setFont(new Font("Sitka Text", Font.ITALIC, 14));
		lblNewLabel.setForeground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 157, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Retrait de :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel_1);
		
		textFieldRetrait = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textFieldRetrait, 130, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textFieldRetrait, -135, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textFieldRetrait, -127, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 1, SpringLayout.NORTH, textFieldRetrait);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -9, SpringLayout.WEST, textFieldRetrait);
		getContentPane().add(textFieldRetrait);
		textFieldRetrait.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mot de passe :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 13, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1, -261, SpringLayout.EAST, getContentPane());
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel_1_1);
		
		passwordFieldRetrait = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordFieldRetrait, 6, SpringLayout.SOUTH, textFieldRetrait);
		springLayout.putConstraint(SpringLayout.WEST, passwordFieldRetrait, 0, SpringLayout.WEST, textFieldRetrait);
		springLayout.putConstraint(SpringLayout.EAST, passwordFieldRetrait, 0, SpringLayout.EAST, textFieldRetrait);
		getContentPane().add(passwordFieldRetrait);
		
		textFieldCompte = new JTextField();
		textFieldCompte.setText("1434");
		springLayout.putConstraint(SpringLayout.NORTH, textFieldCompte, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, textFieldCompte, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, textFieldCompte, 6, SpringLayout.EAST, lblNewLabel);
		textFieldCompte.setBackground(Color.BLACK);
		textFieldCompte.setEditable(false);
		textFieldCompte.setForeground(Color.GREEN);
		getContentPane().add(textFieldCompte);
		textFieldCompte.setColumns(10);
		
		lblmdpIncorrect = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, lblmdpIncorrect, 79, SpringLayout.WEST, getContentPane());
		lblmdpIncorrect.setForeground(Color.RED);
		getContentPane().add(lblmdpIncorrect);
		
		lblNewLabel_2 = new JLabel("Ar");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 6, SpringLayout.EAST, textFieldRetrait);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 0, SpringLayout.SOUTH, lblNewLabel_1);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel_2);
		
		btnValider = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnValider, 128, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnValider, -26, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblmdpIncorrect, -6, SpringLayout.NORTH, btnValider);
		springLayout.putConstraint(SpringLayout.WEST, btnValider, 65, SpringLayout.WEST, getContentPane());
		btnValider.setBackground(Color.DARK_GRAY);
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\valid.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnValider.setIcon(scalVr);
		springLayout.putConstraint(SpringLayout.EAST, btnValider, 150, SpringLayout.WEST, getContentPane());
		getContentPane().add(btnValider);
		
		btnAnnuler = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnAnnuler, 6, SpringLayout.SOUTH, lblmdpIncorrect);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAnnuler, -26, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblmdpIncorrect, 0, SpringLayout.EAST, btnAnnuler);
		springLayout.putConstraint(SpringLayout.WEST, btnAnnuler, 63, SpringLayout.EAST, btnValider);
		springLayout.putConstraint(SpringLayout.EAST, btnAnnuler, -91, SpringLayout.EAST, getContentPane());
		btnAnnuler.setBackground(Color.DARK_GRAY);
		ImageIcon icone1 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\annu_clo.png");
		Image imaIcc1 = icone1.getImage();
		Image imscall1 = imaIcc1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr1 = new ImageIcon(imscall1);
		btnAnnuler.setIcon(scalVr1);
		getContentPane().add(btnAnnuler);
		
		this.init();
	}
	public void init() {
		RetraitController controlle = new RetraitController(this);
		btnValider.addActionListener(controlle);
		btnAnnuler.addActionListener(controlle);
	}
	
}
