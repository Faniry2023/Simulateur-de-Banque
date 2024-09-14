package dao.daoClient;

import common.AccesBdd;

public class DepotEpargneDao {
	public boolean modifSoldeCurant(int num,double nvSolde) {
		boolean v = false;
		RecuperePrenom prenom = new RecuperePrenom();
		ResteSoldeDao solde = new ResteSoldeDao();
		RecDate date = new RecDate();
		double bonnus = ((nvSolde * 5) / 100);
		double nvS = Double.valueOf(solde.soldeEpargne(num)) + nvSolde + bonnus;
		AccesBdd ac = new AccesBdd();
		String sql = "UPDATE action SET soldeEpargne='"+nvS+"', dateTime= CURRENT_TIMESTAMP WHERE compte="+num;
		ac.loadDriver();
		ac.executeUpdate(sql);
		ac.closeConnection();
		
		
		AccesBdd ac1 = new AccesBdd();
		String hist1 = "Bonjour " +prenom.prenom(num)+" Vous avez fait un depot de "+nvSolde+" plus le bonus d Epargne";
		String hist2 = "le "+date.date(num)+".Votre solde est de " + nvS + " Ar";
		String sql2 = "UPDATE action SET hisEp='"+hist1+"', hisEp2='"+hist2+"' WHERE compte="+num;
		ac1.loadDriver();
		ac1.executeUpdate(sql2);
		ac1.closeConnection();
		return v;
	}
}
