package views.modeClient;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;

import controller.client.ValidaController;

public class ValidationTransfertViews extends JFrame{
	public JLabel lblmessage;
	public JTextField textFieldcompteTransf;
	private JLabel lblNewLabel;
	public JPasswordField passwordFieldValTrans;
	public JButton btnValider;
	public JButton btnRetour;
	public JButton btnAnnuler;
	private JLabel lblNewLabel_1;
	public JLabel lblImage;
	private JLabel lblVoulezVousTransferer;
	private JLabel lblAr;
	public JLabel lblPrenom;
	public JLabel lblCompteEnvoyeur;
	public JLabel lblmdpInco;
	public ValidationTransfertViews() {
		getContentPane().setBackground(Color.DARK_GRAY);
		setBackground(Color.DARK_GRAY);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		lblmessage = new JLabel("1200000000");
		springLayout.putConstraint(SpringLayout.NORTH, lblmessage, 67, SpringLayout.NORTH, getContentPane());
		lblmessage.setForeground(Color.WHITE);
		lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblmessage);
		
		JLabel lblVersLeCompte = new JLabel("Vers le compte : ");
		springLayout.putConstraint(SpringLayout.NORTH, lblVersLeCompte, 139, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblVersLeCompte, 10, SpringLayout.WEST, getContentPane());
		lblVersLeCompte.setForeground(Color.WHITE);
		lblVersLeCompte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblVersLeCompte);
		
		textFieldcompteTransf = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, lblmessage, -44, SpringLayout.NORTH, textFieldcompteTransf);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldcompteTransf, 136, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textFieldcompteTransf, 28, SpringLayout.EAST, lblVersLeCompte);
		springLayout.putConstraint(SpringLayout.EAST, textFieldcompteTransf, -457, SpringLayout.EAST, getContentPane());
		textFieldcompteTransf.setEditable(false);
		textFieldcompteTransf.setForeground(Color.GREEN);
		textFieldcompteTransf.setBackground(Color.BLACK);
		getContentPane().add(textFieldcompteTransf);
		textFieldcompteTransf.setColumns(10);
		
		lblNewLabel = new JLabel("Pour effectuer le transfert, veuillez saisir votre mot de passe ");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblVersLeCompte);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -111, SpringLayout.SOUTH, getContentPane());
		lblNewLabel.setForeground(Color.WHITE);
		getContentPane().add(lblNewLabel);
		
		passwordFieldValTrans = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordFieldValTrans, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, passwordFieldValTrans, -145, SpringLayout.EAST, textFieldcompteTransf);
		springLayout.putConstraint(SpringLayout.EAST, passwordFieldValTrans, 0, SpringLayout.EAST, textFieldcompteTransf);
		getContentPane().add(passwordFieldValTrans);
		
		btnValider = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnValider, 24, SpringLayout.SOUTH, passwordFieldValTrans);
		springLayout.putConstraint(SpringLayout.WEST, btnValider, 32, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnValider, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnValider, -583, SpringLayout.EAST, getContentPane());
		btnValider.setBackground(Color.DARK_GRAY);
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\valid.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnValider.setIcon(scalVr);
		getContentPane().add(btnValider);
		
		btnRetour = new JButton("");
		springLayout.putConstraint(SpringLayout.WEST, btnRetour, 141, SpringLayout.WEST, getContentPane());
		btnRetour.setBackground(Color.DARK_GRAY);
		ImageIcon icone4 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\precedent.png");
		Image i= icone4.getImage();
		Image i4 = i.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr444 = new ImageIcon(i4);
		btnRetour.setIcon(scalVr444);
		springLayout.putConstraint(SpringLayout.NORTH, btnRetour, 0, SpringLayout.NORTH, btnValider);
		springLayout.putConstraint(SpringLayout.SOUTH, btnRetour, 0, SpringLayout.SOUTH, btnValider);
		springLayout.putConstraint(SpringLayout.EAST, btnRetour, 109, SpringLayout.EAST, btnValider);
		getContentPane().add(btnRetour);
		
		btnAnnuler = new JButton("");
		btnAnnuler.setBackground(Color.DARK_GRAY);
		ImageIcon icone1 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\annu_clo.png");
		Image imaIcc1 = icone1.getImage();
		Image imscall1 = imaIcc1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scalVr1 = new ImageIcon(imscall1);
		btnAnnuler.setIcon(scalVr1);
		springLayout.putConstraint(SpringLayout.NORTH, btnAnnuler, 0, SpringLayout.NORTH, btnValider);
		springLayout.putConstraint(SpringLayout.WEST, btnAnnuler, 26, SpringLayout.EAST, btnRetour);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAnnuler, 0, SpringLayout.SOUTH, btnValider);
		springLayout.putConstraint(SpringLayout.EAST, btnAnnuler, 95, SpringLayout.EAST, btnRetour);
		getContentPane().add(btnAnnuler);
		
		lblNewLabel_1 = new JLabel("Transfert d'argent");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 272, SpringLayout.WEST, getContentPane());
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 67, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 83, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, getContentPane());
		panel.setBorder(new LineBorder(Color.WHITE));
		panel.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		lblImage = new JLabel("");
		sl_panel.putConstraint(SpringLayout.NORTH, lblImage, -223, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblImage, -275, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblImage, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblImage, -10, SpringLayout.EAST, panel);
		panel.add(lblImage);
		
		lblVoulezVousTransferer = new JLabel("Voulez vous transferer : ");
		springLayout.putConstraint(SpringLayout.WEST, lblVoulezVousTransferer, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblVoulezVousTransferer, -519, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblmessage, 4, SpringLayout.EAST, lblVoulezVousTransferer);
		springLayout.putConstraint(SpringLayout.SOUTH, lblVoulezVousTransferer, -48, SpringLayout.NORTH, textFieldcompteTransf);
		lblVoulezVousTransferer.setForeground(Color.WHITE);
		lblVoulezVousTransferer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblVoulezVousTransferer);
		
		lblAr = new JLabel("Ar");
		springLayout.putConstraint(SpringLayout.WEST, lblAr, 261, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblmessage, -6, SpringLayout.WEST, lblAr);
		springLayout.putConstraint(SpringLayout.NORTH, lblAr, 4, SpringLayout.NORTH, lblmessage);
		lblAr.setForeground(Color.WHITE);
		lblAr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblAr);
		
		lblPrenom = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblPrenom, 36, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblPrenom, -6, SpringLayout.NORTH, panel);
		lblPrenom.setForeground(Color.WHITE);
		lblPrenom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		springLayout.putConstraint(SpringLayout.WEST, lblPrenom, -196, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblPrenom, -50, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblPrenom);
		
		lblCompteEnvoyeur = new JLabel("New label");
		springLayout.putConstraint(SpringLayout.NORTH, lblCompteEnvoyeur, -5000, SpringLayout.NORTH, lblPrenom);
		springLayout.putConstraint(SpringLayout.WEST, lblCompteEnvoyeur, 87, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblCompteEnvoyeur);
		
		lblmdpInco = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblmdpInco, 6, SpringLayout.SOUTH, passwordFieldValTrans);
		springLayout.putConstraint(SpringLayout.WEST, lblmdpInco, 0, SpringLayout.WEST, passwordFieldValTrans);
		springLayout.putConstraint(SpringLayout.EAST, lblmdpInco, 20, SpringLayout.EAST, lblNewLabel);
		lblmdpInco.setForeground(new Color(255, 0, 0));
		getContentPane().add(lblmdpInco);
		this.init();
	}
	public void init() {
		ValidaController c = new ValidaController(this);
		btnValider.addActionListener(c);
		btnAnnuler.addActionListener(c);
		btnRetour.addActionListener(c);
	}
}
