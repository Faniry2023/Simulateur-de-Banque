package dao.daoClient;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;

public class RecCompte {
	public boolean compte(int num) throws SQLException {
		boolean v = false;
		AccesBdd ac = new AccesBdd();
		String sql = "SELECT numCompte FROM userclientlogin WHERE numCompte="+num;
		ac.loadDriver();
		ResultSet rs = (ResultSet) ac.executeSelect(sql);
		while(rs.next()) {
			v = true;
		}
		ac.closeConnection();
		return v;
	}
}
