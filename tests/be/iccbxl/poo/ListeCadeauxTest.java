package be.iccbxl.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListeCadeauxTest {
	
	private ListeCadeaux L1;
	private Cadeau livre;
	private Cadeau ordinateur;
	private Cadeau dvd;

	@BeforeEach
	void setUp() {
		L1 = new ListeCadeaux("Bob");
		livre = new Cadeau("Livre", 17.99);
		ordinateur = new Cadeau("Ordinateur", 599.45);
		dvd = new Cadeau("Dvd", 14.33);
		
		L1.ajouterCadeau(livre);
		L1.ajouterCadeau(ordinateur);
		L1.ajouterCadeau(dvd);
	}
	
	@Test
	void testToStringWithManyGifts() {
		//Préparation
		String str = "Liste de Bob (3 cadeaux)";
		
		//Vérification
		assertEquals(str, L1.toString());
	}
	
	@Test
	void testToStringWithOneGift() {
		//Préparation
		String str = "Liste de Julia (1 cadeau)";
		L1 = new ListeCadeaux("Julia");
		L1.ajouterCadeau(livre);
		//Vérification
		assertEquals(str, L1.toString());
	}
	
	@Test
	void testToStringWithoutGiftAndWithoutAuthor() {
		String str = "Liste de Auteur inconnu (vide)";
		L1 = new ListeCadeaux("");
		
		assertEquals(str, L1.toString());
	}
	
	@Test
	void testRetirerCadeauWithGiftFound() {
		boolean result = L1.retirerCadeau(livre);
		
		assertTrue(result);
	}

	@Test
	void testRetirerCadeauWithNoGiftFound() {
		Cadeau trotinette = new Cadeau("Trotinette", 399.99);
		
		boolean result = L1.retirerCadeau(trotinette);
		
		assertFalse(result);
	}
	
	@Test
	void testRechercherFavorisWithResults() {
		livre.setFavori(true);
		ordinateur.setFavori(false);
		dvd.setFavori(true);
		
		Cadeau[] liste = new Cadeau[L1.getNbMax()];
		liste[0] = livre;
		liste[1] = dvd;
		
		Cadeau[] favoris = L1.rechercherFavoris();
		
		assertArrayEquals(liste, favoris);
	}
	
	@Test
	void testRechercherFavorisWithNoResults() {
		livre.setFavori(false);
		ordinateur.setFavori(false);
		dvd.setFavori(false);
		
		Cadeau[] liste = new Cadeau[L1.getNbMax()];
		
		Cadeau[] favoris = L1.rechercherFavoris();
		
		assertArrayEquals(liste, favoris);
	}
	
	@Test
	void testIsListePleineWithNotFull() {
		
		boolean result = L1.isListePleine();
		
		assertFalse(result);
	}
	
	@Test
	void testIsListePleineWithFull() {
		Cadeau trotinette = new Cadeau("Trotinette", 399.99);
		L1.ajouterCadeau(trotinette);
		Cadeau smartphone = new Cadeau("Smartphone", 239.99);
		L1.ajouterCadeau(smartphone);
		Cadeau console = new Cadeau("Console", 279.99);
		L1.ajouterCadeau(console);
		Cadeau parfum = new Cadeau("Parfum", 84.99);
		L1.ajouterCadeau(parfum);
		Cadeau pull = new Cadeau("Pull", 29.50);
		L1.ajouterCadeau(pull);
		Cadeau lunettes = new Cadeau("Lunettes", 49.99);
		L1.ajouterCadeau(lunettes);
		Cadeau robe = new Cadeau("Robe", 59.99);
		L1.ajouterCadeau(robe);
		
		boolean result = L1.isListePleine();
		
		assertTrue(result);
	}
}
