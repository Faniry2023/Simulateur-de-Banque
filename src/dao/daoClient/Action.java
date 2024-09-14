package dao.daoClient;

import common.AccesBdd;
import modele.modelClient.ClientModele;

public class Action {
	public boolean actionCompte(ClientModele m) {
		boolean v = false;
		AccesBdd ac = new AccesBdd();
		String sql = "INSERT INTO action(compte,soldeCourant,soldeEpargne,hisCou,hisEp,hisCou2,hisEp2) VALUES("+m.getNumeroCompte()+",'"+m.getSoldeCourant()+"','"+m.getSoldeEpargne()+"','"+m.getHisorique()+"','"+m.getHistoireEpargne()+"','"+m.getHisorique2()+"','"+m.getHistoireEpargne2()+"')";
		ac.loadDriver();
		try {
			ac.executeUpdate(sql);
			v = true;
		}catch(Exception f) {
			System.out.print(f.getMessage());
		}
		ac.closeConnection();
		return v;
	}
}
