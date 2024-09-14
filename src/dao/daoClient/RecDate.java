package dao.daoClient;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;

public class RecDate {
	public String date(int num) {
		String v = "";
		AccesBdd ac = new AccesBdd();
		String sql = "SELECT dateTime FROM action WHERE compte="+num;
		ac.loadDriver();
		ResultSet rs = (ResultSet) ac.executeSelect(sql);
		try {
			while(rs.next()) {
				v = rs.getString("dateTime");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.closeConnection();
		return v;
	}
}
