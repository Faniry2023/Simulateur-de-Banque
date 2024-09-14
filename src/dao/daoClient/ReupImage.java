package dao.daoClient;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;

public class ReupImage {
	public String recupererImage(int num) {
		String v = "";
		AccesBdd ac = new AccesBdd();
		String sql = "SELECT image FROM client WHERE compte="+num;
		ac.loadDriver();
		ResultSet rs = (ResultSet) ac.executeSelect(sql);
		try {
			while(rs.next()) {
				v = rs.getString("image");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.closeConnection();
		return v;
	}
}
