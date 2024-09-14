package controller.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.daoClient.Affichage;
import dao.daoClient.AuthenAction;
import dao.daoClient.UpdateSolde;
import pointEntrer.FenetreViews;
import views.modeClient.DepotViews;

public class DepotController implements ActionListener{
	DepotViews depotViews;
	public DepotController(DepotViews depotViews) {
		this.depotViews = depotViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FenetreViews fenetre = new FenetreViews();
		Affichage af = new Affichage();
		Object source = e.getSource();
		if(source == depotViews.btnQuitter) {
			int num = Integer.valueOf(depotViews.textFieldNumCompte.getText());
			this.depotViews.setVisible(false);
			try {
				af.afficher(num);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if(source == depotViews.btnValider) {
			AuthenAction au = new AuthenAction();
			boolean validation = false;
			UpdateSolde plus = new UpdateSolde();
			int num = Integer.valueOf(depotViews.textFieldNumCompte.getText());
			String soldeString = depotViews.spinnerSoldeDepot.getText();
			double solde = 0;
			boolean sol = false;
			try {
				solde = Double.valueOf(soldeString);
				sol = true;
			}catch(NumberFormatException f) {
				JOptionPane.showMessageDialog(null, "Veuillez entrer le montant à déposer pas des lettre!", "erreur Depot",JOptionPane.ERROR_MESSAGE);
			}
			String pass = depotViews.passwordFieldDepot.getText();
			try {
				validation = au.auth(pass, num);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(validation && sol) {
				plus.modifSoldeCurant(num, solde);
				this.depotViews.setVisible(false);
				try {
					af.afficher(num);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else {
				depotViews.lblMdpIncorrect.setText("Veuillez verifier votre mot de passe");
			}
		}
		
	}

}
