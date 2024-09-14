package controller.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.daoClient.Affichage;
import dao.daoClient.AuthenAction;
import dao.daoClient.ConfiDao;
import modele.modelClient.ClientModele;
import pointEntrer.FenetreViews;
import views.modeClient.ConfidentialiterViews;

public class ConfidentialiterController implements ActionListener{
	ConfidentialiterViews confidentialiterViews;
	public ConfidentialiterController(ConfidentialiterViews confidentialiterViews) {
		this.confidentialiterViews = confidentialiterViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object s = e.getSource();
		ConfiDao dao = new ConfiDao();
		AuthenAction auth = new AuthenAction();
		FenetreViews fenetre = new FenetreViews();
		ClientModele mo = new ClientModele();
		if(s == confidentialiterViews.btnValider) {
			int id = Integer.valueOf(confidentialiterViews.textFieldCompte.getText());
			boolean ancienMdp = false, nvMdp = false, email = false;
			try {
				ancienMdp = auth.auth(confidentialiterViews.passwordFieldAncient.getText(), id);
			}catch(Exception d) {}
			if(!ancienMdp) {
				confidentialiterViews.lblIncorrect.setText("Mot de passe incorrecte");
			}
			if(confidentialiterViews.passwordFieldConfirme.getText().equals(confidentialiterViews.passwordFieldNv.getText())) {
				nvMdp = true;
			}
			if(!nvMdp) {
				JOptionPane.showMessageDialog(null, "Veullier verifier la confirmation de votre mot de passe", "Erreur Mot de passe",JOptionPane.ERROR_MESSAGE);
			}
			if(confidentialiterViews.textFieldEmail.getText().endsWith("@gmail.com")) {
				email = true;
			}else {
				JOptionPane.showMessageDialog(null, "Le compte E-mail devrait se terminer par \"@gmail.com\"", "Erreur compte Email",JOptionPane.ERROR_MESSAGE);
			}
			if(ancienMdp && nvMdp && email) {
				if(JOptionPane.showConfirmDialog(null, "cette compte sera déconnecter diractement, voulez vous continuer", "Changement confidentialiter",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
					mo.setE_mail(confidentialiterViews.textFieldEmail.getText());
					mo.setMotDePasse(confidentialiterViews.passwordFieldConfirme.getText());
					fenetre.authentificationClient();
					this.confidentialiterViews.setVisible(false);
					dao.modConf(id, mo);
				}
			}
		}
		if(s == confidentialiterViews.btnAnnuler) {
			Affichage a = new Affichage();
			this.confidentialiterViews.setVisible(false);
			try {
				a.afficher(Integer.valueOf(confidentialiterViews.textFieldCompte.getText()));
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
