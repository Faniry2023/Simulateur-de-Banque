package dao.daoClient;

import common.AccesBdd;
import modele.modelClient.ClientModele;

public class AjoutCli {
	public boolean add(ClientModele m) {
		boolean v = false;
		AccesBdd a = new AccesBdd();
		String sql ="INSERT INTO client(compte,nom,prenom,date,lieu,cin,adresse,sex,tel,image) VALUES("+m.getNumeroCompte()+",'"+m.getNom()+"','"+m.getPrenom()+"','"+m.getDateNaissance()+"','"+m.getLieuNaissance()+"','"+m.getCin()+"','"+m.getAdresse()+"','"+m.getSexe()+"','"+m.getContact()+"','"+m.getLienImage()+"')";
		a.loadDriver();
		try {
			a.executeUpdate(sql);
			v= true;
		}catch(Exception d) {
			System.out.println(d.getMessage());
		}
		a.closeConnection();
		return v;
	}
	
	public boolean modCli(ClientModele m) {
		boolean v = false;
		AccesBdd a = new AccesBdd();
		String sql ="UPDATE client SET nom='"+m.getNom()+"',prenom='"+m.getPrenom()+"',date='"+m.getDateNaissance()+"',lieu='"+m.getLieuNaissance()+"',cin='"+m.getCin()+"',adresse='"+m.getAdresse()+"',sex='"+m.getSexe()+"',tel='"+m.getContact()+"',image='"+m.getLienImage()+"' WHERE compte="+m.getNumeroCompte();
		a.loadDriver();
		try {
			a.executeUpdate(sql);
			v= true;
		}catch(Exception d) {
			System.out.println(d.getMessage());
		}
		a.closeConnection();
		return v;
	}
	public boolean modCliSansIm(ClientModele m) {
		boolean v = false;
		AccesBdd a = new AccesBdd();
		String sql ="UPDATE client SET comptenom='"+m.getNom()+"',prenom='"+m.getPrenom()+"',date='"+m.getDateNaissance()+"',lieu='"+m.getLieuNaissance()+"',cin='"+m.getCin()+"',adresse='"+m.getAdresse()+"',sex='"+m.getSexe()+"',tel='"+m.getContact()+"' WHERE compte="+m.getNumeroCompte();
		a.loadDriver();
		try {
			a.executeUpdate(sql);
			v= true;
		}catch(Exception d) {
			System.out.println(d.getMessage());
		}
		a.closeConnection();
		return v;
	}
}
