package dao.Gestionnaire;

import java.awt.Image;
import java.sql.SQLException;

import javax.swing.ImageIcon;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;

public class ImageDao {
	public String image(int id) throws SQLException {
		String image = "";
		AccesBdd a = new AccesBdd();
		String sql = "SELECT image FROM client WHERE compte="+id;
		a.loadDriver();
		ResultSet rs = (ResultSet) a.executeSelect(sql);
		while(rs.next()) {
			image = rs.getString("image");
		}
		a.closeConnection();
		
		return image;
	}
}
