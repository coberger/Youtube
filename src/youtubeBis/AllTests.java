package youtubeBis;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestCase;


public class AllTests extends TestCase {
	
	public void tests(){
		
		Compte compte = new Compte("Nom","Prenom","my@adress.com","04/01/1998");
		assertEquals("Nom", compte.getNom());
		assertEquals("Prenom", compte.getPrenom());
		assertEquals("my@adress.com", compte.getMail());
		//assertEquals("04/01/1998", compte.getDateNaissance());
		
		
		Chaine chaine = compte.ajouterChaine("MaChaine");
		assertEquals(1, compte.getChaines().size());
		assertEquals("MaChaine", compte.getChaines().get(0).getNom());
		
		/*Video video = chaine.ajouterVideo("maVideo", "Sport","myurl");
		
		
		compte.likeVideo("videoURL");
		
		compte.commenterVideo("videoURL", "monCommentaire");
		Playlist playlist = compte.ajouterPlaylist("myFirstPlaylist");
		playlist.add("videoURL");*/
	}
}
