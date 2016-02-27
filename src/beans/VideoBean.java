package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import DAO.MyDAO;
import youtubeBis.Categorie;
import youtubeBis.Video;

@ManagedBean
@SessionScoped
public class VideoBean implements Serializable{

	private List<Video> videos;
	
	private String categ = "";
	
	@PostConstruct
	public void init(){
		videos = new ArrayList<Video>();
		Video v = new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw");
		videos.add(v);
		
		EntityManager em = MyDAO.createEntityManager();
        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        Categorie c = new Categorie("MyCATEGORIE");
//        em.persist(c);
//        em.persist(v);	
// 
//        tx.commit();
        
        tx.begin();
        Query allCategQuery = em.createQuery("select d from Categorie d");
        List<Categorie> allCategs = allCategQuery.getResultList();
        Query allVideoQuery = em.createQuery("select d from Video d");
        List<Video> allVideos = allVideoQuery.getResultList();
        
        tx.commit();
        em.close();
        categ += allCategs.size();
        for(Video cat : allVideos) {
        	categ += "/"+cat.getName();
        }        
    }

	
	public void addVideo(){
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
	}
	
    public List<Video> getVideos() {
        return videos;
    }
    
    public String getCateg(){
    	return categ;
    }
	
}
