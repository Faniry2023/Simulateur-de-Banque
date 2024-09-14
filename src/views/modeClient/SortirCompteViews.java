package views.modeClient;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class SortirCompteViews extends JFrame{
	public JButton btnNon;
	public JButton btnOui;
	public SortirCompteViews() {
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Voulez vous quitter votre compte ?");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 22, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 35, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 46, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -29, SpringLayout.EAST, getContentPane());
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel);
		
		btnOui = new JButton("OUI");
		springLayout.putConstraint(SpringLayout.NORTH, btnOui, 23, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnOui, 77, SpringLayout.WEST, getContentPane());
		getContentPane().add(btnOui);
		
		btnNon = new JButton("NON");
		springLayout.putConstraint(SpringLayout.WEST, btnNon, 5, SpringLayout.EAST, btnOui);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNon, 0, SpringLayout.SOUTH, btnOui);
		getContentPane().add(btnNon);
	}
}
