package controller.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.daoClient.Affichage;
import dao.daoClient.AuthenAction;
import dao.daoClient.DepotEpargneDao;
import dao.daoClient.RetraitDao;
import pointEntrer.FenetreViews;
import views.modeClient.RetraitPourEpargne;

public class RetraitPourEpaController implements ActionListener{
	RetraitPourEpargne retraitPourEpargne;
	public RetraitPourEpaController(RetraitPourEpargne retraitPourEpargne) {
		this.retraitPourEpargne = retraitPourEpargne;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		FenetreViews fenetre = new FenetreViews();
		Affichage affi = new Affichage();
		RetraitDao retrait = new RetraitDao();
		DepotEpargneDao depot = new DepotEpargneDao();
		AuthenAction auth = new AuthenAction();
		if(source == retraitPourEpargne.btnAnnuler) {
			try {
				affi.afficher(Integer.valueOf(retraitPourEpargne.textFieldCompte.getText()));
				this.retraitPourEpargne.setVisible(false);
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(source == retraitPourEpargne.btnValider) {
			int num = Integer.valueOf(retraitPourEpargne.textFieldCompte.getText());
			double solde = 0;
			boolean testSolde = false, testMdp = false;
			try {
				solde = Double.valueOf(retraitPourEpargne.textFieldRetrait.getText());
				testSolde = true;
			}catch(NumberFormatException r) {
				JOptionPane.showMessageDialog(null, "Veuillez entrer le montant à retirer pas des lettre!", "erreur Depot",JOptionPane.ERROR_MESSAGE);
			}
			try {
				testMdp = auth.auth(retraitPourEpargne.passwordField.getText(), num);
			}catch(Exception h) {}
			if(!testMdp) {
				retraitPourEpargne.lblIncorrecte.setText("Mot de passe Incorrecte");
			}
			if(testSolde && testMdp) {
				boolean testRetrait = false;
				try {
					testRetrait = retrait.modifSoldeCurant(num, solde);
				}catch(Exception j) {}
				if(testRetrait) {
					depot.modifSoldeCurant(num, solde);
					try {
						affi.afficher(num);
						this.retraitPourEpargne.setVisible(false);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "Désolé, votre Solde est insufisant pour cette retreit de "+ solde, "erreur Depot",JOptionPane.ERROR_MESSAGE);
				}
			}
			
		}
		
	}

}
