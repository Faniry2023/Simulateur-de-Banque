package dao.daoClient;

import common.AccesBdd;
import modele.modelClient.ClientModele;

public class ConfiDao {
	public boolean modConf(int num, ClientModele m) {
		boolean v = false;
		AccesBdd a = new AccesBdd();
		String sql = "UPDATE userclientlogin SET email='"+m.getE_mail()+"', mdp='"+m.getMotDePasse()+"' WHERE numCompte="+num;
		a.loadDriver();
		try {
			a.executeUpdate(sql);
			v = true;
		}catch(Exception g) {}
		a.closeConnection();
		return v;
	}
}
