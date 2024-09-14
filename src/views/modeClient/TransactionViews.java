package views.modeClient;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import controller.client.TransfertController;

public class TransactionViews extends JFrame{
	public JTextField textFieldTransfert;
	public JTextField textFieldTransCompte;
	public JTextField textFieldCompte;
	public JButton btnValider;
	public JButton btnAnnuler;
	public TransactionViews() {
		getContentPane().setBackground(Color.DARK_GRAY);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Transfert d'argent");
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -125, SpringLayout.EAST, getContentPane());
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		getContentPane().add(lblNewLabel);
		
		textFieldCompte = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldCompte, 35, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textFieldCompte, -140, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, textFieldCompte);
		textFieldCompte.setEditable(false);
		textFieldCompte.setForeground(Color.GREEN);
		textFieldCompte.setBackground(Color.BLACK);
		getContentPane().add(textFieldCompte);
		textFieldCompte.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("montant du transfert :");
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		getContentPane().add(lblNewLabel_1);
		
		textFieldTransfert = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textFieldTransfert, 127, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textFieldTransfert, -113, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -6, SpringLayout.NORTH, textFieldTransfert);
		getContentPane().add(textFieldTransfert);
		textFieldTransfert.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ar");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 1, SpringLayout.NORTH, textFieldTransfert);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1_1, 6, SpringLayout.EAST, textFieldTransfert);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("transfert vers le numero de compte :");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1_2, 82, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textFieldTransfert, -6, SpringLayout.NORTH, lblNewLabel_1_2);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel_1_2);
		
		textFieldTransCompte = new JTextField();
		textFieldTransCompte.setForeground(Color.GREEN);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1_2, -6, SpringLayout.NORTH, textFieldTransCompte);
		springLayout.putConstraint(SpringLayout.SOUTH, textFieldTransCompte, -55, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textFieldTransCompte, 168, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textFieldTransCompte, -154, SpringLayout.EAST, getContentPane());
		textFieldTransCompte.setColumns(10);
		getContentPane().add(textFieldTransCompte);
		
		btnValider = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnValider, 6, SpringLayout.SOUTH, textFieldTransCompte);
		springLayout.putConstraint(SpringLayout.WEST, btnValider, 127, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnValider, -10, SpringLayout.SOUTH, getContentPane());
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\valid.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnValider.setIcon(scalVr);
		btnValider.setBackground(Color.DARK_GRAY);
		getContentPane().add(btnValider);
		
		btnAnnuler = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnAnnuler, 6, SpringLayout.SOUTH, textFieldTransCompte);
		springLayout.putConstraint(SpringLayout.WEST, btnAnnuler, 217, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnAnnuler, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnAnnuler, -111, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnValider, -34, SpringLayout.WEST, btnAnnuler);
		ImageIcon icone1 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\annu_clo.png");
		Image imaIcc1 = icone1.getImage();
		Image imscall1 = imaIcc1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr1 = new ImageIcon(imscall1);
		btnAnnuler.setIcon(scalVr1);
		btnAnnuler.setBackground(Color.DARK_GRAY);
		getContentPane().add(btnAnnuler);
		this.init();
	}
	public void init() {
		TransfertController con = new TransfertController(this);
		btnValider.addActionListener(con);
		btnAnnuler.addActionListener(con);
	}

}
