package controller.client;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import algoUtil.Mois;
import camera.Camera;
import controller.client.testeur.Testeur;
import dao.daoClient.Action;
import dao.daoClient.AjoutCli;
import dao.daoClient.InscriptionDao;
import modele.modelClient.ClientModele;
import pointEntrer.FenetreViews;
import views.modeClient.NouveauCompteViews;

public class NouveauCompteController implements ActionListener{
	NouveauCompteViews nouveauCompteViews;
	public NouveauCompteController(NouveauCompteViews nouveauCompteViews) {
		this.nouveauCompteViews = nouveauCompteViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FenetreViews fenetre = new FenetreViews();
		Object source = e.getSource();
		String path;
		File f;
		int ecri = 0;
		if(source == nouveauCompteViews.btnAnnuler) {
			this.nouveauCompteViews.setVisible(false);
			fenetre.authentificationClient();
		}
		if(source == nouveauCompteViews.btnChoisirUneImage) {
			JFileChooser fileChooser = new JFileChooser();
			FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
			fileChooser.addChoosableFileFilter(fnwf);
			int load = fileChooser.showOpenDialog(null);
			if(load == fileChooser.APPROVE_OPTION) {
				f = fileChooser.getSelectedFile();
				path = f.getAbsolutePath();
				ImageIcon ico = new ImageIcon(path);
				Image img = ico.getImage().getScaledInstance(220, 170, Image.SCALE_SMOOTH);
				nouveauCompteViews.lblImage.setIcon(new ImageIcon(img));
				nouveauCompteViews.lienImage.setText(path);
			}
		}
		if(source == nouveauCompteViews.btnPrendreImage) {
			String nCo = nouveauCompteViews.textFieldNumCompte.getText();
			Camera came = new Camera();
			came.lblCompte.setText(nCo);
			Camera.main(null,nCo);
			/*ImageIcon ico = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\images\\img.jpg");
			Image img = ico.getImage().getScaledInstance(220, 170, Image.SCALE_SMOOTH);
			nouveauCompteViews.lblImage.setIcon(new ImageIcon(img));*/
			this.nouveauCompteViews.setVisible(false);
			
		}
		if(source == nouveauCompteViews.btnEnregistrer) {
			Testeur tes = new Testeur();
			int num = Integer.valueOf(nouveauCompteViews.textFieldNumCompte.getText());
			boolean vali = false;
			boolean name = true, firsteName = true,date = true,lieu = true,carte = true,add = true,gmail = true,mdps = true,im = true;
			//Teste numero telephone variable ###cont### / bool ==vali 
			String cont = nouveauCompteViews.textFieldContact.getText();
			String numero ="";
			try {
				numero = cont.substring(4,cont.length());
				vali = true;
			}catch(StringIndexOutOfBoundsException j) {
				vali = false;
				System.out.print("erreur 75");
			}
			if(vali == false || !cont.substring(0, 4).equals("+261")) {
				JOptionPane.showMessageDialog(null, "Commencer par +261", "erreur apres +261",JOptionPane.ERROR_MESSAGE);
				vali = false;
				nouveauCompteViews.textFieldContact.setText("+261");
			}else {
				if(cont.length() > 13) {
					JOptionPane.showMessageDialog(null, "numeero de telephone doit être inférieure à 12 entier", "erreur apres +261",JOptionPane.ERROR_MESSAGE);
					vali = false;
				}
			}
			
			
			//test image variable ####lienDeImage###### / bool = im
			String lienDeImage = nouveauCompteViews.lienImage.getText();
			if(nouveauCompteViews.lienImage.getText() == null) {
				im = false;
				JOptionPane.showMessageDialog(null, "Veuillez entrer une image ou prendre un photo", "Completez les formulaire",JOptionPane.ERROR_MESSAGE);
			}else {
				im = true;
				lienDeImage = lienDeImage.replace("\\", "\\\\");
			}
			//test nom variable = nom / bool = name
			String nom = nouveauCompteViews.textFieldNom.getText().toUpperCase();
			if(nom == null || nom.equals("")) {
				name = false;
				JOptionPane.showMessageDialog(null, "Completer le champ \"Nom\"", "erreur nom",JOptionPane.ERROR_MESSAGE);
				System.out.print("erreur 93");
			}else {
				name = true;
			}
			//test prenom variable = prenom / bool = firsteName
			String prenom = nouveauCompteViews.textFieldPrenom.getText();
			if(prenom == null || prenom.equals("")) {
				firsteName = false;
				JOptionPane.showMessageDialog(null, "Completer le champ \"Prenom\"", "erreur prenom",JOptionPane.ERROR_MESSAGE);
				System.out.print("erreur 98");
			}else {
				firsteName = true;
			}
			//test date variable = dateDeNaissance / bool date
			int jours = Integer.valueOf(nouveauCompteViews.comboBoxJours.getSelectedItem().toString());
			Mois m = new Mois();
			int mois = m.transformeMois((String) nouveauCompteViews.comboBoxMois.getSelectedItem());
			int anne = Integer.valueOf(nouveauCompteViews.comboBoxAnnee.getSelectedItem().toString());
			String dateDeNaissance = "";
			if(mois == 2 && jours > 29) {
				date = false;
				JOptionPane.showMessageDialog(null, "Le mois Fevrier ne contient pas des jours 30, 31", "Date naissance",JOptionPane.ERROR_MESSAGE);
			}else {
				if((mois == 4 || mois == 6 || mois == 9 || mois == 11) && (jours == 31)) {
					date = false;
					System.out.print("erreur 110");
					JOptionPane.showMessageDialog(null, "Le mois que vous avez choisi ne contient pas le jour 31", "Date naissance",JOptionPane.ERROR_MESSAGE);
				}else {
					date = true;
					dateDeNaissance = anne + "-" + mois + "-" + jours;
				}
			}
			//test lieu naissance variable = lieuNaissance / bool = lieu
			String lieuNaissance = nouveauCompteViews.textFieldLieuNaissance.getText();
			lieu = tes.testLieu(nouveauCompteViews.textFieldLieuNaissance.getText());
			if(!lieu) {
				JOptionPane.showMessageDialog(null, "Comopletez le champ Lieu de naissance", "Lieu naissance",JOptionPane.ERROR_MESSAGE);
			}
			//teste carte cin variable = cin / bool carte
			String cin = new String();
			String c = nouveauCompteViews.textFieldCIN.getText();
			try {
				 
				int a = Integer.valueOf(c.substring(0, 6));
				int b = Integer.valueOf(c.substring(6, 12));
				cin = a + "" + b;
				carte = true;
			}catch(NumberFormatException ee) {
				carte = false;
				System.out.print("erreur 133");
			}
			catch(StringIndexOutOfBoundsException t) {
				carte = false;
				System.out.print("erreur 137");
			}
			if(!carte || c.length() > 12 || c.length() < 12) {
				JOptionPane.showMessageDialog(null, "La carte d'identite nationnal compte 12 entiers", "Erreur entier",JOptionPane.ERROR_MESSAGE);
				carte = false;
			}
			
			
			//test adresse variable = adresse / bool add
			String adresse = nouveauCompteViews.textFieldAdresse.getText();
			if(adresse.equals("")) {
				add = false;
				JOptionPane.showMessageDialog(null, "Completer le champ \"Adresse\"", "erreur adresse",JOptionPane.ERROR_MESSAGE);
				System.out.print("erreur 146");
			}else {
				add = true;
			}
			//prendre le sexe variable = sexe
			String sexe = nouveauCompteViews.comboBoxSexe.getSelectedItem().toString();
			//test gmail variable = Email / bool = gmail
			String Email = nouveauCompteViews.textFieldEmail.getText();
			gmail = tes.testeEmail(nouveauCompteViews.textFieldEmail.getText());
			if(!gmail) {
				JOptionPane.showMessageDialog(null, "Le compte E-mail devrait se terminer par \"@gmail.com\"", "Erreur compte Email",JOptionPane.ERROR_MESSAGE);
			}
			
			//testeur des deux mot de passe variable motDePasse bool mdps
			String testeMdp = nouveauCompteViews.passwordFieldNV.getText();
			String mdpVrai = nouveauCompteViews.passwordFieldConfirmer.getText();
			if(mdpVrai.equals("")) {
				mdps = false;
				JOptionPane.showMessageDialog(null, "Completer le champ \"Mot de passe\"", "erreur mot de passe",JOptionPane.ERROR_MESSAGE);
				System.out.print("erreur mdpVrai 159");
			}else {
				if(testeMdp.equals(mdpVrai)) {
					mdps = true;
				}else {
					mdps = false;
					JOptionPane.showMessageDialog(null, "Veullier verifier la confirmation de votre mot de passe", "Erreur Mot de passe",JOptionPane.ERROR_MESSAGE);
					System.out.print("erreur mdpVrai 166");
				}
			}
			String hist = "Bonjour vous n'avez pas encore des historique votre compte est de 0.0Ar";
			//AJOUTANT DANS LA BASE DE DONNE
			ClientModele modele = new ClientModele();
			if(vali && name && firsteName && date && lieu && carte && add && gmail && mdps && im) {
				
				modele.setLienImage(lienDeImage);
				modele.setNom(nom);
				modele.setPrenom(prenom);
				modele.setDateNaissance(dateDeNaissance);
				modele.setLieuNaissance(lieuNaissance);
				modele.setCin(cin);
				modele.setAdresse(adresse);
				modele.setSexe(sexe);
				modele.setContact(cont);
				modele.setE_mail(Email);
				modele.setMotDePasse(mdpVrai);
				modele.setNumeroCompte(num);
				modele.setHisorique("Bonjour " + prenom);
				modele.setHisorique2("Vous n avez pas encore fait des action votre solde est de 0.00ar");
				modele.setHistoireEpargne("Bonjour " + prenom);
				modele.setHistoireEpargne2("Vous n avez pas encore fait des action votre solde est de 0.00ar");
				modele.setSoldeCourant("0.00");
				modele.setSoldeEpargne("0.00");
				//ENTRER DANS LA BASE
				InscriptionDao login = new InscriptionDao();
				AjoutCli ajoutCl = new AjoutCli();
				Action actionne = new Action();
				boolean log = false, ajo = false, ac = false;
				try {
					log = login.ajoutLoginClient(modele);
					ajo = ajoutCl.add(modele);
					ac = actionne.actionCompte(modele);
				}catch(Exception er) {
					System.out.print(er.getMessage());
				}
				if(log && ajo && ac) {
					this.nouveauCompteViews.setVisible(false);
					fenetre.authentificationClient();
				}
			}
		}
		if(source == nouveauCompteViews.chckbxAffiMdpNv) {
			if(nouveauCompteViews.chckbxAffiMdpNv.isSelected()) {
				nouveauCompteViews.passwordFieldNV.setEchoChar((char) 0);
				nouveauCompteViews.passwordFieldConfirmer.setEchoChar((char) 0);
				ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\oeil.png");
				Image imaIcc = icone.getImage();
				Image imscall = imaIcc.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
				ImageIcon scalVr = new ImageIcon(imscall);
				nouveauCompteViews.chckbxAffiMdpNv.setIcon(scalVr);
				
			}else {
				nouveauCompteViews.passwordFieldNV.setEchoChar('•');
				nouveauCompteViews.passwordFieldConfirmer.setEchoChar('•');
				ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\oeilClo.png");
				Image imaIcc = icone.getImage();
				Image imscall = imaIcc.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
				ImageIcon scalVr = new ImageIcon(imscall);
				nouveauCompteViews.chckbxAffiMdpNv.setIcon(scalVr);
			}
		}
	}

}
