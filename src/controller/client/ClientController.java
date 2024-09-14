package controller.client;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import dao.daoClient.ReupImage;
import pointEntrer.FenetreViews;
import views.modeClient.ClientViews;

public class ClientController implements ActionListener{
	ClientViews clientViews;
	public ClientController(ClientViews clientViews) {
		this.clientViews = clientViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		FenetreViews fenetre = new FenetreViews();
		if(source == clientViews.btnSortirDuCompte) {
			this.clientViews.setVisible(false);
			fenetre.authentificationClient();
		}
		if(source == clientViews.btnDepot) {
			this.clientViews.setVisible(false);
			fenetre.depot(clientViews.lblNumeroCompte.getText());
		}
		if(source == clientViews.btnRetrait) {
			this.clientViews.setVisible(false);
			fenetre.retrei(clientViews.lblNumeroCompte.getText());
		}
		if(source == clientViews.btnTransaction) {
			this.clientViews.setVisible(false);
			fenetre.transfert(clientViews.lblNumeroCompte.getText());
		}
		if(source == clientViews.btnDepotCEpargne) {
			this.clientViews.setVisible(false);
			fenetre.depotEpargne(clientViews.lblNumeroCompte.getText());
		}
		if(source == clientViews.btnRetraitE) {
			fenetre.retraitEpargne(clientViews.lblNumeroCompte.getText());
			this.clientViews.setVisible(false);
		}
		if(source == clientViews.btnDepotVenantEpargne) {
			fenetre.depVenEpargne(clientViews.lblNumeroCompte.getText());
			this.clientViews.setVisible(false);
		}
		if(source == clientViews.btnRetraitPourEpargne) {
			fenetre.retraitPourEpargne(clientViews.lblNumeroCompte.getText());
			this.clientViews.setVisible(false);
		}
		if(source == clientViews.btnSecuriter) {
			fenetre.confidentialiter(clientViews.lblNumeroCompte.getText());
			this.clientViews.setVisible(false);
		}
		if(source == clientViews.btnModifier) {
			this.clientViews.setVisible(false);
			ReupImage ima = new ReupImage();
			ImageIcon ic = new ImageIcon(ima.recupererImage(Integer.valueOf(clientViews.lblNumeroCompte.getText())));
			Image im = ic.getImage().getScaledInstance(200, 170, Image.SCALE_SMOOTH);
			ImageIcon vrai = new ImageIcon(im);
			String nom = clientViews.lblNom.getText(), prenom = clientViews.lblPrenom.getText(), lieu = clientViews.lblLieuNaissance.getText();
			String cin = clientViews.lblCin.getText(), ad = clientViews.lblAdresse.getText(), cont = clientViews.lblContact.getText();
			fenetre.modifier(clientViews.lblNumeroCompte.getText(), vrai, ima.recupererImage(Integer.valueOf(clientViews.lblNumeroCompte.getText())), nom, prenom, lieu, cin, ad, cont);
		}
		
	}

}
