package dao.Gestionnaire;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;
import modele.Gestionnaire.UserModele;

public class AuthentificationDao {
	public boolean verifUser(UserModele mo) throws SQLException {
			boolean validation = false;
			AccesBdd acces = new AccesBdd();
			String sql = "SELECT email,mdp FROM gestionnaire WHERE email='"+mo.getEmail()+"' AND mdp='"+mo.getMdp()+"' LIMIT 1";
			acces.loadDriver();
			ResultSet res = (ResultSet) acces.executeSelect(sql);
			while(res.next()) {
				validation = true;
			}
			acces.closeConnection();
			return validation;
	}
}
