package algoUtil;

import dao.daoClient.TesteCompte;

public class NumeroCompte {
	public String compte() {
		boolean tes = false;
		String numCompte = "";
		TesteCompte tesCom = new TesteCompte();
		do {
			for(int i = 1; i < 5; i++) {
				int aleatoire = (int) (Math.random()*9);
				numCompte += aleatoire;
			}
			tes = tesCom.compte(numCompte);
		}while(tes);
		return numCompte;
	}
}
