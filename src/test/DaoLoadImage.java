package test;

import java.awt.Image;
import java.sql.SQLException;

import javax.swing.ImageIcon;

import com.mysql.jdbc.ResultSet;

public class DaoLoadImage {
	public void loadImage() {
		AccesBdd acces = new AccesBdd();
		UploadImage up = new UploadImage();
		String sql = "SELECT imageFile FROM image_tbl";
		acces.loadDriver();
		ResultSet res = (ResultSet) acces.executeSelect(sql);
		try {
			byte[] imagedata = res.getBytes("imageFile");
			up.format = new ImageIcon(imagedata);
			Image mm = up.format.getImage();
			Image img2 = mm.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			ImageIcon image = new ImageIcon(img2);
			up.lblDisplayImage.setIcon(image);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
