package views.modeClient;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpringLayout;

import controller.client.DepotController;


public class DepotViews extends JFrame{
	public JTextField txtDepot;
	public JPasswordField passwordFieldDepot;
	public JTextField textFieldNumCompte;
	public JButton btnValider;
	public JButton btnQuitter;
	public JTextField spinnerSoldeDepot;
	public JLabel lblMdpIncorrect;
	public DepotViews() {
		getContentPane().setBackground(Color.DARK_GRAY);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		txtDepot = new JTextField();
		txtDepot.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, txtDepot, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtDepot, -125, SpringLayout.EAST, getContentPane());
		txtDepot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDepot.setForeground(Color.BLACK);
		txtDepot.setText("        DEPOT");
		getContentPane().add(txtDepot);
		txtDepot.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Depot de :");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 73, SpringLayout.WEST, getContentPane());
		lblNewLabel.setForeground(Color.WHITE);
		getContentPane().add(lblNewLabel);
		
		JLabel lblAr = new JLabel("Ar");
		springLayout.putConstraint(SpringLayout.NORTH, lblAr, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblAr, 141, SpringLayout.EAST, lblNewLabel);
		lblAr.setForeground(Color.WHITE);
		getContentPane().add(lblAr);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		springLayout.putConstraint(SpringLayout.NORTH, lblMotDePasse, 107, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, lblMotDePasse);
		lblMotDePasse.setForeground(Color.WHITE);
		getContentPane().add(lblMotDePasse);
		
		passwordFieldDepot = new JPasswordField();
		springLayout.putConstraint(SpringLayout.WEST, passwordFieldDepot, 143, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, passwordFieldDepot, -125, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblMotDePasse, -11, SpringLayout.WEST, passwordFieldDepot);
		springLayout.putConstraint(SpringLayout.NORTH, passwordFieldDepot, -3, SpringLayout.NORTH, lblMotDePasse);
		getContentPane().add(passwordFieldDepot);
		
		textFieldNumCompte = new JTextField();
		textFieldNumCompte.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldNumCompte, 6, SpringLayout.SOUTH, txtDepot);
		springLayout.putConstraint(SpringLayout.WEST, textFieldNumCompte, 167, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textFieldNumCompte, -157, SpringLayout.EAST, getContentPane());
		textFieldNumCompte.setForeground(Color.GREEN);
		textFieldNumCompte.setBackground(Color.BLACK);
		getContentPane().add(textFieldNumCompte);
		textFieldNumCompte.setColumns(10);
		
		btnValider = new JButton("");
		springLayout.putConstraint(SpringLayout.WEST, btnValider, 0, SpringLayout.WEST, lblMotDePasse);
		springLayout.putConstraint(SpringLayout.SOUTH, btnValider, -23, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnValider, 84, SpringLayout.WEST, lblMotDePasse);
		btnValider.setBackground(Color.DARK_GRAY);
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\valid.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnValider.setIcon(scalVr);
		getContentPane().add(btnValider);
		ImageIcon icone2 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\precedent.png");
		Image imaIcc2 = icone2.getImage();
		Image imscall2 = imaIcc2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr2 = new ImageIcon(imscall2);
		
		btnQuitter = new JButton("");
		springLayout.putConstraint(SpringLayout.SOUTH, btnQuitter, -23, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnValider, 0, SpringLayout.NORTH, btnQuitter);
		springLayout.putConstraint(SpringLayout.WEST, btnQuitter, -140, SpringLayout.EAST, getContentPane());
		btnQuitter.setBackground(Color.DARK_GRAY);
		ImageIcon icone1 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\annu_clo.png");
		Image imaIcc1 = icone1.getImage();
		Image imscall1 = imaIcc1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr1 = new ImageIcon(imscall1);
		btnQuitter.setIcon(scalVr1);
		getContentPane().add(btnQuitter);
		
		spinnerSoldeDepot = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, spinnerSoldeDepot, -116, SpringLayout.EAST, txtDepot);
		springLayout.putConstraint(SpringLayout.SOUTH, spinnerSoldeDepot, -3, SpringLayout.NORTH, passwordFieldDepot);
		springLayout.putConstraint(SpringLayout.EAST, spinnerSoldeDepot, -6, SpringLayout.WEST, lblAr);
		getContentPane().add(spinnerSoldeDepot);
		spinnerSoldeDepot.setColumns(10);
		
		lblMdpIncorrect = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, btnQuitter, 14, SpringLayout.SOUTH, lblMdpIncorrect);
		springLayout.putConstraint(SpringLayout.EAST, btnQuitter, 0, SpringLayout.EAST, lblMdpIncorrect);
		springLayout.putConstraint(SpringLayout.WEST, lblMdpIncorrect, 102, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblMdpIncorrect, -56, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblMdpIncorrect, 6, SpringLayout.SOUTH, lblMotDePasse);
		lblMdpIncorrect.setForeground(Color.RED);
		getContentPane().add(lblMdpIncorrect);
		
		this.init();
	}
	
	public void init() {
		DepotController controlle = new DepotController(this);
		btnValider.addActionListener(controlle);
		btnQuitter.addActionListener(controlle);
	}
}
