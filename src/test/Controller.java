package test;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.mysql.jdbc.ResultSet;

public class Controller implements ActionListener{
	UploadImage uploadImage;
	public Controller(UploadImage uploadImage) {
		this.uploadImage = uploadImage;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object  source = e.getSource();
		Dao dao = new Dao();
		if(source == uploadImage.btnBrowser) {
			JFileChooser fileChooser = new JFileChooser();
			FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
			fileChooser.addChoosableFileFilter(fnwf);
			int load = fileChooser.showOpenDialog(null);
			if(load == fileChooser.APPROVE_OPTION) {
				uploadImage.f = fileChooser.getSelectedFile();
				uploadImage.path = uploadImage.f.getAbsolutePath();
				uploadImage.textFieldImagePath.setText(uploadImage.path);
				ImageIcon ii = new ImageIcon(uploadImage.path);
				Image img = ii.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
				uploadImage.lblImage.setIcon(new ImageIcon(img));
				
			}
		}
		if(source == uploadImage.btnSave) {
			System.out.println("Image Path - "+uploadImage.path);
			System.out.println("Image Name - "+uploadImage.f.getName());
			File f = new File(uploadImage.path);
			AccesBdd acces = new AccesBdd();
			boolean vali = false;
			try {
				InputStream is = new FileInputStream(f);
				String sql = "INSERT INTO image_tbl(imageName,imagePath,imageFile) VALUES('"+uploadImage.f.getName()+"','"+uploadImage.path+"','"+is+"')";
				acces.loadDriver();
				acces.executeUpdate(sql);
				vali = true;
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(vali == true) {
				JOptionPane.showConfirmDialog(null, "Sauvegarde effectuer");
				dao.affich();
			}
			acces.closeConnection();
		}
		if(source == uploadImage.btnSearch) {
			DaoLoadImage l = new DaoLoadImage();
			String imgId = uploadImage.comboBoxId.getSelectedItem().toString();
			AccesBdd ac = new AccesBdd();
			String sql = "SELECT * FROM image_tbl WHERE imgid='"+imgId+"'";
			ac.loadDriver();
			ResultSet res = (ResultSet) ac.executeSelect(sql);
			try {
				if(res.next()) {
					l.loadImage();
				}else {
					JOptionPane.showMessageDialog(null, "Erreur");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
