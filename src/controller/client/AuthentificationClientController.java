package controller.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import algoUtil.NumeroCompte;
import dao.daoClient.Affichage;
import dao.daoClient.Affichage;
import dao.daoClient.AuthentificationDao;
import modele.modelClient.ClientModele;
import pointEntrer.FenetreViews;
import views.BienvenueViews;
import views.modeClient.AuthentificationClientViews;
import views.modeClient.NouveauCompteViews;

public class AuthentificationClientController implements ActionListener{
	AuthentificationClientViews authentificationClientViews;
	public AuthentificationClientController(AuthentificationClientViews authentificationClientViews) {
		// TODO Auto-generated constructor stub
		this.authentificationClientViews = authentificationClientViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		FenetreViews fenetre = new FenetreViews();
		BienvenueViews bien = new BienvenueViews();
		NouveauCompteViews nv = new NouveauCompteViews();
		NumeroCompte compte = new NumeroCompte();
		if(source == authentificationClientViews.btnNouveauCompte) {
			this.authentificationClientViews.setVisible(false);
			fenetre.nvcompte(compte.compte(),null,null);
		}
		if(source == authentificationClientViews.btnConnecter) {
			AuthentificationDao dao = new AuthentificationDao();
			ClientModele mod = new ClientModele();
			String mail = authentificationClientViews.textFieldEmail.getText();
			String motdepasse = authentificationClientViews.textFieldMotDePasse.getText();
			int nCo = 0;
			try {
				nCo = Integer.valueOf(authentificationClientViews.textFieldNumeroDeCompte.getText());
			}catch(NumberFormatException r) {
				JOptionPane.showMessageDialog(null, "Veuillez entrer votre numero de compte", "erreur compte",JOptionPane.ERROR_MESSAGE);
			}
			mod.setE_mail(mail);
			mod.setMotDePasse(motdepasse);
			mod.setNumeroCompte(nCo);
			boolean val2 = false;
			boolean valUser = false;
			try {
				val2 = dao.verifCompte(mod);
				valUser = dao.verifUser(mod);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(!val2) {
				JOptionPane.showMessageDialog(null, "Numero de compte invalide", "erreur Se connecter",JOptionPane.ERROR_MESSAGE);
			}
			if(!valUser) {
				JOptionPane.showMessageDialog(null, "Mot de passe ou E-mail incorrecte", "erreur Se connecter",JOptionPane.ERROR_MESSAGE);
			}else {
				if(val2 && valUser) {
					this.authentificationClientViews.setVisible(false);
					Affichage affi = new Affichage();
					try {
						affi.afficher(nCo);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			
		}
		if(source == authentificationClientViews.btnQuitter) {
			this.authentificationClientViews.setVisible(false);
			fenetre.bienvenue();
		}
		if(source == authentificationClientViews.chckbxMdp) {
			if(authentificationClientViews.chckbxMdp.isSelected()) {
				authentificationClientViews.textFieldMotDePasse.setEchoChar((char) 0);
			}else {
				authentificationClientViews.textFieldMotDePasse.setEchoChar('•');
			}
		}
		if(source == authentificationClientViews.btnAnnuler) {
			authentificationClientViews.textFieldEmail.setText("");
			authentificationClientViews.textFieldMotDePasse.setText("");
			authentificationClientViews.textFieldNumeroDeCompte.setText("");
		}
		
	}

}
