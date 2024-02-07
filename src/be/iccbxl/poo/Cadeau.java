package be.iccbxl.poo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Représente un cadeau
 * 
 * @author bolterys.valérie
 * @version 1.0
 * @since 1.8
 */
public class Cadeau {
	/**
	 * La désignation du cadeau
	 */
	private String designation;
	
	/**
	 * Le prix du cadeau
	 */
	private double prix;
	
	/**
	 * Si le cadeau est favori
	 */
	private boolean favori;
	
	/**
	 * Créée un objet cadeau en lui donnant un nom, un prix et s'il est favori ou pas
	 * 
	 * @param designation La désignation du cadeau
	 * @param prix Le prix du cadeau
	 */
	public Cadeau(String designation, double prix) {
		this.setDesignation(designation);
		this.setPrix(prix);
		this.favori = false;
	}
	
	/**
	 * Renvoie la designation du cadeau
	 * 
	 * @return la désignation du cadeau
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * Modifie la désignation du cadeau
	 * 
	 * @param designation La nouvelle désignation du cadeau
	 */
	public void setDesignation(String designation) {
		if(designation == null || designation.trim().equals("")) {
			designation = "Nouveau cadeau";
		}
		this.designation = designation;
	}

	/**
	 * Renvoie le prix du cadeau
	 * 
	 * @return le prix du cadeau
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * Modifie le prix du cadeau
	 * 
	 * @param prix Le nouveau prix du cadeau
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * Renvoie true si le cadeau est en favori sinon false
	 * 
	 * @return si le cadeau est favori ou non
	 */
	public boolean isFavori() {
		return favori;
	}

	/**
	 * Modifie si le cadeau est favori ou non
	 * 
	 * @param favori Le nouvel état du cadeau
	 */
	public void setFavori(boolean favori) {
		this.favori = favori;
	}

	/**
	 * Renvoie une représentation du cadeau et son prix. Affiche aussi si le cadeau est favori. 
	 * 
	 * @return Une représentation d'un cadeau
	 */
	@Override
	//Livre (5.99 €) - favori
	//Nouveau cadeau (0.19 €)
	public String toString() {
		DecimalFormatSymbols dfSymb = new DecimalFormatSymbols(Locale.US);
		DecimalFormat df = new DecimalFormat("0.00",dfSymb);
		
		return designation + " (" + prix + " €)" + (favori ? " - favori" : "");
		
	}
	
	
	
	
	
}
