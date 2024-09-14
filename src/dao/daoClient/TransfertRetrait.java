package dao.daoClient;

import common.AccesBdd;

public class TransfertRetrait {
	public boolean modifSoldeCurant(int num,double nvSolde,int numRece) {
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
			String hist1 = "Bonjour " +prenom.prenom(num)+" Vous avez envoyer "+nvSolde+" a "+prenom.prenom(numRece);
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
}
