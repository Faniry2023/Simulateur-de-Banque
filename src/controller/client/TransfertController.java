package controller.client;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import dao.daoClient.Affichage;
import dao.daoClient.RecCompte;
import dao.daoClient.RecuperePrenom;
import dao.daoClient.ReupImage;
import pointEntrer.FenetreViews;
import views.modeClient.TransactionViews;

public class TransfertController implements ActionListener{
	TransactionViews transactionViews;
	public TransfertController(TransactionViews transactionViews) {
		this.transactionViews= transactionViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		Affichage affi = new Affichage();
		FenetreViews fenetre = new FenetreViews();
		ReupImage imBdd = new ReupImage();
		RecuperePrenom prenom = new RecuperePrenom();
		if(source == transactionViews.btnAnnuler) {
			int compte = Integer.valueOf(transactionViews.textFieldCompte.getText());
			this.transactionViews.setVisible(false);
			try {
				affi.afficher(compte);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(source == transactionViews.btnValider) {
			RecCompte co = new RecCompte();
			boolean valider = false;
			boolean changeCo = false;
			boolean chaMon = false;
			double mont = 0;
			int numC = 0;
			try {
				mont = Double.valueOf(transactionViews.textFieldTransfert.getText());
				chaMon = true;
			}catch(NumberFormatException g) {}
			if(!chaMon) {
				JOptionPane.showMessageDialog(null, "Veuillez entrer le montant à retirer pas des lettre!", "erreur montant",JOptionPane.ERROR_MESSAGE);
			}
			try {
				numC = Integer.valueOf(transactionViews.textFieldTransCompte.getText());
				changeCo = true;
			}catch(NumberFormatException hh) {}
			int i = 0;
			if(changeCo) {
				if(transactionViews.textFieldCompte.getText().equals(transactionViews.textFieldTransCompte.getText())) {
					JOptionPane.showMessageDialog(null, "Vous ne pouvez pas envoyer de l'argent a vous même, désolé!","erreur Transfert",JOptionPane.ERROR_MESSAGE);
					changeCo = false;
				}
			}
				try {
					valider = co.compte(Integer.valueOf(transactionViews.textFieldTransCompte.getText()));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Compte invalide","erreur Transfert",JOptionPane.ERROR_MESSAGE);
					i = 1;
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Compte invalide","erreur Transfert",JOptionPane.ERROR_MESSAGE);
					i = 1;
				}
			
			if(!valider && i == 0) {
				JOptionPane.showMessageDialog(null, "Désolé, Le compte que vous avez saisir n'éxiste pas ","erreur Transfert",JOptionPane.ERROR_MESSAGE);
			}
			if(valider && changeCo && chaMon) {
				this.transactionViews.setVisible(false);
				ImageIcon ico = new ImageIcon(imBdd.recupererImage(Integer.valueOf(transactionViews.textFieldTransCompte.getText())));
				Image im = ico.getImage().getScaledInstance(280, 270, Image.SCALE_SMOOTH);
				ImageIcon imaIco = new ImageIcon(im);
				fenetre.validate(transactionViews.textFieldTransfert.getText(), prenom.prenom(Integer.valueOf(transactionViews.textFieldTransCompte.getText())), transactionViews.textFieldTransCompte.getText(), imaIco,transactionViews.textFieldCompte.getText());
			}
			
			
		}
		
	}

}
