package youtubeBis;


import junit.framework.TestCase;

import javax.naming.Context;
import javax.naming.NamingException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

import java.util.Properties;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class AllTests {
	
	private YoutubeService service;
	private static EJBContainer ejbContainer;
	
	@BeforeClass
    public static void startTheContainer() {
        ejbContainer = EJBContainer.createEJBContainer();
    }

    @Before
    public void lookupABean() throws NamingException {
    	System.out.println(ejbContainer.getContext().getNameInNamespace());
        Object object = ejbContainer.getContext().lookup("java:global/simple-stateless/YoutubeService");

        assertTrue(object instanceof YoutubeService);

        service = (YoutubeService) object;
    }

    @AfterClass
    public static void stopTheContainer() {
        if (ejbContainer != null) {
            ejbContainer.close();
        }
    }
    
    @Test
	public void tests() {
		/*final Properties p = new Properties();
        p.put("youtubeDatabase", "new://Resource?type=DataSource");
        p.put("youtubeDatabase.JdbcDriver", "org.hsqldb.jdbcDriver");
        p.put("youtubeDatabase.JdbcUrl", "jdbc:hsqldb:mem:bdd_youtube");
        final Context context = EJBContainer.createEJBContainer().getContext();
        System.out.println(context.getEnvironment());
        
        YoutubeService serv = (YoutubeService) context.lookup("java:global/classes/YoutubeService");*/
        Compte compte = service.creerCompte("Username","mdp","Nom","Prenom","my@adress.com","04/01/1998");
		
		
		assertEquals("Nom", compte.getNom());
		assertEquals("Prenom", compte.getPrenom());
		assertEquals("my@adress.com", compte.getMail());
		//assertEquals("04/01/1998", compte.getDateNaissance());
		System.out.println(compte.getID());
		
		
		Chaine chaine = compte.ajouterChaine("MaChaine");
		assertEquals(1, compte.getChaines().size());
		assertEquals("MaChaine", compte.getChaines().get(0).getNom());
		
		Video video = chaine.ajouterVideo("maVideo", "Sport","myurl");
		
		
		video.like();
		
//		compte.commenterVideo("videoURL", "monCommentaire");
//		Playlist playlist = compte.ajouterPlaylist("myFirstPlaylist");
//		playlist.add("videoURL");
	}
}
