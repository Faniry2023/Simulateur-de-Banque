package controller.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.daoClient.Affichage;
import dao.daoClient.AuthenAction;
import dao.daoClient.RetraitDao;
import views.modeClient.RetraitEpargneViews;

public class RetraitEpargneControlle implements ActionListener{
	RetraitEpargneViews retraitEpargneViews;
	public RetraitEpargneControlle(RetraitEpargneViews retraitEpargneViews) {
		this.retraitEpargneViews = retraitEpargneViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		Affichage afficher = new Affichage();
		RetraitDao retraitDao = new RetraitDao();
		AuthenAction auth = new AuthenAction();
		if(source == retraitEpargneViews.btnQuitter) {
			try {
				afficher.afficher(Integer.valueOf(retraitEpargneViews.textFieldCompte.getText()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.retraitEpargneViews.setVisible(false);
		}
		if(source == retraitEpargneViews.btnValider) {
			boolean testSolde = false;
			boolean testMdp = false;
			double solde = 0;
			try {
				solde = Double.valueOf(retraitEpargneViews.textFieldRetrait.getText());
				testSolde = true;
			}catch(NumberFormatException r) {
				JOptionPane.showMessageDialog(null, "Veuillez entrer le montant à retirer pas des lettre!", "erreur Depot",JOptionPane.ERROR_MESSAGE);
			}
			try {
				testMdp = auth.auth(retraitEpargneViews.passwordField.getText(), Integer.valueOf(retraitEpargneViews.textFieldCompte.getText()));
			}catch(Exception t) {}
			if(!testMdp) {
				retraitEpargneViews.lblIncorrecte.setText("Mot de passe incorrecte");
			}
			if(testSolde && testMdp) {
				boolean valid = false;
				try {
					valid = retraitDao.retraitEpargne(Integer.valueOf(retraitEpargneViews.textFieldCompte.getText()), solde);
				}catch(Exception d) {}
				if(valid) {
					try {
						afficher.afficher(Integer.valueOf(retraitEpargneViews.textFieldCompte.getText()));
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "Désolé, votre compte est insufisant pour cette retreit de "+ solde, "erreur Depot",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}

}
