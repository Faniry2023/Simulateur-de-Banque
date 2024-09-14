package dao.Gestionnaire;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;

public class TotalSolde {
	public double toutsSolde() {
		double resultat = 0, courant = 0, epargne = 0;
		
		AccesBdd acces = new AccesBdd();
		String sql = "SELECT soldeCourant,soldeEpargne FROM action";
		acces.loadDriver();
		ResultSet rs = (ResultSet) acces.executeSelect(sql);
		try {
			while(rs.next()) {
				courant += Double.valueOf(rs.getString("soldeCourant"));
				epargne += Double.valueOf(rs.getString("soldeEpargne"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acces.closeConnection();
		resultat += (courant + epargne);
		return resultat;
	}
	public double soldeCourant() {
		double resultat = 0;
		
		AccesBdd acces = new AccesBdd();
		String sql = "SELECT soldeCourant FROM action";
		acces.loadDriver();
		ResultSet rs = (ResultSet) acces.executeSelect(sql);
		try {
			while(rs.next()) {
				resultat += Double.valueOf(rs.getString("soldeCourant"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acces.closeConnection();
		return resultat;
	}
	public double soldeEpargne() {
		double resultat = 0;
		AccesBdd acces = new AccesBdd();
		String sql = "SELECT soldeEpargne FROM action";
		acces.loadDriver();
		ResultSet rs = (ResultSet) acces.executeSelect(sql);
		try {
			while(rs.next()) {
				resultat += Double.valueOf(rs.getString("soldeEpargne"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acces.closeConnection();
		return resultat;
	}
	public int nbClient() {
		int resultat = 0;
		AccesBdd acces = new AccesBdd();
		String sql = "SELECT nom FROM client";
		acces.loadDriver();
		List<String> nb = new ArrayList<String>();
		ResultSet rs = (ResultSet) acces.executeSelect(sql);
		try {
			while(rs.next()) {
				nb.add(rs.getString("nom"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acces.closeConnection();
		resultat = nb.size();
		return resultat;
	}
	public String nom() {
		String fin = "";
		AccesBdd a = new AccesBdd();
		String sql = "SELECT nom FROM gestionnaire";
		a.loadDriver();
		ResultSet rs = (ResultSet) a.executeSelect(sql);
		try {
			while(rs.next()) {
				fin += rs.getString("nom");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fin;
	}
}
