package dao.daoClient;

import common.AccesBdd;
import modele.modelClient.ClientModele;

public class InscriptionDao {
	
	public boolean ajoutLoginClient(ClientModele mod) {
		boolean validation = false;
		AccesBdd acces = new AccesBdd();
		String sql = "INSERT INTO userclientlogin(numCompte,email,mdp) VALUES('"+mod.getNumeroCompte()+"','"+mod.getE_mail()+"','"+mod.getMotDePasse()+"')";
		acces.loadDriver();
		try {
			acces.executeUpdate(sql);
			validation = true;
		}catch(Exception t) {
			
		}
		acces.closeConnection();
		
		return validation;
	}
}
