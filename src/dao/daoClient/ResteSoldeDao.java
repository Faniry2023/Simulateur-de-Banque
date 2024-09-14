package dao.daoClient;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;

public class ResteSoldeDao {
	public String soldeCourant(int num) {
		String v = "";
		AccesBdd ac1 = new AccesBdd();
		String sql1 = "SELECT soldeCourant FROM action WHERE compte="+num;
		ac1.loadDriver();
		ResultSet rs1 = (ResultSet) ac1.executeSelect(sql1);
		try {
			while(rs1.next()) {
				v = rs1.getString("soldeCourant");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac1.closeConnection();
		return v;
	}
	public String soldeEpargne(int num) {
		String v = "";
		AccesBdd ac1 = new AccesBdd();
		String sql1 = "SELECT soldeEpargne FROM action WHERE compte="+num;
		ac1.loadDriver();
		ResultSet rs1 = (ResultSet) ac1.executeSelect(sql1);
		try {
			while(rs1.next()) {
				v = rs1.getString("soldeEpargne");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac1.closeConnection();
		return v;
	}
}
