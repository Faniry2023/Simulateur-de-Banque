package cameraModifier;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

import pointEntrer.FenetreViews;
import views.modeClient.NouveauCompteViews;

public class Camera extends JFrame{
	public JLabel lblCompte;
	private JLabel cameraScreen;
	public boolean vis = false;
	private JButton btnCapture;
	private VideoCapture capture;
	private Mat image;
	public JButton btnAnnuler;
	private boolean clicked = false;
	public Camera() {
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(null);
		cameraScreen = new JLabel();
		cameraScreen.setBounds(0, 11, 640, 468);
		getContentPane().add(cameraScreen);
		
		lblCompte = new JLabel("");
		lblCompte.setBounds(9000, 506, 46, 14);
		getContentPane().add(lblCompte);
		
		btnCapture = new JButton("");
		ImageIcon icone = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\photo.png");
		Image imaIcc = icone.getImage();
		Image imscall = imaIcc.getScaledInstance(70, 65, Image.SCALE_SMOOTH);
		ImageIcon scalVr = new ImageIcon(imscall);
		btnCapture.setIcon(scalVr);
		btnCapture.setBounds(330, 480, 80, 40);
		getContentPane().add(btnCapture);
		
		btnAnnuler = new JButton("");
		ImageIcon icone2 = new ImageIcon("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\annuler.png");
		Image imaIcc2 = icone2.getImage();
		Image imscall2 = imaIcc2.getScaledInstance(10, 15, Image.SCALE_SMOOTH);
		ImageIcon scalVr2 = new ImageIcon(imscall2);
		btnAnnuler.setIcon(scalVr2);
		btnAnnuler.setBounds(232, 480, 75, 40);
		getContentPane().add(btnAnnuler);
		
		
		
		btnCapture.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clicked = true;
				Camera camera = new Camera();
				camera.setVisible(false);
			}
			
		});
		addWindowListener(new WindowAdapter() {
			
			public void WindowClosing(WindowEvent e) {
				super.windowClosing(e);
				capture.release();
				image.release();
				System.exit(0);
			}
		});
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640,560);
		this.setLocationRelativeTo(null);
		
		this.init();
	}
	//create camera
	public void startCamera() {
		capture = new VideoCapture(1);
		image = new Mat();
		byte[] imageData;
		ImageIcon icon;
		
		while(true) {
			//read image to matrix
			capture.read(image);
			
			//convert matrix to byte
			final MatOfByte buf = new MatOfByte();
			Imgcodecs.imencode(".jpg", image, buf);
			imageData = buf.toArray();
			//add to JLabel
			icon = new ImageIcon(imageData);
			cameraScreen.setIcon(icon);
			//capture and save to file
			if(clicked) {
				String name = this.lblCompte.getText();
				//String name = JOptionPane.showInputDialog(this,"entrer le nom de l'image");
				//String name = new SimpleDateFormat("yyyy-mm-dd-hh-mm--ss").format(new Date());
				/*if(name == null) {
					name = new SimpleDateFormat("yyyy-mm-dd-hh-mm--ss").format(new Date());
				}*/
				//write to file
				Imgcodecs.imwrite("images/"+name+".jpg",image);
				this.setVisible(false);
				FenetreViews fenetre = new FenetreViews();
				Image imageEnScal = icon.getImage().getScaledInstance(220, 170, Image.SCALE_SMOOTH);
				ImageIcon imageVrai  = new ImageIcon(imageEnScal);
				String li = "D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\images\\"+name+".jpg";
				fenetre.modifier(name, imageVrai, li, null, null, null, null, null, null);
				clicked = false;
				
			}
		}
	}
	
	public static void main(String[] args,String compte) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				Camera camera = new Camera();
				camera.lblCompte.setText(compte);
				camera.setVisible(true);
				//start camera in thread
				 new Thread(new Runnable() {

					@Override
					public void run() {
						camera.startCamera();
					}
					 
				 }).start();
			}
			
		});
		
	}
	public void init() {
		CameraController controlle = new CameraController(this);
		btnAnnuler.addActionListener(controlle);
	}
}
