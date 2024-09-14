package dao.daoClient;

import common.AccesBdd;

public class RetraitDao {
	public boolean modifSoldeCurant(int num,double nvSolde) {
		boolean v = false;
		RecuperePrenom prenom = new RecuperePrenom();
		ResteSoldeDao solde = new ResteSoldeDao();
		RecDate date = new RecDate();
		double nvS = Double.valueOf(solde.soldeCourant(num)) - nvSolde;
		
		if(nvS >= 0) {
			AccesBdd ac = new AccesBdd();
			String sql = "UPDATE action SET soldeCourant='"+nvS+"', dateTime= CURRENT_TIMESTAMP WHERE compte="+num;
			ac.loadDriver();
			ac.executeUpdate(sql);
			ac.closeConnection();
			
			
			AccesBdd ac1 = new AccesBdd();
			String hist1 = "Bonjour " +prenom.prenom(num)+" Vous avez fait un retrait de "+nvSolde;
			String hist2 = "le "+date.date(num)+".Votre solde est de " + nvS + " Ar";
			String sql2 = "UPDATE action SET hisCou='"+hist1+"', hisCou2='"+hist2+"' WHERE compte="+num;
			ac1.loadDriver();
			ac1.executeUpdate(sql2);
			ac1.closeConnection();
			v = true;
		}else {
			v = false;
		}
		
		return v;
	}
	public boolean retraitEpargne(int num, double solde) {
		boolean va = false;
		RecuperePrenom prenom = new RecuperePrenom();
		ResteSoldeDao resSolde = new ResteSoldeDao();
		RecDate date = new RecDate();
		double nvS = Double.valueOf(resSolde.soldeEpargne(num)) - solde;
		
		if(nvS >= 0) {
			AccesBdd ac = new AccesBdd();
			String sql = "UPDATE action SET soldeEpargne='"+nvS+"', dateTime= CURRENT_TIMESTAMP WHERE compte="+num;
			ac.loadDriver();
			ac.executeUpdate(sql);
			ac.closeConnection();
			
			
			AccesBdd ac1 = new AccesBdd();
			String hist1 = "Bonjour " +prenom.prenom(num)+" Vous avez fait un retrait de "+solde+" dans votre compte Epargne";
			String hist2 = "le "+date.date(num)+".Votre solde est de " + nvS + " Ar";
			String sql2 = "UPDATE action SET hisEp='"+hist1+"', hisEp2='"+hist2+"' WHERE compte="+num;
			ac1.loadDriver();
			ac1.executeUpdate(sql2);
			ac1.closeConnection();
			va = true;
		}else {
			va = false;
		}
		
		return va;
	}
}
