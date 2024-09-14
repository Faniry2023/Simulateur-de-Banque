package dao.daoClient;

import java.awt.Image;
import java.sql.SQLException;

import javax.swing.ImageIcon;

import com.mysql.jdbc.ResultSet;

import common.AccesBdd;
import pointEntrer.FenetreViews;

public class Affichage {
	public void afficher(int num) throws SQLException {
		FenetreViews fenetre = new FenetreViews();
		int numCompte = 0; String nom = "", prenom = "", date = "", lieu = "", cin = "", adresse = "",sexe = "",tele = "",hisCour = "",hisEpar = "",hisCour2="",hisEpa=""; 
		ImageIcon image = null;
		//Affichage de client
		AccesBdd ac1 = new AccesBdd();
		String sql1 = "SELECT * FROM client WHERE compte="+num;
		ac1.loadDriver();
		ResultSet rs1 = (ResultSet) ac1.executeSelect(sql1);
		while(rs1.next()) {
			numCompte = rs1.getInt("compte");
			nom = rs1.getString("nom");
			prenom = rs1.getString("prenom");
			date = rs1.getString("date");
			lieu  = rs1.getString("lieu");
			cin = rs1.getString("cin");
			adresse = rs1.getString("adresse");
			sexe = rs1.getString("sex");
			tele = rs1.getString("tel");
			ImageIcon icone = new ImageIcon(rs1.getString("image"));
			Image im = icone.getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH);
			image = new ImageIcon(im);
			
		}
		ac1.closeConnection();
		//Affichage des action
		AccesBdd ac2 = new AccesBdd();
		String sql2 = "SELECT hisCou,hisEp,hisCou2,hisEp2 FROM action WHERE compte="+num;
		ac2.loadDriver();
		ResultSet rs2 = (ResultSet) ac2.executeSelect(sql2);
		while(rs2.next()) {
			hisCour = rs2.getString("hisCou");
			hisEpar = rs2.getString("hisEp");
			hisCour2 = rs2.getString("hisCou2");
			hisEpa = rs2.getString("hisEp2");
		}
		ac2.closeConnection();
		fenetre.client(image, numCompte, nom, prenom, date, lieu, cin, adresse, sexe, tele, hisCour, hisCour2, hisEpar, hisEpa);
	}
}
