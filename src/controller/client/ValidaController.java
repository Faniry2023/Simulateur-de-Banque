package controller.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.daoClient.Affichage;
import dao.daoClient.RecMdp;
import dao.daoClient.TransfertDepot;
import dao.daoClient.TransfertRetrait;
import pointEntrer.FenetreViews;
import views.modeClient.ValidationTransfertViews;

public class ValidaController implements ActionListener{
	ValidationTransfertViews validationTransfertViews;
	public ValidaController(ValidationTransfertViews validationTransfertViews) {
		this.validationTransfertViews = validationTransfertViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		FenetreViews fenetre = new FenetreViews();
		TransfertDepot depot = new TransfertDepot();
		TransfertRetrait retrait = new TransfertRetrait();
		Affichage afficher = new Affichage();
		RecMdp motDePasse = new RecMdp();
		if(source == validationTransfertViews.btnValider) {
			boolean ret = false,mdp = false;
			try {
				mdp = motDePasse.recupererMdp(validationTransfertViews.passwordFieldValTrans.getText());
			} catch (SQLException e1) {
				mdp = false;
				e1.printStackTrace();
			}
			if(!mdp) {
				validationTransfertViews.lblmdpInco.setText("mot de passe incorrecte");
			}
			
			if(mdp) {
				try {
					ret = retrait.modifSoldeCurant(Integer.valueOf(validationTransfertViews.lblCompteEnvoyeur.getText()), Double.valueOf(validationTransfertViews.lblmessage.getText()), Integer.valueOf(validationTransfertViews.textFieldcompteTransf.getText()));
				}catch(Exception dd) {}
				if(!ret) {
					JOptionPane.showMessageDialog(null, "Votre solde est inssufisant pour cette transfert d'argent","erreur Transfert",JOptionPane.ERROR_MESSAGE);
				}
				if(ret) {
					depot.modifSoldeCurant(Integer.valueOf(validationTransfertViews.textFieldcompteTransf.getText()), Double.valueOf(validationTransfertViews.lblmessage.getText()), Integer.valueOf(validationTransfertViews.lblCompteEnvoyeur.getText()));
					this.validationTransfertViews.setVisible(false);
					try {
						afficher.afficher(Integer.valueOf(validationTransfertViews.lblCompteEnvoyeur.getText()));
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
		if(source == validationTransfertViews.btnAnnuler) {
			this.validationTransfertViews.setVisible(false);
			try {
				afficher.afficher(Integer.valueOf(validationTransfertViews.lblCompteEnvoyeur.getText()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(source == validationTransfertViews.btnRetour) {
			this.validationTransfertViews.setVisible(false);
			fenetre.transfert(validationTransfertViews.lblCompteEnvoyeur.getText());
		}
	}

}
