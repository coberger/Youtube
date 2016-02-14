package youtubeBis;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import junit.framework.TestCase;


@Stateless
public class AllTests extends TestCase {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public void tests(){
		
		
		Compte compte = new Compte("Nom","Prenom","my@adress.com","04/01/1998");
		assertEquals("Nom", compte.getNom());
		assertEquals("Prenom", compte.getPrenom());
		assertEquals("my@adress.com", compte.getMail());
		//assertEquals("04/01/1998", compte.getDateNaissance());
		entityManager.persist(compte);
		System.out.println(compte.getID());
		
		
		Chaine chaine = compte.ajouterChaine("MaChaine");
		assertEquals(1, compte.getChaines().size());
		assertEquals("MaChaine", compte.getChaines().get(0).getNom());
		
		Video video = chaine.ajouterVideo("maVideo", "Sport","myurl");
		
		
		compte.likeVideo("videoURL");
		
		compte.commenterVideo("videoURL", "monCommentaire");
		Playlist playlist = compte.ajouterPlaylist("myFirstPlaylist");
		playlist.add("videoURL");
	}
}
