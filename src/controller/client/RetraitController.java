package controller.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.daoClient.Affichage;
import dao.daoClient.AuthenAction;
import dao.daoClient.RetraitDao;
import views.modeClient.RetraitViews;

public class RetraitController implements ActionListener{
	RetraitViews retraitViews;
	public RetraitController(RetraitViews retraitViews) {
		this.retraitViews = retraitViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		Affichage afficher = new Affichage();
		RetraitDao retrait = new RetraitDao();
		AuthenAction au = new AuthenAction();
		if(source == retraitViews.btnAnnuler) {
			int compte = Integer.valueOf(retraitViews.textFieldCompte.getText());
			this.retraitViews.setVisible(false);
			try {
				afficher.afficher(compte);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(source == retraitViews.btnValider) {
			int compte = Integer.valueOf(retraitViews.textFieldCompte.getText());
			double solde = 0;
			String pass = retraitViews.passwordFieldRetrait.getText();
			boolean resteArgent = false;
			boolean authRetr = false;
			boolean changementSolde = false;
			try {
				solde = Double.valueOf(retraitViews.textFieldRetrait.getText());
				changementSolde = true;
			}catch(NumberFormatException f) {
				JOptionPane.showMessageDialog(null, "Veuillez entrer le montant à retirer pas des lettre!", "erreur Depot",JOptionPane.ERROR_MESSAGE);
			}
			try {
				authRetr = au.auth(pass, compte);
			}catch(Exception h) {}
			if(!authRetr) {
				retraitViews.lblmdpIncorrect.setText("Veuillez verifier votre mot de passe");
			}
			try {
				resteArgent = retrait.modifSoldeCurant(compte, solde);
			}catch(Exception g) {}
			if(!resteArgent) {
				JOptionPane.showMessageDialog(null, "Désolé, votre Solde est insufisant pour cette retrait de "+ solde, "erreur Retrait",JOptionPane.ERROR_MESSAGE);
			}
			if(changementSolde && authRetr && resteArgent) {
				this.retraitViews.setVisible(false);
				try {
					afficher.afficher(compte);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

}
