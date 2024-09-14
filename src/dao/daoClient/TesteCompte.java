package dao.daoClient;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;

public class TesteCompte {
	public boolean compte(String compte) {
		boolean t = false;
		AccesBdd acces = new AccesBdd();
		String sql = "SELECT compte FROM client";
		acces.loadDriver();
		ArrayList<Integer> li = new ArrayList<Integer>();
		ResultSet rs = (ResultSet) acces.executeSelect(sql);
		try {
			while(rs.next()) {
				li.add(rs.getInt("compte"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acces.closeConnection();
		
		for(int i = 0; i < li.size(); i++) {
			if(li.get(i) == Integer.valueOf(compte)) {
				t = true;
				break;
			}
		}
		return t;
	}
}
