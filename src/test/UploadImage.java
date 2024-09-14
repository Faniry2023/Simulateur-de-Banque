package test;

import java.io.File;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import com.mysql.jdbc.ResultSet;

public class UploadImage extends JFrame{
	public JButton btnBrowser;
	public JButton btnSearch;
	public JButton btnSave;
	public JLabel lblImage;
	public JComboBox comboBoxId;
	public JTextField textFieldImagePath;
	public File f = null;
	public String path = null;
	public ImageIcon format = null;
	public String fName = null;
	public int s = 0;
	public byte[] pimage = null;
	public JLabel lblDisplayImage;
	
	public UploadImage() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		lblImage = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblImage, 39, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblImage, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblImage, 242, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblImage, 329, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblImage);
		
		textFieldImagePath = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textFieldImagePath, 0, SpringLayout.WEST, lblImage);
		springLayout.putConstraint(SpringLayout.SOUTH, textFieldImagePath, -9, SpringLayout.NORTH, lblImage);
		springLayout.putConstraint(SpringLayout.EAST, textFieldImagePath, 0, SpringLayout.EAST, lblImage);
		getContentPane().add(textFieldImagePath);
		textFieldImagePath.setColumns(10);
		
		btnBrowser = new JButton("Browser Image");
		springLayout.putConstraint(SpringLayout.NORTH, btnBrowser, 6, SpringLayout.SOUTH, lblImage);
		springLayout.putConstraint(SpringLayout.WEST, btnBrowser, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(btnBrowser);
		
		btnSave = new JButton("Save");
		springLayout.putConstraint(SpringLayout.NORTH, btnSave, 6, SpringLayout.SOUTH, lblImage);
		springLayout.putConstraint(SpringLayout.WEST, btnSave, 98, SpringLayout.EAST, btnBrowser);
		getContentPane().add(btnSave);
		
		comboBoxId = new JComboBox();
		AccesBdd acces = new AccesBdd();
		String sql = "SELECT imgid FROM image_tbl";
		acces.loadDriver();
		ResultSet res = (ResultSet) acces.executeSelect(sql);
		try {
			while(res.next()) {
				comboBoxId.addItem(res.getInt("imgid"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acces.closeConnection();
		springLayout.putConstraint(SpringLayout.NORTH, comboBoxId, 6, SpringLayout.SOUTH, btnBrowser);
		springLayout.putConstraint(SpringLayout.WEST, comboBoxId, 0, SpringLayout.WEST, lblImage);
		getContentPane().add(comboBoxId);
		
		btnSearch = new JButton("Chercher");
		springLayout.putConstraint(SpringLayout.SOUTH, btnSearch, 0, SpringLayout.SOUTH, comboBoxId);
		springLayout.putConstraint(SpringLayout.EAST, btnSearch, 0, SpringLayout.EAST, btnSave);
		getContentPane().add(btnSearch);
		
		lblDisplayImage = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblDisplayImage, 6, SpringLayout.SOUTH, comboBoxId);
		springLayout.putConstraint(SpringLayout.WEST, lblDisplayImage, 0, SpringLayout.WEST, lblImage);
		springLayout.putConstraint(SpringLayout.SOUTH, lblDisplayImage, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblDisplayImage, 0, SpringLayout.EAST, btnSave);
		getContentPane().add(lblDisplayImage);
		this.setVisible(true);
		
		this.redir();
	}
	
	public void redir() {
		Controller cont = new Controller(this);
		btnBrowser.addActionListener(cont);
		btnSave.addActionListener(cont);
	}
}
