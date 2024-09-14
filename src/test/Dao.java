package test;

import java.awt.Image;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.mysql.jdbc.ResultSet;

public class Dao {
	public void affich() {
		UploadImage uploadImage = new UploadImage();
		AccesBdd acces = new AccesBdd();
		String sql = "SELECT imageFile,imgid FROM image_tbl";
		acces.loadDriver();
		ResultSet res = (ResultSet) acces.executeSelect(sql);
		uploadImage.comboBoxId.removeAllItems();  
		//boolean va= false;
		try {
			while(res.next()) {
				uploadImage.comboBoxId.addItem(res.getInt("imgid"));
				//va= true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acces.closeConnection();
		//return va;
	}
}
