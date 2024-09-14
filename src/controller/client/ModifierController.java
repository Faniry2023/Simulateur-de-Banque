package controller.client;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import algoUtil.Mois;
import cameraModifier.Camera;
import controller.client.testeur.Testeur;
import dao.daoClient.Affichage;
import dao.daoClient.AjoutCli;
import modele.modelClient.ClientModele;
import views.modeClient.ModifierViews;

public class ModifierController implements ActionListener{
	ModifierViews modifierViews;
	public ModifierController(ModifierViews modifierViews) {
		this.modifierViews = modifierViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object s = e.getSource();
		Affichage afficher = new Affichage();
		if(s == modifierViews.btnPrendreImage) {
			this.modifierViews.setVisible(false);
			Camera.main(null, modifierViews.textFieldNumCompte.getText());
		}
		if(s == modifierViews.btnChoisirUneImage) {
			File f;
			String path;
			JFileChooser fileChooser = new JFileChooser();
			FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
			fileChooser.addChoosableFileFilter(fnwf);
			int load = fileChooser.showOpenDialog(null);
			if(load == fileChooser.APPROVE_OPTION) {
				f = fileChooser.getSelectedFile();
				path = f.getAbsolutePath();
				ImageIcon ico = new ImageIcon(path);
				Image img = ico.getImage().getScaledInstance(220, 170, Image.SCALE_SMOOTH);
				modifierViews.lblImage.setIcon(new ImageIcon(img));
				modifierViews.lbllienImage.setText(path);
			}
		}
		if(s == modifierViews.btnAnnuler) {
			try {
				afficher.afficher(Integer.valueOf(modifierViews.textFieldNumCompte.getText()));
			} catch (NumberFormatException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.modifierViews.setVisible(false);
		}
		if(s == modifierViews.btnModifier) {
			Testeur tes = new Testeur();
			int num = Integer.valueOf(modifierViews.textFieldNumCompte.getText());
			boolean vali = false;
			boolean name = true, firsteName = true,date = true,lieu = true,carte = true,add = true,im = true;
			//Teste numero telephone variable ###cont### / bool ==vali 
			String cont = modifierViews.textFieldContact.getText();
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
				modifierViews.textFieldContact.setText("+261");
			}else {
				if(cont.length() > 13) {
					JOptionPane.showMessageDialog(null, "numeero de telephone doit être inférieure à 12 entier", "erreur apres +261",JOptionPane.ERROR_MESSAGE);
					vali = false;
				}
			}
			
			
			//test image variable ####lienDeImage###### / bool = im
			String lienDeImage = modifierViews.lbllienImage.getText();
			if(modifierViews.lbllienImage.getText() == null) {
				im = false;
				JOptionPane.showMessageDialog(null, "Veuillez entrer une image ou prendre un photo", "Completez les formulaire",JOptionPane.ERROR_MESSAGE);
			}else {
				im = true;
				lienDeImage = lienDeImage.replace("\\", "\\\\");
			}
			//test nom variable = nom / bool = name
			String nom = modifierViews.textFieldNom.getText().toUpperCase();
			if(nom == null || nom.equals("")) {
				name = false;
				JOptionPane.showMessageDialog(null, "Completer le champ \"Nom\"", "erreur nom",JOptionPane.ERROR_MESSAGE);
				System.out.print("erreur 93");
			}else {
				name = true;
			}
			//test prenom variable = prenom / bool = firsteName
			String prenom = modifierViews.textFieldPrenom.getText();
			if(prenom == null || prenom.equals("")) {
				firsteName = false;
				JOptionPane.showMessageDialog(null, "Completer le champ \"Prenom\"", "erreur prenom",JOptionPane.ERROR_MESSAGE);
				System.out.print("erreur 98");
			}else {
				firsteName = true;
			}
			//test date variable = dateDeNaissance / bool date
			int jours = Integer.valueOf(modifierViews.comboBoxJours.getSelectedItem().toString());
			Mois m = new Mois();
			int mois = m.transformeMois((String) modifierViews.comboBoxMois.getSelectedItem());
			int anne = Integer.valueOf(modifierViews.comboBoxAnnee.getSelectedItem().toString());
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
			String lieuNaissance = modifierViews.textFieldLieuNaissance.getText();
			lieu = tes.testLieu(modifierViews.textFieldLieuNaissance.getText());
			if(!lieu) {
				JOptionPane.showMessageDialog(null, "Comopletez le champ Lieu de naissance", "Lieu naissance",JOptionPane.ERROR_MESSAGE);
			}
			//teste carte cin variable = cin / bool carte
			String cin = new String();
			String c = modifierViews.textFieldCIN.getText();
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
			String adresse = modifierViews.textFieldAdresse.getText();
			if(adresse.equals("")) {
				add = false;
				JOptionPane.showMessageDialog(null, "Completer le champ \"Adresse\"", "erreur adresse",JOptionPane.ERROR_MESSAGE);
				System.out.print("erreur 146");
			}else {
				add = true;
			}
			//prendre le sexe variable = sexe
			String sexe = modifierViews.comboBoxSexe.getSelectedItem().toString();
			
			
			ClientModele modele = new ClientModele();
			if(vali && name && firsteName && date && lieu && carte && add) {
				modele.setLienImage(lienDeImage);
				modele.setNom(nom);
				modele.setPrenom(prenom);
				modele.setDateNaissance(dateDeNaissance);
				modele.setLieuNaissance(lieuNaissance);
				modele.setCin(cin);
				modele.setAdresse(adresse);
				modele.setSexe(sexe);
				modele.setContact(cont);
				modele.setNumeroCompte(num);
				//ENTRER DANS LA BASE
				AjoutCli ajoutCl = new AjoutCli();
				if(im) {
					boolean  ajo = false;
					try {
						ajo = ajoutCl.modCli(modele);
					}catch(Exception er) {
						System.out.print(er.getMessage());
					}
					if(ajo) {
						this.modifierViews.setVisible(false);
						try {
							afficher.afficher(num);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}else {
					boolean  ajo = false;
					try {
						ajo = ajoutCl.modCliSansIm(modele);
					}catch(Exception er) {
						System.out.print(er.getMessage());
					}
					if(ajo) {
						this.modifierViews.setVisible(false);
						try {
							afficher.afficher(num);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				
			}
		}
		
	}
}
