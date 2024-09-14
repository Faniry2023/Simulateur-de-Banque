package dao.daoClient;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;
import modele.modelClient.ClientModele;

public class AuthentificationDao {
	public boolean verifUser (ClientModele mo) throws SQLException {
		boolean validation = false;
		AccesBdd acces = new AccesBdd();
		String sql = "SELECT numCompte,email,mdp FROM userclientlogin WHERE numCompte="+mo.getNumeroCompte()+" AND email='"+mo.getE_mail()+"' AND mdp='"+mo.getMotDePasse()+"' LIMIT 1";
		acces.loadDriver();
		ResultSet res = (ResultSet) acces.executeSelect(sql);
		while(res.next()) {
			validation = true;
		}
		acces.closeConnection();
		return validation;
	}
	public boolean verifCompte(ClientModele m) throws SQLException {
		boolean validation = false;
		AccesBdd acces = new AccesBdd();
		String query = "SELECT numCompte FROM userclientlogin WHERE numCompte="+m.getNumeroCompte()+" LIMIT 1";
		acces.loadDriver();
		ResultSet res = (ResultSet) acces.executeSelect(query);
		while(res.next()) {
			validation = true;
		}
		acces.closeConnection();
		return validation;
	}
}
