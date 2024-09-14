package controller.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.daoClient.Affichage;
import dao.daoClient.AuthenAction;
import dao.daoClient.RetraitDao;
import dao.daoClient.UpdateSolde;
import pointEntrer.FenetreViews;
import views.modeClient.DepotVEpargne;

public class DepotVEpargneController implements ActionListener{
	DepotVEpargne depotVEpargne;
	public DepotVEpargneController(DepotVEpargne depotVEpargne) {
		this.depotVEpargne = depotVEpargne;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		Affichage affi = new Affichage();
		AuthenAction auth = new AuthenAction();
		FenetreViews fenetre = new FenetreViews();
		if(source == depotVEpargne.btnAnnuler) {
			int num = Integer.valueOf(depotVEpargne.textFieldCompte.getText());
			try {
				affi.afficher(num);
				this.depotVEpargne.setVisible(false);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(source == depotVEpargne.btnValider) {
			int num = Integer.valueOf(depotVEpargne.textFieldCompte.getText());
			boolean testSolde = false;
			boolean testMdp = false;
			double solde = 0;
			try {
				solde = Double.valueOf(depotVEpargne.textFieldDepot.getText());
				testSolde = true;
			}catch(NumberFormatException f) {
				JOptionPane.showMessageDialog(null, "Veuillez entrer le montant à déposer pas des lettre!", "erreur Depot",JOptionPane.ERROR_MESSAGE);
			}
			try {
				testMdp = auth.auth(depotVEpargne.passwordField.getText(), num);
			}catch(Exception g) {}
			if(!testMdp) {
				depotVEpargne.lblIncorrecte.setText("Mot de passe Incorrecte");
			}
			if(testSolde && testMdp) {
				RetraitDao retrait = new RetraitDao();
				UpdateSolde depot = new UpdateSolde();
				boolean testRetrait = false;
				try {
					testRetrait = retrait.retraitEpargne(num, solde);
				}catch(Exception g) {}
				if(testRetrait) {
					depot.modifSoldeCurant(num, solde);
					try {
						affi.afficher(num);
						this.depotVEpargne.setVisible(false);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "Désolé, votre solde du compte Epargne est insufisant pour cette depot de "+ solde, "erreur Depot",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
	}

}
