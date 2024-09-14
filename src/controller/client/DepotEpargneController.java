package controller.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.daoClient.Affichage;
import dao.daoClient.AuthenAction;
import dao.daoClient.DepotEpargneDao;
import pointEntrer.FenetreViews;
import views.modeClient.DepotEpargne;

public class DepotEpargneController implements ActionListener{
	DepotEpargne depotEpargne;
	public DepotEpargneController(DepotEpargne depotEpargne) {
		this.depotEpargne = depotEpargne;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		Affichage afficher = new Affichage();
		DepotEpargneDao depEp = new DepotEpargneDao();
		FenetreViews fenetre = new FenetreViews();
		AuthenAction au = new AuthenAction();
		if(source == depotEpargne.btnAnnuler) {
			this.depotEpargne.setVisible(false);
			try {
				afficher.afficher(Integer.valueOf(depotEpargne.textFieldCompte.getText()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}if(source == depotEpargne.btnValider) {
			boolean solde = false;
			boolean auto = false;
			double sold = 0;
			try {
				sold = Double.valueOf(depotEpargne.textFieldDepot.getText());
				solde = true;
			}catch(NumberFormatException f) {
				JOptionPane.showMessageDialog(null, "Veuillez entrer le montant à déposer pas des lettre!", "erreur Depot",JOptionPane.ERROR_MESSAGE);
			}
			try {
				auto = au.auth(depotEpargne.passwordField.getText(), Integer.valueOf(depotEpargne.textFieldCompte.getText()));
			}catch(Exception l) {
				
			}
			if(!auto) {
				depotEpargne.lblMdpIncorrect.setText("Mot de passe incorrecte");
			}
			if(auto && solde) {
				try {
					depEp.modifSoldeCurant(Integer.valueOf(depotEpargne.textFieldCompte.getText()), sold);
					afficher.afficher(Integer.valueOf(depotEpargne.textFieldCompte.getText()));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

}
