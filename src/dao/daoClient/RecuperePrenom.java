package dao.daoClient;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;

public class RecuperePrenom {
	public String prenom(int num) {
		String v = "";
		AccesBdd ac = new AccesBdd();
		String sql = "SELECT prenom FROM client WHERE compte="+num;
		ac.loadDriver();
		ResultSet rs = (ResultSet) ac.executeSelect(sql);
		try {
			while(rs.next()) {
				v = rs.getString("prenom");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.closeConnection();
		return v;
	}
}
