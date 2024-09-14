package pointEntrer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import views.BienvenueViews;
import views.ChargementViews;
import views.modeClient.AuthentificationClientViews;
import views.modeClient.ClientViews;
import views.modeClient.ConfidentialiterViews;
import views.modeClient.DepotEpargne;
import views.modeClient.DepotVEpargne;
import views.modeClient.DepotViews;
import views.modeClient.ModifierViews;
import views.modeClient.NouveauCompteViews;
import views.modeClient.RetraitEpargneViews;
import views.modeClient.RetraitPourEpargne;
import views.modeClient.RetraitViews;
import views.modeClient.SortirCompteViews;
import views.modeClient.TransactionViews;
import views.modeClient.ValidationTransfertViews;
import views.modeGestionnaire.AuthentificationGestionnaireViews;
import views.modeGestionnaire.ImageViews;

public class FenetreViews {
	public void chargement() {
		ChargementViews chargement = new ChargementViews();
		chargement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chargement.setSize(600, 300);
		chargement.setLocationRelativeTo(null);
		chargement.setTitle("Bienvenue sur Your Banc");
		chargement.setResizable(false);
		chargement.setVisible(true);
		try {
			for(int i = 0; i <= 100; i++) {
				Thread.sleep(15);
				if(i <= 20) {
					chargement.lblcharger.setText("Chargement...");
				}
				if(i > 20 && i <= 45) {
					chargement.lblcharger.setText("Recupération des données...");
				}
				if(i > 45 && i <= 60) {
					chargement.lblcharger.setText("Traitement de donnée");
				}
				if(i > 60 && i <= 80) {
					chargement.lblcharger.setText("Preparation d'ouverture...");
				}
				if(i > 80 && i <= 95) {
					chargement.lblcharger.setText("Cargement d'ouverture...");
				}
				if(i >95 && i <=100) {
					chargement.lblcharger.setText("Ouverture en cours...");
				}
				if(i == 100) {
					chargement.setVisible(false);
					this.bienvenue();
				}
				chargement.lblchiffer.setText(i + "%");
				chargement.progressBar.setValue(i);
			}
		}catch(Exception r) {
			JOptionPane.showMessageDialog(null, "Chargement interrompu", "erreur d'ouverture",JOptionPane.ERROR_MESSAGE);
		}
	}
	public void bienvenue() {
		BienvenueViews bien = new BienvenueViews();
		bien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bien.setSize(800, 720);
		bien.setLocationRelativeTo(null);
		bien.setTitle("Bienvenue sur Your Banc");
		bien.setResizable(false);
		bien.setVisible(true);
	}
	public void authentificationClient() {
		
		AuthentificationClientViews authClient = new AuthentificationClientViews();
		authClient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		authClient.setSize(1000, 620);
		authClient.setLocationRelativeTo(null);
		authClient.setTitle("Mode Client - Authentification");
		authClient.setResizable(false);
		authClient.setVisible(true);
	}
	public void authentificationGestionnaire() {
		AuthentificationGestionnaireViews authGestion = new AuthentificationGestionnaireViews();
		authGestion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		authGestion.setSize(1000, 620);
		authGestion.setLocationRelativeTo(null);
		authGestion.setTitle("Mode Gestionnaire - Authentification");
		authGestion.setResizable(false);
		authGestion.setVisible(true);
	}
	public void nvcompte(String compte,ImageIcon imageClient,String lien) {
		NouveauCompteViews newCompte = new NouveauCompteViews();
		newCompte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newCompte.setSize(600, 760);
		newCompte.setLocationRelativeTo(null);
		newCompte.setTitle("Ajout Client");
		newCompte.setResizable(false);
		newCompte.textFieldContact.setText("+261");
		newCompte.textFieldNumCompte.setText(compte);
		newCompte.lblImage.setIcon(imageClient);
		newCompte.lienImage.setText(lien);
		newCompte.setVisible(true);
	}
	public void client(ImageIcon ico,int num,String nom,String prenom,String dateNaissance,String lieuNaiss,String Cin,String adresse,String sexe,String contact,String histoire,String histoire2,String histoireEpargn,String histoirEpargn2) {
		ClientViews client = new ClientViews();
		client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		client.setSize(1200,750);
		client.setLocationRelativeTo(null);
		client.setResizable(false);
		client.lblImage.setIcon(ico);
		client.lblNumeroCompte.setText(num+"");
		client.lblNom.setText(nom);
		client.lblPrenom.setText(prenom);
		client.lblDateNaissance.setText(dateNaissance);
		client.lblLieuNaissance.setText(lieuNaiss);
		client.lblCin.setText(Cin);
		client.lblAdresse.setText(adresse);
		client.lblSexe.setText(sexe);
		client.lblContact.setText(contact);
		client.textFieldCou1.setText(histoire);
		client.textFieldCou2.setText(histoire2);
		client.textFieldEp1.setText(histoireEpargn);
		client.textFieldEp2.setText(histoirEpargn2);
		if(ico == null) {
			client.lblNoImage.setText("Désole, votre appareil ne contient pas lvotre photo veillez prendre un autre");
		}
		client.setVisible(true);
	}
	public void sortiCompte() {
		SortirCompteViews sorti = new SortirCompteViews();
		sorti.setSize(300,150);
		sorti.setLocationRelativeTo(null);
		sorti.setResizable(false);
		sorti.setVisible(true);
	}
	public void depot(String compte) {
		DepotViews dep = new DepotViews();
		dep.setSize(400,250);
		dep.setLocationRelativeTo(null);
		dep.setResizable(false);
		dep.textFieldNumCompte.setText(compte);
		dep.setVisible(true);
	}
	public void retrei(String compte) {
		RetraitViews ret = new RetraitViews();
		ret.setSize(400,250);
		ret.setLocationRelativeTo(null);
		ret.setResizable(false);
		ret.textFieldCompte.setText(compte);
		ret.setVisible(true);
	}
	public void transfert(String num) {
		TransactionViews ret = new TransactionViews();
		ret.setSize(400,250);
		ret.setLocationRelativeTo(null);
		ret.setResizable(false);
		ret.textFieldCompte.setText(num);
		ret.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ret.setVisible(true);
	}
	public void validate(String montant,String prenom, String num, ImageIcon im,String envoyeur) {
		ValidationTransfertViews ret = new ValidationTransfertViews();
		ret.setSize(700,350);
		ret.setLocationRelativeTo(null);
		ret.setResizable(false);
		ret.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ret.lblmessage.setText(montant);
		ret.lblPrenom.setText(prenom);
		ret.lblCompteEnvoyeur.setText(envoyeur);
		ret.textFieldcompteTransf.setText(num);
		ret.lblImage.setIcon(im);
		ret.setVisible(true);
	}
	public void depotEpargne(String compte) {
		DepotEpargne dep = new DepotEpargne();
		dep.setSize(400,250);
		dep.setLocationRelativeTo(null);
		dep.setResizable(false);
		dep.textFieldCompte.setText(compte);
		dep.setVisible(true);
	}
	public void retraitEpargne(String num) {
		RetraitEpargneViews ret = new RetraitEpargneViews();
		ret.setSize(400,250);
		ret.setLocationRelativeTo(null);
		ret.textFieldCompte.setText(num);
		ret.setResizable(false);
		ret.setVisible(true);
	}
	public void depVenEpargne(String num) {
		DepotVEpargne ff = new DepotVEpargne();
		ff.setSize(400,250);
		ff.setLocationRelativeTo(null);
		ff.setResizable(false);
		ff.textFieldCompte.setText(num);
		ff.setVisible(true);
	}
	public void retraitPourEpargne(String num) {
		RetraitPourEpargne ep = new RetraitPourEpargne();
		ep.setSize(400,250);
		ep.setLocationRelativeTo(null);
		ep.setResizable(false);
		ep.textFieldCompte.setText(num);
		ep.setVisible(true);
	}
	public void afficherImage(String ico) {
		ImageViews ima = new ImageViews();
		ImageIcon icone = new ImageIcon(ico);
		Image im = icone.getImage().getScaledInstance(350, 250, Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(im);
		ima.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ima.setSize(400,350);
		ima.setResizable(false);
		ima.setLocationRelativeTo(null);
		ima.lblImage.setIcon(image);
		ima.setVisible(true);
	}
	public void confidentialiter(String num) {
		ConfidentialiterViews con = new ConfidentialiterViews();
		con.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con.setSize(500,500);
		con.setLocationRelativeTo(null);
		con.setResizable(false);
		con.textFieldCompte.setText(num);
		con.setVisible(true);
	}
	public void modifier(String com,ImageIcon ima,String lienImage,String nom,String pr,String LN,String cin,String ad,String c) {
		ModifierViews mod = new ModifierViews();
		mod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mod.setSize(400,700);
		mod.setLocationRelativeTo(null);
		mod.setResizable(false);
		mod.lblImage.setIcon(ima);
		mod.lbllienImage.setText(lienImage);
		mod.textFieldNumCompte.setText(com);
		mod.textFieldNom.setText(nom);
		mod.textFieldPrenom.setText(pr);
		mod.textFieldLieuNaissance.setText(LN);
		mod.textFieldCIN.setText(cin);
		mod.textFieldAdresse.setText(ad);
		mod.textFieldContact.setText(c);
		mod.setVisible(true);
		
	}
}
