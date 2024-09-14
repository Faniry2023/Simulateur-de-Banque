package dao.daoClient;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;

public class RecMdp {
	public boolean recupererMdp(String mdp) throws SQLException {
		boolean v = false;
		AccesBdd a = new AccesBdd();
		String sql = "SELECT mdp FROM userclientlogin WHERE mdp='"+mdp+"'";
		a.loadDriver();
		ResultSet r = (ResultSet) a.executeSelect(sql);
		while(r.next()) {
			v = true;
		}
		a.closeConnection();
		return v;
	}
}
