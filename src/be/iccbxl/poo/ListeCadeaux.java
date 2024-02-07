package be.iccbxl.poo;

import java.util.Arrays;

/**
 * Représente une liste de cadeaux et son auteur.
 * 
 * @author bolterys.valérie
 * @version 1.0
 * @since 1.8
 */
public class ListeCadeaux {
	/**
	 * L'auteur de la liste.
	 */
	private String auteur;
	
	/**
	 * La liste de cadeaux.
	 */
	private Cadeau[] cadeaux;
	
	/**
	 * Le nombre de cadeaux dans la liste.
	 */
	private byte nbCadeaux;
	
	/**
	 * Le nombre maximum de cadeaux dans la liste.
	 */
	public static final byte NB_MAX = 10;
	
	/**
	 * Créé un objet dans la liste de cadeaux en définissant son auteur.
	 * @param auteur L'auteur de la liste de cadeaux.
	 * @see NB_MAX
	 */
	public ListeCadeaux(String auteur) {
		this.setAuteur(auteur);
		this.cadeaux = new Cadeau[NB_MAX];
		this.nbCadeaux = 0;
	}

	/**
	 * Renvoie l'auteur de la liste de cadeaux.
	 * 
	 * @return L'auteur de la liste de cadeaux.
	 */
	public String getAuteur() {
		return auteur;
	}
	
	/**
	 * Modifie l'auteur de la liste de cadeaux.
	 * 
	 * @param auteur Le nouvel auteur de la liste de cadeaux.
	 */
	public void setAuteur(String auteur) {
		if(auteur == null || auteur.trim().equals("")) {
			auteur = "Auteur inconnu";
		}
		this.auteur = auteur;
	}

	/**
	 * Renvoie la liste de cadeaux.
	 * 
	 * @return La liste de cadeaux.
	 */
	public Cadeau[] getCadeaux() {
		return cadeaux;
	}

	/**
	 * Modifie la liste de cadeaux.
	 * 
	 * @param cadeaux La nouvelle liste de cadeaux.
	 */
	public void setCadeaux(Cadeau[] cadeaux) {
		this.cadeaux = cadeaux;
		
		nbCadeaux = 0;
		
		for(Cadeau c : cadeaux) {
			if(c != null) {
				nbCadeaux++;
			}
		}
	}

	/**
	 * Renvoie le nombre de cadeaux dans la liste.
	 * 
	 * @return Le nombre de cadeaux dans la liste.
	 */
	public byte getNbCadeaux() {
		return nbCadeaux;
			
	}
	
	/**
	 * Ajoute un cadeau dans la liste.
	 * 
	 * @param c Le cadeau à ajouter.
	 */
	public void ajouterCadeau(Cadeau c) {
		if(c != null) {
			c = cadeaux[nbCadeaux++];
		}
	}

	/**
	 * Renvoie le nombre maximum de cadeaux dans la liste.
	 * 
	 * @return Le nombre maximum de cadeaux dans la liste.
	 */
	public static byte getNbMax() {
		return NB_MAX;
	}

	/**
	 * Renvoie une représentation de la liste de cadeaux en présentant son auteur et le nombre de cadeaux 
	 * contenus dans celle-ci.
	 * 
	 * @return Une représentation de la liste de cadeaux.
	 */
	@Override
	public String toString() {
		//Liste de Bob (3 cadeaux)
		//Liste de Julia (1 cadeau)
		//Liste de Auteur inconnu (vide)
		
		StringBuilder sb = new StringBuilder("Liste de ");
		
		sb.append(auteur + " (");
		
		if(nbCadeaux > 1) {
			sb.append(nbCadeaux + " cadeaux)");
		} else if (nbCadeaux == 1) {
			sb.append(nbCadeaux + " cadeau)");
		} else {
			sb.append("vide)");
		}
		
		return sb.toString();
		
	}

	/**
	 * Supprime le cadeau fourni en paramètre de la liste de cadeaux.
	 * 
	 * @param c Le cadeau à supprimer
	 * @return true si le cadeau a été trouvé et supprimé sinon, false.
	 */
	public boolean retirerCadeau(Cadeau c) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Renvoie une nouvelle liste de cadeaux qui sont indiqués comme étant favoris dans la liste initiale.
	 * 
	 * @return Une liste de cadeaux indiqués comme favoris.
	 */
	public Cadeau[] rechercherFavoris() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Renvoie true si la liste de cadeaux est pleine, sinon false.
	 * 
	 * @return true si la liste est pleine, sinon false
	 * @see NB_MAX
	 */
	public boolean isListePleine() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
