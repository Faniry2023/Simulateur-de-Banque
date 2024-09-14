package dao.daoClient;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;

public class AuthenAction {
	public boolean auth(String pass,int num) throws SQLException {
		boolean v= false;
		AccesBdd a = new AccesBdd();
		String sql = "SELECT mdp,numCompte  FROM userclientlogin WHERE mdp='"+pass+"' AND numCompte='"+num+"' LIMIT 1";
		a.loadDriver();
		ResultSet rs = (ResultSet) a.executeSelect(sql);
		while(rs.next()) {
			v = true;
		}
		a.closeConnection();
		return v;
	}
}
