package dao.Gestionnaire;

import common.AccesBdd;

public class SupprimerDao {
	public boolean supprimerAction(int num) {
		boolean v = false;
		AccesBdd a = new AccesBdd();
		String sql = "DELETE FROM action WHERE compte="+num;
		a.loadDriver();
		try {
			a.executeUpdate(sql);
			v = true;
		}catch(Exception h) {}
		a.closeConnection();
		return v;
	}
	public boolean supprimerClient(int num) {
		boolean v = false;
		AccesBdd a = new AccesBdd();
		String sql = "DELETE FROM client WHERE compte="+num;
		a.loadDriver();
		try {
			a.executeUpdate(sql);
			v = true;
		}catch(Exception h) {}
		a.closeConnection();
		return v;
	}
	public boolean supprimerLogin(int num) {
		boolean v = false;
		AccesBdd a = new AccesBdd();
		String sql = "DELETE FROM userclientlogin WHERE numCompte="+num;
		a.loadDriver();
		try {
			a.executeUpdate(sql);
			v = true;
		}catch(Exception h) {}
		a.closeConnection();
		return v;
	}
}
